package com.company;

import javax.smartcardio.Card;

/**
 * Created by mdinki on 4/17/2018.
 */
public class board {
    public Card[] board = new Card[5];
    public Card[] burnCards = new Card[3];

    public int boardCardsUsed = 0;
    public int burnCardsUsed = 0;

    //methods
    public void addBoardCard(Card card){
        this.board[boardCardsUsed++] = card;
    }

    public void addBurnCard(Card card){
        this.burnCards[burnCardsUsed] = card;
    }
}
