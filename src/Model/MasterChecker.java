
package Model;

import Model.HandTypes.HandType;

public class MasterChecker {

    public MasterChecker() {
    }
    
    public HandType check(Hand hand){
        for (HandType handType : HandType.ORDEREDHANDTYPES) {
            if(handType.check(hand)) return handType;
        }
        throw new RuntimeException("Never executes");
    }
}
