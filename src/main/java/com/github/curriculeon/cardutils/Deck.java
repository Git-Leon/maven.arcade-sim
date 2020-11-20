package com.github.curriculeon.cardutils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Deck {
    private Stack<Card> cardList = new Stack<>();
    public Deck() {
        for(Rank rank : Rank.values()) {
            for(Suit suit : Suit.values()) {
                cardList.add(new Card(suit, rank));
            }
        }
    }

    public Card remove() {
        return cardList.pop();
    }

    public Card peek() {
        return cardList.peek();
    }

    public void add(Card card) {
        cardList.add(card);
    }


    public void shuffle() {
        Collections.shuffle(cardList);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cardList=" + cardList +
                '}';
    }
}
