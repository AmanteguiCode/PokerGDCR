
package Model.HandTypes;

import Model.HandType;
import Model.Hand;

public class FullHouse extends HandType {

    public FullHouse() {
    }

    @Override
    public boolean check(Hand hand) {
        return (hand.getHand().get(1).getRank() == hand.getHand().get(2).getRank()) ? checkThreeAndPair(hand) : checkPairAndThree(hand);
    }

    private boolean checkThreeAndPair(Hand hand) {
        if((hand.getHand().get(0).getRank() != hand.getHand().get(1).getRank()) || (hand.getHand().get(0).getRank() != hand.getHand().get(2).getRank())) 
            return false;
        if(hand.getHand().get(3).getRank() != hand.getHand().get(4).getRank()) return false;
        return true;
    }

    private boolean checkPairAndThree(Hand hand) {
        if(hand.getHand().get(0).getRank() != hand.getHand().get(1).getRank()) return false;
        if((hand.getHand().get(2).getRank() != hand.getHand().get(3).getRank()) || (hand.getHand().get(2).getRank() != hand.getHand().get(4).getRank())) 
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "FullHouse";
    }
    

}
