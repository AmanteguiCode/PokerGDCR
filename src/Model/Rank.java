package Model;


public class Rank {
    
    public static final Rank AS = new Rank();
    public static final Rank K = new Rank();
    public static final Rank Q = new Rank();
    public static final Rank J = new Rank();
    public static final Rank T = new Rank();
    public static final Rank NINE = new Rank();
    public static final Rank EIGHT = new Rank();
    public static final Rank SEVEN = new Rank();
    public static final Rank SIX = new Rank();
    public static final Rank FIVE = new Rank();
    public static final Rank FOUR = new Rank();
    public static final Rank THREE = new Rank();
    public static final Rank TWO = new Rank();

    public Rank() {
    }

    public static final Rank[] SET = {TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, T, J, Q, K, AS};

    public static Integer getValue(Rank rank){
        for (int i = 0; i < SET.length; i++) 
            if (rank == SET[i]) return i+2;
        throw new RuntimeException("Never Executes");
    }
}
