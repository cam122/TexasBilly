package com.company;

/**
 * Created by cadolph on 3/27/2018.
 */

import javax.smartcardio.Card;
import java.util.ArrayList;
        public class  CPU1 extends basePlayer {


            public  Hand playerCards;

            public CPU1(String Card1, String Card2, String Name) {
super(Card1,Card2,Name);

                playerCards = new Hand();
            }


            public int CallRaiseFold(int amountNeededToCall) {
                call(amountNeededToCall);
            }




}

