package Model.HandTypes;

import Model.HandType;
import Model.Hand;
import Model.Rank;

public class Straight extends HandType {

    public Straight() {
    }

    @Override
    public boolean check(Hand hand) {
        return (hand.getHand().get(3).getRank() == Rank.FIVE) ? checkForLowestStraight(hand) : checkForNormalStraight(hand);
    }

    @Override
    public String toString() {
        return "Straight";
    }

    private boolean checkForLowestStraight(Hand hand) {
        for (int i = 0; i < hand.getHand().size()-1; i++) 
            if(Rank.getValue(hand.getHand().get(i).getRank()) != Rank.getValue(hand.getHand().get(0).getRank()) + i) return false;
        if(hand.getHand().get(4).getRank() != Rank.ACE) return false;
        return true;
    }

    private boolean checkForNormalStraight(Hand hand) {
        for (int i = 0; i < hand.getHand().size(); i++) 
            if(Rank.getValue(hand.getHand().get(i).getRank()) != Rank.getValue(hand.getHand().get(0).getRank()) + i) return false;
        return true;
    }
}
