package com.champlain.oop2assignment3;

import java.util.Objects;

/**
 * Represents a playing card with a specific suit and rank.
 * @implNote This class is immutable, meaning that once a card is created, its suit and rank cannot be changed.
 */
public class Card {
    /**
     * The suit of this card (e.g., Hearts, Diamonds, Clubs, Spades).
     */
    private final Suit aSuit;

    /**
     * The rank of this card (e.g., Ace, 2, 3, ..., King).
     */
    private final Rank aRank;

    /**
     * Constructs a new Card with the specified rank and suit.
     *
     * @param pRank the rank of the card (e.g., Ace, 2, 3, ..., King)
     * @param pSuit the suit of the card (e.g., Hearts, Diamonds, Clubs, Spades)
     */
    public Card (Rank pRank, Suit pSuit) {
        this.aRank = pRank;
        this.aSuit = pSuit;
    }

    /**
     * Returns the rank of this card.
     *
     * @return the rank of the card
     */
    public Rank getRank() {
        return this.aRank;
    }

    /**
     * Returns the suit of this card.
     *
     * @return the suit of the card
     */
    public Suit getSuit() {
        return this.aSuit;
    }

    /**
     * Returns a string representation of this card.
     *
     * @return a string in the format "Rank of Suit" (e.g., "Ace of Hearts")
     */
    @Override
    public String toString() {
        return this.getRank() + " of " + this.getSuit();
    }

    /**
     * Show if the cards is equal if they have the same rank and the same suit.
     *
     * @param obj the object to compare with card
     * @return Equal if rank and suit match otherwise no
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Card)) return false;
        Card comparedCard = (Card) obj;
        return this.aRank == comparedCard.aRank && this.aSuit == comparedCard.aSuit;
    }

    /**
     *Card that are equal have the same hash code
     *
     * @return a number based on the card rank and suit
     */
    @Override
    public int hashCode() {
        return Objects.hash(aRank, aSuit);
    }


}
