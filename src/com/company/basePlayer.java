package com.company;

import java.util.Scanner;

/**
 * Created by rsipher1 on 4/16/2018.
 */
public class basePlayer{
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
    public void check(){
        System.out.println("check");
    }
    public void raise(){
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
    public void fold(){
        System.out.println("fold");
        inGame = false;
    }
    public void call(int hisBet) {
        System.out.println("call");
        money = money - hisBet;
    }
    public void raise1(int hisBet){
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
