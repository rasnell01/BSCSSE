//
//  Cardify.swift
//  MemoryApp
//
//  Created by Ryan A Snell on 2/19/25.
//

import SwiftUI

struct Cardify: ViewModifier {
    let isFaceUp: Bool
    
    func body(content: Content) -> some View {
        ZStack{
            let base = RoundedRectangle(cornerRadius: Constants.cornerRadius)
            
            Group {
                base.fill(.blue)
                base.strokeBorder(Color.black, lineWidth: Constants.lineWidth)
                content
            }
                .opacity(isFaceUp ? 1 : 0)
            base.fill(Color.orange)
                .opacity(isFaceUp ? 0 : 1)
        }// end zstack
        
    }// end body
    
    // Constatnts
    private struct Constants {
        static let cornerRadius: CGFloat = 20
        static let lineWidth: CGFloat = 4
    }// end struct

}// end struct

extension View {
    func cardify(isFaceUp: Bool) -> some View {
        modifier(Cardify(isFaceUp: isFaceUp))
    }
}
