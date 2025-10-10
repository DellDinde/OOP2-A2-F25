package com.champlain.oop2assignment3;

import java.util.Comparator;

/**
 * A comparator for card objects that prioritizes comparison by rank first.
 * <p>
 *     This class implements the comparator interface for Card objects.The primary comparison is between
 *     the ranks first. If they are equal, it then compares with the suits as a second criterion.
 * </p>
 */

public class RankFirstComparator implements Comparator<Card> {

    /**
     * Compares two card objects first by ranks, then by suit if ranks are equal.
     * @implSpec This implementation uses the ordinal() for both rank and suit comparison, meaning, the order
     * depends on the enumeration declaration.
     * @param card1 is the first card to be compared
     * @param card2 is the second card to be compared
     * @return a positive integer, zero or a negative integer as card1 is grater than, less than or equal to card2, respectively,
     * based on the rank first comparison logic.
     */
    @Override
    public int compare(Card card1, Card card2) {
        int compareRank = card1.getRank().ordinal() - card2.getRank().ordinal();

        if (compareRank != 0) {
            return compareRank;
        }
        return card1.getSuit().ordinal() - card2.getSuit().ordinal();
    }
}
