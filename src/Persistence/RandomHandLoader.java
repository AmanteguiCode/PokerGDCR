
package Persistence;

import Model.Card;
import Model.Hand;
import Model.Rank;
import Model.Suit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomHandLoader implements HandLoader{

    private static RandomHandLoader randomHandLoader;
    
    private RandomHandLoader(){
        
    }
    
    public static HandLoader getInstance(){
        if (randomHandLoader == null) randomHandLoader = new RandomHandLoader();
        return randomHandLoader;
    }
    
    @Override
    public Hand load() {
        ArrayList<Card> cardsToReturn = new ArrayList<Card>(5);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            cardsToReturn.add(new Card(Suit.SUITS[random.nextInt(3)], Rank.SET[random.nextInt(12)]));
        }
        return new Hand(cardsToReturn);
    }

}
