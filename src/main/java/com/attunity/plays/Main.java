package com.attunity.plays;

public class Main {

    private static final int MAX_NUMBER_OF_GUESS_GAME  = 5;
    public static void main(String[] args) {
        System.out.println("Guess game: enter your guess, try to find the number with the minimum guesses");

        new Game(MAX_NUMBER_OF_GUESS_GAME).run();
    }
}
