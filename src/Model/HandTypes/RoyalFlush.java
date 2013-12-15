
package Model.HandTypes;

import Model.Hand;
import Model.Rank;

public class RoyalFlush extends HandType {

    public RoyalFlush() {
    }

    @Override
    public boolean check(Hand hand) {
        if (HandType.STRAIGHT_FLUSH.check(hand) && (Rank.ACE == hand.getHand().get(4).getRank())) return true;
        return false;
    }

    @Override
    public String toString() {
        return "RoyalFlush";
    }

    
}
