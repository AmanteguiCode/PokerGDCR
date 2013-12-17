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
        ArrayList<Hand> handList = new ArrayList<Hand>();
        for (int i = 0; i < 5; i++) 
            handList.add(i, new Hand(handCreator(deck)));
        
        
        
        MasterChecker masterChecker = new MasterChecker();
        HandTypeViewer consoleHandTypeViewer = new ConsoleHandTypeViewer();
        HandViewer handViewer = new ConsoleHandViewer();
        
        for (Hand hand : handList) {
            consoleHandTypeViewer.showHandType(masterChecker.check(hand));
            handViewer.showHand(hand);
        }
    }

    private ArrayList<Card> handCreator(Deck deck) {
        ArrayList<Card> handToReturn = new ArrayList<Card>(5);
        for (int i = 0; i < 5; i++) 
            handToReturn.add(deck.getCard());
        return  handToReturn;
    }

}
