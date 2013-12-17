package poker;

import Model.Card;
import Model.Deck;
import Model.Hand;
import Model.MasterChecker;
import UI.ConsoleHandTypeViewer;
import UI.ConsoleHandViewer;
import UI.HandTypeViewer;
import UI.HandViewer;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.execute();
    }

    private void execute() {
        Deck deck = new Deck();
        
        MasterChecker masterChecker = new MasterChecker();
        HandTypeViewer consoleHandTypeViewer = new ConsoleHandTypeViewer();
        HandViewer handViewer = new ConsoleHandViewer();

        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(Deck.ACEOFCLUBS);
        cards.add(Deck.ACEOFDIAMONDS);
        cards.add(Deck.ACEOFHEARTS);
        cards.add(Deck.JACKOFCLUBS);
        cards.add(Deck.EIGHTOFDIAMONDS);
        Hand hand = new Hand(cards);
        consoleHandTypeViewer.showHandType(masterChecker.check(hand));
        handViewer.showHand(hand);
    }

    private ArrayList<Card> handCreator(Deck deck) {
        ArrayList<Card> handToReturn = new ArrayList<Card>(5);
        for (int i = 0; i < 5; i++) 
            handToReturn.add(deck.getCard());
        return  handToReturn;
    }

}
