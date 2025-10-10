package com.champlain.oop2assignment3;

import java.util.Comparator;

/**
 * A comparator for card objects that prioritizes comparison by suit first.
 * <p>
 *     This class implements the comparator interface for Card objects.The primary comparison is between
 *     the suit first, if they are equal, it then compares with the rank as a second criterion.
 * </p>
 */

public class SuitFirstComparator implements Comparator<Card> {
    /**
     * Compares two card objects first by suit, then by rank if suit is equal.
     * @implSpec This implementation uses the ordinal() for both rank and suit comparison, meaning, the order
     * depends on the enumeration declaration.
     * @param card1 is the first card to be compared
     * @param card2 is the second card to be compared
     * @return a positive integer, zero or a negative integer as card1 is grater than, less than or equal to card2, respectively,
     * based on the suit first comparison logic.
     */
    @Override
    public int compare(Card card1, Card card2) {
        int compareSuit = card1.getSuit().ordinal() - card2.getSuit().ordinal();

        if (compareSuit != 0) {
            return compareSuit;
        }
        return card1.getRank().ordinal() - card2.getRank().ordinal();
    }
}
