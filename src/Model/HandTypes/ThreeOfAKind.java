
package Model.HandTypes;

import Model.Hand;

public class ThreeOfAKind extends HandType {

    public ThreeOfAKind() {
    }

    @Override
    public boolean check(Hand hand) {
        for (int i = 0; i < hand.getHand().size()-1; i++) {
            if((hand.getHand().get(i).getRank() == hand.getHand().get(i+1).getRank()) && (hand.getHand().get(i).getRank() == hand.getHand().get(i+1).getRank())) return true;
        }
        return false;
    }

}
