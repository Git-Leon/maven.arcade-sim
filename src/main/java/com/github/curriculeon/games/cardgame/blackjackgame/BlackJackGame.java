package com.github.curriculeon.games.cardgame.blackjackgame;

import com.github.curriculeon.AnsiColor;
import com.github.curriculeon.GameInterface;
import com.github.curriculeon.IOConsole;
import com.github.curriculeon.PlayerInterface;
import com.github.curriculeon.cardutils.Card;

import java.util.StringJoiner;

public class BlackJackGame implements GameInterface {

    private BlackJackDealer dealer;

    public BlackJackGame() {
        this.dealer = new BlackJackDealer();
    }

    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void play() {
        String userInput;
        do {
            AnsiColor textColor = AnsiColor.BLUE;
            IOConsole ioConsole = new IOConsole(textColor);
            String userPrompt = new StringJoiner("\n")
                    .add("Welcome to the BlackJackGame")
                    .add("From here you can enter the following:")
                    .add("[ Bet, Quit ]")
                    .toString();
            userInput = ioConsole.getStringInput(userPrompt);
            if ("Bet".equalsIgnoreCase(userInput)) {
                ioConsole.println("The user bet");
            } else if ("print-dealer".equalsIgnoreCase(userInput)) {
                ioConsole.println(dealer.toString());
            } else {
                ioConsole.println("The user quit, cya!! Gotcho money");
            }
        } while (!"quit".equalsIgnoreCase(userInput));
    }
}
