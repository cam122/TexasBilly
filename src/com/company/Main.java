package com.company;

public class Main {

    public static void main(String[] args) {
CPU1 name = new CPU1();
//    shuffle cards
card example = new card(2, "Spades");

        System.out.println(example.toString());
        example.setNumber(14);
        example.setSuit(("Hearts"));
        System.out.println(example.getNumber() + " of " + example.getSuit());
//    deal two cards to everyone
name.playerCards.addCards(new card(5,"hearts"));
        //play of hand
//    If the first or second com.company.card dealt is exposed, then this is considered a misdeal. The dealer then retrieves the com.company.card, reshuffles the deck, and again cuts the cards

//    However, if any other hole com.company.card is exposed due to a dealer error, the deal continues as usual.

//     A misdeal is also declared if a player receives more than two hole cards by mistake

        //misdeal

//     The small blind is posted by the player to the left of the dealer and is usually equal to half of the big blind

//The big blind, posted by the player to the left of the small blind, is equal to the minimum bet.

//pre-flop" betting round, beginning with the player to the left of the big blind (or the player to the left of the dealer

//players keep bettin untill every player folds or puts all chips in

//blinds are considered "live" in the pre-flop betting round, meaning that they are counted toward the amount that the blind player must contribute

//     all players can check or raise

        //beating
// The minimum raise is equal to the size of the previous bet or raise. If someone wishes to re-raise, they must raise at least the amount of the previous raise.

//players may bet or raise any amount over the minimum raise up to all of the chips the player has at the table (called an all-in bet).

//      the blind/ante structure periodically increases as the tournament progresses

//    After one round of betting is done, the next betting round will start by the person in the small blind.

//    After the pre-flop betting round, assuming there remain at least two players taking part in the hand, the dealer deals a flop, three face-up cards.


    }
}
