package com.champlain.oop2assignment3;

public interface ScoringStrategy{
    /**<p>
    ** Calculates the score of cards in the parameter {@code pCards}
     * </p>
     * */
    void calculateScore(CardCollection pCards);

    /**
     * Returns a score corresponding to the number of cards in a hand
     *
     * @return a score of type {@code int}.
     */
    int SimpleCountStrategy();

    /**
     * Returns a score corresponding to the number of Aces in a hand
     *
     * @return a score of type {@code int}.
     * */
    int NumberOfAcesStrategy();
}
