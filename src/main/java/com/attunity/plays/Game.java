package com.attunity.plays;

import java.util.Random;

public class Game {
    private int secret;
    private UserInteraction userInteraction;

    public Game(int maxNumber){
        Random random = new Random();
        secret = random.nextInt(maxNumber+1);
        System.out.println("Secret is " + secret );
        userInteraction = new UserInteraction(maxNumber);
    }

    public int getSecretNumber(){
        return secret;
    }

    private enum GuessStatus{
        SMALLER,
        LARGER,
        MATCH
    };

    private GuessStatus tryGuess(int guess){
        if ( guess > secret )
            return GuessStatus.LARGER;
        else if( guess < secret )
            return GuessStatus.SMALLER;
        return GuessStatus.MATCH;
    }

    public int run(){
        int guess;
        int triesCounter = 0;
        GuessStatus status;
        do {
            guess = userInteraction.readNumber();
            System.out.println("User try: " + guess );
            triesCounter++;
            status = tryGuess(guess);
            switch( status ){
                case LARGER:
                    System.out.println(guess + " is larger than secret number" );
                    break;
                case SMALLER:
                    System.out.println(guess + " is smaller than secret number" );
                    break;
                case MATCH:
                    System.out.println("Secret number was found!" + " you've used " + triesCounter + " tries");
                    userInteraction.gameFinished(triesCounter);
                    break;
            }
        }while( status != GuessStatus.MATCH );
        return triesCounter;
    }
}
