package com.company;

/**
 * Created by cadolph on 3/27/2018.
 */

import javax.smartcardio.Card;
import java.util.ArrayList;
        public class  CPU1 {

            private int money;
            public  Hand playerCards;

            public CPU1(int startmoney) {
                money = startmoney;

                playerCards = new Hand();
            }

            /*
      returns a number: 0 means call
      -1 means fold
      positive number is amount raised by
      */
            public int CallRaiseFold(int amountNeededToCall) {
                return 0;
            }




}

