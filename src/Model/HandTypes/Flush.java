
package Model.HandTypes;

import Model.Card;
import Model.Hand;
import Model.Suit;

public class Flush extends HandType {

    public Flush() {
    }

    @Override
    public boolean check(Hand hand) {
        Suit firstSuit = hand.getHand().get(0).getSuit();
        for (Card currentCard : hand.getHand()) 
            if (currentCard.getSuit() != firstSuit) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Flush";
    }
    
    

}
