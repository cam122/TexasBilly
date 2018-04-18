package com.company;

/**
 * Created by cadolph on 3/27/2018.
 */

import javax.smartcardio.Card;
import java.util.ArrayList;
        public class  CPU1 extends basePlayer {


            public  Hand playerCards;

            public CPU1() {


                playerCards = new Hand();
            }


            public int CallRaiseFold(int amountNeededToCall) {
                call(amountNeededToCall);
            }




}

