
package Model;

public class Deck {
    public static final Card ACEOFSPADES = new Card(Suit.SPADES, Rank.ACE);
    public static final Card ACEOFDIAMONDS = new Card(Suit.DIAMONDS, Rank.ACE);
    public static final Card ACEOFCLUBS = new Card(Suit.CLUBS, Rank.ACE);
    public static final Card ACEOFHEARTS = new Card(Suit.HEARTS, Rank.ACE);
    
    public static final Card KINGOFSPADES = new Card(Suit.SPADES, Rank.K);
    public static final Card KINGOFDIAMONDS = new Card(Suit.DIAMONDS, Rank.K);
    public static final Card KINGOFCLUBS = new Card(Suit.CLUBS, Rank.K);
    public static final Card KINGOFHEARTS = new Card(Suit.HEARTS, Rank.K);
    
    public static final Card QUEENOFSPADES = new Card(Suit.SPADES, Rank.Q);
    public static final Card QUEENOFDIAMONDS = new Card(Suit.DIAMONDS, Rank.Q);
    public static final Card QUEENOFCLUBS = new Card(Suit.CLUBS, Rank.Q);
    public static final Card QUEENOFHEARTS = new Card(Suit.HEARTS, Rank.Q);
    
    public static final Card JACKOFSPADES = new Card(Suit.SPADES, Rank.J);
    public static final Card JACKOFDIAMONDS = new Card(Suit.DIAMONDS, Rank.J);
    public static final Card JACKOFCLUBS = new Card(Suit.CLUBS, Rank.J);
    public static final Card JACKOFHEARTS = new Card(Suit.HEARTS, Rank.J);
    
    public static final Card TENOFSPADES = new Card(Suit.SPADES, Rank.T);
    public static final Card TENOFDIAMONDS = new Card(Suit.DIAMONDS, Rank.T);
    public static final Card TENOFCLUBS = new Card(Suit.CLUBS, Rank.T);
    public static final Card TENOFHEARTS = new Card(Suit.HEARTS, Rank.T);
    
    public static final Card NINEOFSPADES = new Card(Suit.SPADES, Rank.NINE);
    public static final Card NINEOFDIAMONDS = new Card(Suit.DIAMONDS, Rank.NINE);
    public static final Card NINEOFCLUBS = new Card(Suit.CLUBS, Rank.NINE);
    public static final Card NINEOFHEARTS = new Card(Suit.HEARTS, Rank.NINE);
    
    public static final Card EIGHTOFSPADES = new Card(Suit.SPADES, Rank.EIGHT);
    public static final Card EIGHTOFDIAMONDS = new Card(Suit.DIAMONDS, Rank.EIGHT);
    public static final Card EIGHTOFCLUBS = new Card(Suit.CLUBS, Rank.EIGHT);
    public static final Card EIGHTOFHEARTS = new Card(Suit.HEARTS, Rank.EIGHT);
    
    public static final Card SEVENOFSPADES = new Card(Suit.SPADES, Rank.SEVEN);
    public static final Card SEVENOFDIAMONDS = new Card(Suit.DIAMONDS, Rank.SEVEN);
    public static final Card SEVENOFCLUBS = new Card(Suit.CLUBS, Rank.SEVEN);
    public static final Card SEVENOFHEARTS = new Card(Suit.HEARTS, Rank.SEVEN);
    
    public static final Card SIXOFSPADES = new Card(Suit.SPADES, Rank.SIX);
    public static final Card SIXOFDIAMONDS = new Card(Suit.DIAMONDS, Rank.SIX);
    public static final Card SIXOFCLUBS = new Card(Suit.CLUBS, Rank.SIX);
    public static final Card SIXOFHEARTS = new Card(Suit.HEARTS, Rank.SIX);
    
    public static final Card FIVEOFSPADES = new Card(Suit.SPADES, Rank.FIVE);
    public static final Card FIVEOFDIAMONDS = new Card(Suit.DIAMONDS, Rank.FIVE);
    public static final Card FIVEOFCLUBS = new Card(Suit.CLUBS, Rank.FIVE);
    public static final Card FIVEOFHEARTS = new Card(Suit.HEARTS, Rank.FIVE);
    
    public static final Card FOUROFSPADES = new Card(Suit.SPADES, Rank.FOUR);
    public static final Card FOUROFDIAMONDS = new Card(Suit.DIAMONDS, Rank.FOUR);
    public static final Card FOUROFCLUBS = new Card(Suit.CLUBS, Rank.FOUR);
    public static final Card FOUROFHEARTS = new Card(Suit.HEARTS, Rank.FOUR);
    
    public static final Card THREEOFSPADES = new Card(Suit.SPADES, Rank.THREE);
    public static final Card THREEOFDIAMONDS = new Card(Suit.DIAMONDS, Rank.THREE);
    public static final Card THREEOFCLUBS = new Card(Suit.CLUBS, Rank.THREE);
    public static final Card THREEOFHEARTS = new Card(Suit.HEARTS, Rank.THREE);
    
    public static final Card TWOOFSPADES = new Card(Suit.SPADES, Rank.TWO);
    public static final Card TWOOFDIAMONDS = new Card(Suit.DIAMONDS, Rank.TWO);
    public static final Card TWOOFCLUBS = new Card(Suit.CLUBS, Rank.TWO);
    public static final Card TWOOFHEARTS = new Card(Suit.HEARTS, Rank.TWO);

    public Deck() {
    }
    
    public static final Card[] DECK = {TWOOFHEARTS, TWOOFCLUBS, TWOOFDIAMONDS, TWOOFSPADES, THREEOFHEARTS,
        THREEOFCLUBS, THREEOFDIAMONDS, THREEOFSPADES, FOUROFHEARTS, FOUROFCLUBS, FOUROFSPADES, FOUROFDIAMONDS,
        FIVEOFHEARTS, FIVEOFCLUBS, FIVEOFDIAMONDS, FIVEOFSPADES, SIXOFHEARTS, SIXOFDIAMONDS, SIXOFCLUBS, 
        SIXOFSPADES, SEVENOFHEARTS, SEVENOFSPADES, SEVENOFDIAMONDS, SEVENOFCLUBS, EIGHTOFHEARTS, EIGHTOFCLUBS,
        EIGHTOFDIAMONDS, EIGHTOFSPADES, NINEOFCLUBS, NINEOFHEARTS, NINEOFDIAMONDS, NINEOFSPADES, TENOFHEARTS,
        TENOFDIAMONDS, TENOFSPADES, TENOFCLUBS, JACKOFHEARTS, JACKOFCLUBS, JACKOFSPADES, JACKOFDIAMONDS,
        QUEENOFDIAMONDS, QUEENOFHEARTS, QUEENOFCLUBS, QUEENOFSPADES, KINGOFHEARTS, KINGOFSPADES, KINGOFCLUBS,
        KINGOFDIAMONDS, ACEOFSPADES, ACEOFDIAMONDS, ACEOFCLUBS, ACEOFHEARTS};
            
}
