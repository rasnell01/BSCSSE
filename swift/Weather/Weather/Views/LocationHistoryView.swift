//
//  LocationHistoryView.swift
//  Weather
//
//  Created by Ryan A Snell on 2/18/25.
//

import SwiftUI
import SwiftData

struct LocationHistoryView: View {
    @Environment(\.modelContext) private var modelContext
    @Query(sort: \SavedLocationModel.timestamp, order: .reverse) private var savedLocations: [SavedLocationModel]
    
    var body: some View {
        VStack {
            if savedLocations.isEmpty {
                Text(NSLocalizedString("No saved locations", comment: "Message when no locations are saved"))
                    .padding()
            } else {
                List {
                    ForEach(savedLocations) { location in
                        VStack(alignment: .leading) {
                            Text("Name: \(location.name)")
                                .font(.caption)
                            Text("Latitude: \(String(format: "%.2f", location.latitude))")
                            Text("Longitude: \(String(format: "%.2f", location.longitude))")
                            Text("Timestamp: \(location.timestamp)")
                            Text("Country: \(location.country)")
                            Text("Temperature: \(String(format: "%.1f", location.temp))°\(temperatureUnit())")
                            Text("Condition: \(location.condition)")
                        }
                        .padding(.vertical, 4)
                    }
                    .onDelete(perform: deleteLocation)
                }
            }
        }
        .navigationTitle(NSLocalizedString("Location History", comment: "Location History"))
    }// end body
    
    // Function to delete a saved location
    private func deleteLocation(at offsets: IndexSet) {
        for index in offsets {
            let locationToDelete = savedLocations[index]
            modelContext.delete(locationToDelete)
        }
        
        // Add this line to save the deletion
        try? modelContext.save()
    }// end func
    
    private func temperatureUnit() -> String {
        if (Locale.current.measurementSystem == .metric){
            return "C"
        } else {
            return "F"
        }
    }//end func
}// end struct
