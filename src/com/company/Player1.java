package com.company;

import com.company.Main;

import java.util.Scanner;

/**
 * Created by cadolph on 3/27/2018.
 */
public class Player1 extends Main {
    int money = 50;
    String card1;
    String card2;
    boolean x = true;
    Scanner console = new Scanner(System.in);
    public Player1(String Card1, String Card2){
        card1 = Card1;
        card2 = Card2;
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
                }
            }
            x = true;
        }
    }
    public void check(){
        System.out.println("check");
    }
}
