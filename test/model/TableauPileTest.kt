package model

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by gtokman1 on 9/4/16.
 */
class TableauPileTest {

    @Test
    fun addCards() {

        // Arrange
        val tableauPile = TableauPile(mutableListOf(Card(12, spades)))
        var cards = mutableListOf(Card(11, hearts))

        // Act
        tableauPile.addCards(cards)

        // Assert
        assertEquals(2, tableauPile.cards.size)

    }

    @Test
    fun removeCards() {
        // Arrange
        val tableauPile = TableauPile(mutableListOf(Card(4, clubs), Card(3, diamonds), Card(2, spades)))

        // Act
        tableauPile.removeCards(1)

        // Assert
        assertEquals(mutableListOf(Card(4, clubs, true)), tableauPile.cards)

    }

}