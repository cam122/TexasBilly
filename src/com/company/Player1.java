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
            while (x) {
                System.out.println("select amount to raise by.");
                int amount = Integer.parseInt(console.nextLine());
                if (amount < 5 || amount > money) {
                    System.out.println("invalid amount");
                }
                else if(amount >= 5 && amount <= money){
                    money = money-amount;
                    System.out.println("player 1 has raised by "+amount+" Dollers");
                    x = false;
                    yourBet = amount;
                    bet = true;
                }
            }
            x = true;
        }
    }
    public void counter(String input, int hisBet){
        if (input.equals("fold")){
            System.out.println("fold");
            inGame = false;

        } else if (input.equals("call")){
            call(hisBet);
        } else if (input.equals("raise")) {
            while (x) {
                System.out.println("select amount to raise by.");
                int amount = Integer.parseInt(console.nextLine());
                if (amount < hisBet || amount > money) {
                    System.out.println("invalid amount");
                }
                else if(amount >= hisBet && amount <= money){
                    money = money-amount;
                    System.out.println("player 1 has raised by "+amount+" Dollers");
                    x = false;
                    yourBet = amount;
                    bet = true;
                }
            }
            x = true;
        }
    }
    public boolean inGame(){
        return inGame;
    }
    public void endBet(){
        bet = false;
    }
}
