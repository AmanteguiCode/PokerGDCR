package Model;

import Model.Hand;
import Model.HandTypes.Flush;
import Model.HandTypes.FourOfAKind;
import Model.HandTypes.FullHouse;
import Model.HandTypes.HighCard;
import Model.HandTypes.Pair;
import Model.HandTypes.RoyalFlush;
import Model.HandTypes.Straight;
import Model.HandTypes.StraightFlush;
import Model.HandTypes.ThreeOfAKind;
import Model.HandTypes.TwoPairs;

public abstract class HandType {
    public static final HandType ROYAL_FLUSH = new RoyalFlush();
    public static final HandType STRAIGHT_FLUSH = new StraightFlush();
    public static final HandType FOUR_OF_A_KIND = new FourOfAKind();
    public static final HandType FULL_HOUSE = new FullHouse();
    public static final HandType FLUSH = new Flush();
    public static final HandType STRAIGHT = new Straight();
    public static final HandType THREE_OF_A_KIND = new ThreeOfAKind();
    public static final HandType TWO_PAIRS = new TwoPairs();
    public static final HandType PAIR = new Pair();
    public static final HandType HIGH_CARD = new HighCard();
    
    public abstract boolean check(Hand hand);
    public abstract String toString();
    
    public static final HandType[] ORDEREDHANDTYPES = {TWO_PAIRS, PAIR, HIGH_CARD};

    // ROYAL_FLUSH, STRAIGHT_FLUSH, FOUR_OF_A_KIND, FULL_HOUSE, FLUSH, STRAIGHT, THREE_OF_A_KIND,   
}
