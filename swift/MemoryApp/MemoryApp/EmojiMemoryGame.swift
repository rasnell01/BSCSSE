//
//  EmojiMemoryGame.swift
//  MemoryApp
//
//  Created by Ryan A Snell on 2/17/25.
//

import SwiftUI

class EmojiMemoryGame: ObservableObject {
    typealias Card = MemoryGame<String>.Card
    private static let emojis = ["👻", "💀", "👹", "👽","👺", "🧙", "🎃", "🤡", "🦇","😺","🕷️","🤖"]
    
    private static func createMemoryGame() -> MemoryGame<String> {
        return MemoryGame(numberOfPairsOfCards: 2) { pairIndex in
            if emojis.indices.contains(pairIndex) {
                return emojis[pairIndex]
            } else {
                return "😬"
            }
            
        }
    }// end static func
    
    @Published private var model = createMemoryGame()
    
    
    var cards: [Card] {
        model.cards
    }// end var
    
    var color: Color {
        .orange
    }
    
    // MARK: - Intents
    
    func shuffle() {
        model.shuffle()
    }
    
    func choose(_ card: Card) {
        model.choose(card)
    }// end func
    
}// end class
