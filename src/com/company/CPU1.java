package com.company;

/**
 * Created by cadolph on 3/27/2018.
 */

import javax.smartcardio.Card;
import java.util.ArrayList;
        public class  CPU1 extends basePlayer {
            public CPU1(String Name) {
                super(Name);
            }


            public int CallRaiseFold(int amountNeededToCall) {
                call(amountNeededToCall);
                return(amountNeededToCall);
                }


            }


