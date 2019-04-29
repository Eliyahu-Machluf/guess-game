package com.attunity.plays;

import static org.junit.Assert.*;

public class GameTest {

    @org.junit.Test
    public void run() {
        Game game = new Game(8);
        System.out.println("secret is " + game.getSecretNumber());
        //todo - add mock to user interactions class.
    }
}