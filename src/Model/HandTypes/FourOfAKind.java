package Model.HandTypes;

import Model.HandType;
import Model.Hand;

public class FourOfAKind extends HandType {

    public FourOfAKind() {
    }

    @Override
    public boolean check(Hand hand) {
        int sameRankAppearance = 0;
        for (int i = 0; i < hand.getHand().size() - 1; i++) 
            if(hand.getHand().get(i).getRank() == hand.getHand().get(i+1).getRank())  sameRankAppearance++;
        return (sameRankAppearance >=3) ? true : false;
    }

    @Override
    public String toString() {
        return "FourOfAKind";
    }
}
