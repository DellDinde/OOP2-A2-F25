package com.champlain.oop2assignment3;

import java.util.Comparator;

public class SuitFirstComparator implements Comparator<Card> {
    public int compare(Card card1, Card card2) {
        int compareSuit = card1.getSuit().ordinal() - card2.getSuit().ordinal();

        if (compareSuit != 0) {
            return compareSuit;
        }
        return card1.getRank().ordinal() - card2.getRank().ordinal();
    }
}
