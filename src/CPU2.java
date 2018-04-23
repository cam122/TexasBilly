import com.company.Hand;
import com.company.basePlayer;

/**
 * Created by cadolph on 4/23/2018.
 */
public class CPU2 extends basePlayer  {
        public Hand playerCards;

        public CPU2(String Card1, String Card2, String Name) {
            super(Card1,Card2,Name);

            playerCards = new Hand();
        }

        public int CallRaiseFold(int amountNeededToCall) {
            call(amountNeededToCall);
            return(amountNeededToCall);
        }


    }

