//
//  EmojiMemoryView.swift
//  MemoryApp
//
//  Created by Ryan A Snell on 2/11/25.
//

import SwiftUI
import SwiftData

struct EmojiMemoryView: View {
    @ObservedObject var viewModel: EmojiMemoryGame
    
    private let aspectRatio: CGFloat = 2/3
    private let spacing: CGFloat = 4
    
    typealias Card = MemoryGame<String>.Card
        
    var body: some View {
        VStack{
            cards
                .foregroundColor(viewModel.color)
                .animation(.default, value: viewModel.cards)
            Button("Shuffle") {
                viewModel.shuffle()
            }
        }
        .padding()
    }// end body
    
    private var cards: some View {
        AspectVGrid(viewModel.cards, aspectRatio: aspectRatio) { card in
            CardView(card)
                .padding(spacing)
                .onTapGesture {
                    viewModel.choose(card)
                }// end gesture
        }// end AspectVGrid
    }// end cards
    
}// end struct

// for development to view in xcode
#Preview {
    EmojiMemoryView(viewModel: EmojiMemoryGame())
        .modelContainer(for: Item.self, inMemory: true)
}
