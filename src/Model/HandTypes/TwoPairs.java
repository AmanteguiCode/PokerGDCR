
package Model.HandTypes;

import Model.HandType;
import Model.Card;
import Model.Hand;

public class TwoPairs extends HandType {

    public TwoPairs() {
    }

    @Override
    public boolean check(Hand hand) {
        int Pairs = 0;
        for (int i = 0; i < 4; i++) 
            if(hand.getHand().get(i).getRank() == hand.getHand().get(i+1).getRank()) Pairs++;
        if(Pairs >= 2) return true;
        return false;
    }
    
    @Override
    public String toString() {
        return "TwoPairs";
    }

    
}
