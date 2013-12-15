
package Model.HandTypes;

import Model.Hand;


public class FourOfAKind extends HandType {

    public FourOfAKind() {
    }

    @Override
    public boolean check(Hand hand) {
        return (hand.getHand().get(0).getRank() == hand.getHand().get(1).getRank() ) ? checkRoyalFlush(0, hand) : checkRoyalFlush(1, hand);
    }

    private boolean checkRoyalFlush(int i, Hand hand) {
        for (int j = i; i < i+4; j++) 
            if(hand.getHand().get(i).getRank() != hand.getHand().get(j).getRank()) return false;
        return true;
    }
}
