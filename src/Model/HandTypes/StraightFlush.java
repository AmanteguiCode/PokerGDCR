
package Model.HandTypes;

import Model.HandType;
import Model.Hand;

public class StraightFlush extends HandType {

    public StraightFlush() {
    }

    @Override
    public boolean check(Hand hand) {
        if(HandType.STRAIGHT.check(hand) && HandType.FLUSH.check(hand)) return true;
        return false;
    }

    @Override
    public String toString() {
        return "StraightFlush";
    }
    
    

}
