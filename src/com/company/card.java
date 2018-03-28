package com.company;

import java.util.ArrayList;

/**
 * Created by mdinki on 3/28/2018.
 */

    public class card {
        public int value;
        public String suit;
        public String displayValue;
        public ArrayList<String> suitList;

        public card(int Value, String Suit) {
            suitList = new ArrayList<String>();
            suitList.add("clubs");
            suitList.add("spades");
            suitList.add("hearts");
            suitList.add("diamonds");
            if (Value > 1 && Value < 14) {
                value = Value;
                if (value == 11) {
                    displayValue = "J";
                } else if (value == 12) {
                    displayValue = "Q";
                } else if (value == 13) {
                    displayValue = "K";
                } else if (value == 14) {
                    displayValue = "A";
                }
            } else {
                value = 0;
            }

            if (suitList.contains(Suit.toLowerCase())) {
                suit = Suit.toLowerCase();
            }
                suit = null;

        }

        public int GetValue()
        {
            return value;
        }
        public String GetDisplayValue()
        {
            return displayValue;
        }
        public String GetSuit()
        {
            return suit;
        }
        public String GetCardName()
        {
            return displayValue + " of "+suit;
        }
    }


