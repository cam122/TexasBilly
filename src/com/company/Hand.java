package com.company;

import java.util.ArrayList;

/**
 * Created by mdinki on 4/16/2018.
 */
public class Hand {
    ArrayList<card> playerCards;

    int highCard;

    public Hand() {
        highCard = 0;

        playerCards = new ArrayList<>();
    }
    //getValues of hand (return list of cards)
    public ArrayList<card> getPlayerCards() {
        return playerCards ;
    }


    //add card to hand(add "Card" to the list of cards)
    public void addCards (card newCard) {
        playerCards.add(newCard);
        //check if it is new high card
        if (highCard < newCard.GetValue()){
            highCard = newCard.GetValue();
        }
    }

    //determine best hand from hand and board (requires list of cards that represent the board)
}
