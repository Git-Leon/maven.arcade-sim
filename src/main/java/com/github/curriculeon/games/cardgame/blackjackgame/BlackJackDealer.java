package com.github.curriculeon.games.cardgame.blackjackgame;

import com.github.curriculeon.cardutils.Card;
import com.github.curriculeon.cardutils.Deck;

import java.util.ArrayList;
import java.util.List;

public class BlackJackDealer {
    private Deck deck;

    public BlackJackDealer() {
        this(new Deck());
    }

    public BlackJackDealer(Deck deck) {
        this.deck = deck;
    }

    public void deal(BlackJackPlayer player) {
        Card card = deck.remove();
        player.addCard(card);
    }

    @Override
    public String toString() {
        return "BlackJackDealer{" +
                "deck=" + deck +
                '}';
    }
}
