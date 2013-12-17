
package Model.HandTypes;

import Model.HandType;
import Model.Hand;

public class StraightFlush extends HandType {

    public StraightFlush() {
    }

    @Override
    public boolean check(Hand hand) {
        return (HandType.FLUSH.check(hand) && HandType.STRAIGHT.check(hand));
    }

    @Override
    public String toString() {
        return "StraightFlush";
    }
    
    

}
