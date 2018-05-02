package com.company;

import com.company.Main;

import java.util.Scanner;

/**
 * Created by cadolph on 3/27/2018.
 */
public class Player1 extends basePlayer{

    public Player1(String Name){
        super(Name);
    }
    public void CallRaiseFold(String input, int hisBet){
        if (input.equals("fold")){
            fold();
        } else if (input.equals("call")){
            call(hisBet);
        } else if (input.equals("raise")) {
            call(hisBet);
            raise(hisBet);
        }
    }
}
