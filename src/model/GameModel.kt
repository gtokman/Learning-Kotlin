package model

/**
 * Created by gtokman1 on 9/4/16.
 */
class GameModel {
    val deck = Deck()
    var wastePile: MutableList<Card> = mutableListOf()
    val foundationPiles = arrayOf(
            FoundationPile(clubs), FoundationPile(diamonds),
            FoundationPile(hearts), FoundationPile(spades))

    val tableauPiles = Array(7, { TableauPile()})

}