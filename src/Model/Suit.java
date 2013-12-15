package Model;


public final class Suit {

    public static final Suit HEARTS = new Suit();
    public static final Suit DIAMONDS = new Suit();
    public static final Suit SPADES = new Suit();
    public static final Suit CLUBS = new Suit();

    public Suit() {
    }
    
    public static final Suit[] SUITS = {HEARTS, DIAMONDS, SPADES, CLUBS};
    
    public static String getStringedSuit(Suit suit){
        if (suit == Suit.HEARTS) {
            return "HEARTS";
        }
        if (suit == Suit.DIAMONDS) {
            return "DIAMONDS";
        }
        if (suit == Suit.SPADES) {
            return "SPADES";
        }
        if (suit == Suit.CLUBS) {
            return "CLUBS";
        }
        throw new RuntimeException("Wont Execute");
    }
}
