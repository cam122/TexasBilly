package com.company;

import com.company.Main;

import java.util.Scanner;

/**
 * Created by cadolph on 3/27/2018.
 */
public class Player1 extends basePlayer{

    public Player1(String Card1, String Card2){
        super(Card1,Card2);
    }
    public void action(String input){
        if (input.equals("check")){
            check();
        } else if (input.equals("raise")) {
            raise();
        }
    }
    public void counter(String input, int hisBet){
        if (input.equals("fold")){
            fold();
        } else if (input.equals("call")){
            call(hisBet);
        } else if (input.equals("raise")) {
            raise1(hisBet);
        }
    }
    public boolean inGame(){
        return inGame;
    }
    public void endBet(){
        bet = false;
    }
}
