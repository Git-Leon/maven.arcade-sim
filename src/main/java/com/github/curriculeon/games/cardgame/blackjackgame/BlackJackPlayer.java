package com.github.curriculeon.games.cardgame.blackjackgame;

import com.github.curriculeon.PlayerInterface;
import com.github.curriculeon.cardutils.Card;

import java.util.ArrayList;
import java.util.List;

public class BlackJackPlayer implements PlayerInterface {
    private List<Card> list;

    public BlackJackPlayer() {
        this(new ArrayList<>());
    }

    public BlackJackPlayer(List<Card> list) {
        this.list = list;
    }

    public void addCard(Card card) {
        list.add(card);
    }

    public void play() {

    }
}
