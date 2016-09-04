package model

import java.util.*

/**
 * Created by gtokman1 on 9/4/16.
 */
class Deck {

    val cards = Array(52, { Card(it % 13, getSuit(it)) })
    var cardsInDeck: MutableList<Card> = cards.toMutableList()

    fun drawCard(): Card = cardsInDeck.removeAt(0)

    fun reset() {
        cardsInDeck = cards.toMutableList()
        Collections.shuffle(cardsInDeck)
    }

    private fun getSuit(i: Int) = when (i / 13) {
        0 -> "Clubs"
        1 -> "Diamonds"
        2 -> "Hearts"
        else -> "Spades"
    }
}