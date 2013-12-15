
package Model.HandTypes;

import Model.Card;
import Model.Hand;

public class TwoPairs extends HandType {

    public TwoPairs() {
    }

    @Override
    public boolean check(Hand hand) {
        int pairs = 0;
        for (int i = 0; i < hand.getHand().size(); i++) 
            if(hasPair(hand, i)) pairs++;
        if (pairs >= 2) return true;
        return false;
    }

    private boolean hasPair(Hand hand, int i) {
        for (int j = i+1; j < hand.getHand().size(); j++) 
            if(hand.getHand().get(i).getRank() == hand.getHand().get(j).getRank()) return true;
        return false;
    }

}
