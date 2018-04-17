package com.company;

import java.util.Scanner;

/**
 * Created by rsipher1 on 4/16/2018.
 */
public class basePlayer extends Player1 {
    int money = 50;
    int yourBet = 0;
    boolean bet = false;
    String card1;
    String card2;
    boolean x = true;
    boolean inGame = true;
    Scanner console = new Scanner(System.in);
    public basePlayer(String Card1, String Card2){
        card1 = Card1;
        card2 = Card2;
    }
}
