package com.company;

import javax.smartcardio.Card;

/**
 * Created by mdinki on 4/17/2018.
 */
public class board {
    private Card[] board = new Card[5];
    private Card[] burnCards = new Card[3];

    //constructor
    public Board(){
    }

    //methods
    protected void setBoardCard(Card card, int cardNum){
        this.board[cardNum] = card;
    }

    protected Card getBoardCard(int cardNum){
        return this.board[cardNum];
    }

    protected void setBurnCard(Card card, int cardNum){
        this.burnCards[cardNum] = card;
    }

    protected Card getBurnCard(int cardNum){
        return this.burnCards[cardNum];
    }

    protected int boardSize(){
        return board.length;
    }

    protected void printBoard(){
        System.out.println("The board contains the following cards:");
        for(int i =0; i<board.length;i++){
            System.out.println(i+1 + ": " + getBoardCard(i).printCard());

        }
        System.out.println("\n");
}
