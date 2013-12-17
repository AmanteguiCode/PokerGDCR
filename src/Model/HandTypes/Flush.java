
package Model.HandTypes;

import Model.HandType;
import Model.Card;
import Model.Hand;
import Model.Suit;

public class Flush extends HandType {

    public Flush() {
    }

    @Override
    public boolean check(Hand hand) {
        Suit suitToCompare = hand.getHand().get(0).getSuit();
        for (int i = 0; i < hand.getHand().size(); i++) 
            if(hand.getHand().get(i).getSuit() != suitToCompare) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Flush";
    }
    
    

}
