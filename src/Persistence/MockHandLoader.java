
package Persistence;

import Model.Card;
import Model.Rank;
import Model.Suit;
import java.util.ArrayList;
import java.util.List;

public class MockHandLoader implements HandLoader{

    @Override
    public List<Card> load() {
        List<Card> hand = new ArrayList<Card>();
 
        hand.add(new Card(Suit.CLUBS, Rank.AS));
        hand.add(new Card(Suit.SPADES, Rank.AS));
        hand.add(new Card(Suit.DIAMONDS, Rank.AS));
        hand.add(new Card(Suit.CLUBS, Rank.T));
        hand.add(new Card(Suit.HEARTS, Rank.AS));
        
        return hand;
    }

}
