//
//  CardView.swift
//  MemoryApp
//
//  Created by Ryan A Snell on 2/19/25.
//

import SwiftUI

struct CardView: View {
    typealias Card = MemoryGame<String>.Card
    let card: Card
    
    init(_ card: Card) {
        self.card = card
    }
        
    var body: some View {
        Pie(endAngle: .degrees(240))
            .opacity(Constants.Pie.opacity)
            .overlay(
                Text(card.content)
                    .font(.system(size: Constants.FontSize.largest))
                    .minimumScaleFactor(Constants.FontSize.scaleFactor)
                    .multilineTextAlignment(.center)
                    .aspectRatio(1, contentMode: .fit)
                    .padding(Constants.Pie.inset)
            )
            .padding(Constants.inset)
            .cardify(isFaceUp: card.isFaceUp)
            .opacity(card.isFaceUp || !card.isMatched ? 1 : 0)
    }// end body
    
    // Constants
    private struct Constants {
        static let inset: CGFloat = 5
        struct FontSize {
            static let largest: CGFloat = 200
            static let smallest: CGFloat = 10
            static let scaleFactor = smallest / largest
        }
        struct Pie {
            static let opacity: CGFloat = 0.5
            static let inset: CGFloat = 5
        }
    }// end custom Constants
}// end struct


// for development to view in xcode
struct CardView_Previews: PreviewProvider {
    typealias Card = CardView.Card
    static var previews: some View {
        VStack {
            HStack {
                CardView(Card(content: "X", id: "test1"))
                CardView(Card(isFaceUp: true, content: "A", id: "test1"))
            }
            HStack {
                CardView(Card(content: "X", id: "test1"))
                CardView(Card(isFaceUp: true, content: "A", id: "test1"))
            }
        }
            .padding()
            .foregroundColor(.white)
    }
}
