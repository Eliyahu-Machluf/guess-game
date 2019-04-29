package com.attunity.plays;

import javax.swing.*;
import java.awt.*;

public class UserInteraction {
    private int maxNumber;

    public UserInteraction(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int readNumber(){
        String input = JOptionPane.showInputDialog("Please enter your number (max number is " + maxNumber + ")" );
        int val = Integer.parseInt(input);
        return val;
    }

    public void gameFinished( int numberOfTries ){
        JOptionPane.showMessageDialog(null,"You've found the number with " + numberOfTries + " tries", "Game Finished", JOptionPane.INFORMATION_MESSAGE );
    }
}
