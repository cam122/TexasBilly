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
    String name;
    Scanner console = new Scanner(System.in);
    public basePlayer(String Card1, String Card2, String Name){
        card1 = Card1;
        card2 = Card2;
        name = Name;
    }
    public void check(){
        System.out.println("check");
    }
    public void raise(int hisBet){
        while (x) {
            int amount = selection();
            if (amount < 5 || amount > money) {
                System.out.println("invalid amount");
            }
            else if(amount >= 5 && amount <= money){
                money = money-amount;
                System.out.println(name + " has raised by "+amount+" Dollers");
                x = false;
                yourBet = hisBet + amount;
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
        money = money - hisBet;
    }
    public int selection(){
        System.out.println("select amount to raise by.");
        int amount = Integer.parseInt(console.nextLine());
        return amount;
    }
    public boolean inGame(){
        return inGame;
    }
    public void endBet(){
        bet = false;
        yourBet = 0;
    }
    public boolean bet() { return bet; }
}
