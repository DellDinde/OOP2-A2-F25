package com.champlain.oop2assignment3;

import java.util.Comparator;

public class RankFirstComparator implements Comparator<Card> {

    public int compare(Card card1, Card card2) {
        int compareRank = card1.getRank().ordinal() - card2.getRank().ordinal();

        if (compareRank != 0) {
            return compareRank;
        }
        return card1.getSuit().ordinal() - card2.getSuit().ordinal();
    }
}
