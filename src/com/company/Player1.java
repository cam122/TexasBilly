package com.company;

import com.company.Main;

/**
 * Created by cadolph on 3/27/2018.
 */
public class Player1 extends Main {
    int money = 50;
    String card1;
    String card2;
    public Player1(String Card1, String Card2){
        card1 = Card1;
        card2 = Card2;
    }
    public void action(String input){
        if (input.equals("check")){
            check();
        } else if
    }
    public void check(){
        System.out.println("check");
    }
}
