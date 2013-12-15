package Model.HandTypes;

import Model.Hand;
import Model.Rank;
import Model.Rank;

public class Straight extends HandType {

    public Straight() {
    }

    @Override
    public boolean check(Hand hand) {
        return (hand.getHand().get(0).getRank() == Rank.TWO) ? checkLowStraight(hand) : checkHighStraight(hand);
    }

    private boolean checkLowStraight(Hand hand) {
        for (int i = Rank.getValue(hand.getHand().get(0).getRank()); i < Rank.getValue(hand.getHand().get(0).getRank())+4; i++) 
            if (i != Rank.getValue(hand.getHand().get(i).getRank())) return false;
        if(hand.getHand().get(4).getRank() != Rank.AS) return false;
        return true;
    }

    private boolean checkHighStraight(Hand hand) {
        for (int i = Rank.getValue(hand.getHand().get(0).getRank()); i < Rank.getValue(hand.getHand().get(0).getRank())+5; i++) 
            if (i != Rank.getValue(hand.getHand().get(i).getRank())) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Straight";
    }
    
}
