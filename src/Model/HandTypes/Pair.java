
package Model.HandTypes;

import Model.Hand;

public class Pair extends HandType {

    public Pair() {
    }

    @Override
    public boolean check(Hand hand) {
        for (int i = 0; i < hand.getHand().size(); i++) {
            if(hand.getHand().get(i) == hand.getHand().get(i+1)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pair";
    }

}
