package Model;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

    private ArrayList<Card> hand = new ArrayList<Card>(5);

    public Hand(ArrayList<Card> hand) {
        this.hand = hand;
        sort();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void sort(){
        Collections.sort(hand);
    }
}
