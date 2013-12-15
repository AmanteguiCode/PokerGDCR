package Model.HandTypes;

import Model.Hand;

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
    
    public static final HandType[] handTypes = {ROYAL_FLUSH, STRAIGHT_FLUSH, 
        FOUR_OF_A_KIND, FULL_HOUSE, FLUSH, STRAIGHT, THREE_OF_A_KIND, TWO_PAIRS, PAIR, HIGH_CARD};

}
