
package Model.HandTypes;

import Model.Hand;

public class HighCard extends HandType {

    public HighCard() {
    }

    @Override
    public boolean check(Hand hand) {
        return true;
    }

    @Override
    public String toString() {
        return "HighCard";        
    }

    
}
