
package Model.HandTypes;

import Model.Card;
import Model.Hand;

public class Pair extends HandType {

    public Pair() {
    }

    @Override
    public boolean check(Hand hand) {
        for (Card card : hand.getHand()) 
            if(hasPair(card, hand)) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Pair";
    }

    private boolean hasPair(Card card, Hand hand) {
        return true;
    }


}
