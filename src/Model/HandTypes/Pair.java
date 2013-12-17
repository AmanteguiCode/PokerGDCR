
package Model.HandTypes;

import Model.HandType;
import Model.Card;
import Model.Hand;

public class Pair extends HandType {

    public Pair() {
    }

    @Override
    public boolean check(Hand hand) {
        for (int i = 0; i < 5; i++) 
            if(checkPair(hand.getHand().get(i), hand)) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Pair";
    }

    private boolean checkPair(Card card, Hand hand) {
        for (int i = 0; i < hand.getHand().size(); i++) 
            if((card.getRank() == hand.getHand().get(i).getRank()) && (card != hand.getHand().get(i))) return true;
        return false;
    }

}
