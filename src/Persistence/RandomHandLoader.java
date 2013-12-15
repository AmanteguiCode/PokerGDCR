
package Persistence;

import Model.Card;
import Model.Deck;
import Model.Hand;
import java.util.ArrayList;
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
        ArrayList<Card> cardsToReturnLoaded = new ArrayList<Card>(5);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Card cardToTryInsert = Deck.DECK[random.nextInt(52)];
            if(cardNotInHand(cardsToReturnLoaded, cardToTryInsert)) cardsToReturnLoaded.add(cardToTryInsert);
            else --i;
        }
        return new Hand(cardsToReturnLoaded);
    }

    private boolean cardNotInHand(ArrayList<Card> cardsToReturn, Card cardToTry) {
        for (Card card : cardsToReturn) 
            if (card == cardToTry) return false;
        return true;
    }


}
