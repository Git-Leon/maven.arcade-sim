package com.github.curriculeon;

import com.github.curriculeon.games.cardgame.blackjackgame.BlackJackGame;

import java.util.StringJoiner;

public class Arcade implements Runnable {
    IOConsole console = new IOConsole();

    @Override
    public void run() {
        String gameSelection;
        do {
            gameSelection = getGameSelection();
            if ("numberguess".equalsIgnoreCase(gameSelection)) {
                new NumberGuessGame().play();
            } else if ("slots".equalsIgnoreCase(gameSelection)) {
            } else if ("blackjack".equalsIgnoreCase(gameSelection)) {
                new BlackJackGame().play();
            }
        } while (!"quit".equalsIgnoreCase(gameSelection));
    }

    private String getGameSelection() {
        return console.getStringInput(new StringJoiner("\n")
                .add("Welcome to my arcade")
                .add("From here you can select any of the following:")
                .add("[ NumberGuess, Slots, BlackJack ]")
                .toString());
    }
}
