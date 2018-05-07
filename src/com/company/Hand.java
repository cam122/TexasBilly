package com.company;

import java.util.ArrayList;

/**
 * Created by mdinki on 4/16/2018.
 */
public class Hand {
    ArrayList<card> playerCards;
    ArrayList<card> allCards;
    int highCard;
    private ArrayList<card> clubs;
    private ArrayList<card> hearts;
    private ArrayList<card> spades;
    private ArrayList<card> diamonds;
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
    public int DetermineBestHand (){
        //initialize 4 lists (one for each suit)
        clubs = new ArrayList<>();
        hearts = new ArrayList<>();
        spades = new ArrayList<>();
        diamonds = new ArrayList<>();
        //go through allCards and add each to corresponding suit
        for (int i =0; i <allCards.size(); i++) {
            if (allCards.get(i).GetSuit().equals("clubs")) {
                clubs.add(allCards.get(i));
            }
            if (allCards.get(i).GetSuit().equals("spades")) {
                spades.add(allCards.get(i));
            }
            if (allCards.get(i).GetSuit().equals("hearts")) {
                hearts.add(allCards.get(i));
            }
            if (allCards.get(i).GetSuit().equals("diamonds")) {
                diamonds.add(allCards.get(i));
            }
        }




    }

    //assumes that this is called from DetermineBestHand


    //Do we have royal flush


    //Do we have straight flush


    //do we have 4 of a kind


    //do we have full house


    //do we have a flush
    private boolean hasFlush(){
        if (clubs.size() >= 5){
            return true;
        }

        return false;
    }

    //do we have a straight


    //do we have 3 of a kind


    //do we have 2 pair


    //do we have a pair


    //what is high card

}
