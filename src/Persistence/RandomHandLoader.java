
package Persistence;

import Model.Card;
import Model.Rank;
import Model.Suit;
import java.util.ArrayList;
import java.util.List;

public class RandomHandLoader implements HandLoader{

    @Override
    public List<Card> load() {
        List<Card> cardsToReturn = new ArrayList<Card>(5);
        for (int i = 0; i < 5; i++) {
            cardsToReturn.add(new Card(Suit.SUITS[(int)Math.random()%4], Rank.SET[(int)Math.random()%13]));
        }
        return cardsToReturn;
    }

}
