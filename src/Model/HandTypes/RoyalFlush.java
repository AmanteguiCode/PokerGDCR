
package Model.HandTypes;

import Model.HandType;
import Model.Hand;
import Model.Rank;

public class RoyalFlush extends HandType {

    public RoyalFlush() {
    }

    @Override
    public boolean check(Hand hand) {
        return (HandType.STRAIGHT_FLUSH.check(hand) && hand.getHand().get(4).getRank() == Rank.ACE);
    }

    @Override
    public String toString() {
        return "RoyalFlush";
    }

    
}
