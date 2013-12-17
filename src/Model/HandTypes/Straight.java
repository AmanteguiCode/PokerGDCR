package Model.HandTypes;

import Model.HandType;
import Model.Hand;
import Model.Rank;
import Model.Rank;

public class Straight extends HandType {

    public Straight() {
    }

    @Override
    public boolean check(Hand hand) {
        (hand.getHand().get(4).getRank() == Rank.FOUR) ? return checkForLowestStraight(hand) : return checkForHighStraight(hand) ;
    }

    @Override
    public String toString() {
        return "Straight";
    }

    private boolean checkForLowestStraight(Hand hand) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean checkForHighStraight(Hand hand) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
