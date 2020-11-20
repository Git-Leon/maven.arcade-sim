package com.github.curriculeon.cardutils;

public enum Suit {
    SPADE("♠"),
    HEART("♥"),
    CLUBS("♣"),
    DIAMONDS("♦");

    private final String graphic;

    Suit(String graphic) {
        this.graphic = graphic;
    }

    @Override
    public String toString() {
        return this.graphic;
    }
}
