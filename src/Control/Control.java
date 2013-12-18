
package Control;

import Model.Card;
import Model.Deck;
import Model.Hand;
import Model.MasterChecker;
import UI.HandTypeViewer;
import UI.HandViewer;
import java.util.ArrayList;

public class Control {

    private HandTypeViewer handTypeViewer;
    private HandViewer handViewer;
    private MasterChecker masterChecker;

    public Control(HandTypeViewer handTypeViewer, HandViewer handViewer, MasterChecker masterChecker) {
        this.handTypeViewer = handTypeViewer;
        this.handViewer = handViewer;
        this.masterChecker = masterChecker;
    }
  
    public void execute(){
        Deck deck = new Deck();
        ArrayList<Hand> handList = new ArrayList<Hand>();
        
        for (int i = 0; i < 8; i++) 
            handList.add(handCreator(deck));
        
        for (Hand hand : handList) {
            handViewer.showHand(hand);
            handTypeViewer.showHandType(masterChecker.check(hand));
        }
    }
    
    private Hand handCreator(Deck deck) {
        ArrayList<Card> handToReturn = new ArrayList<Card>(5);
        for (int i = 0; i < 5; i++) 
            handToReturn.add(deck.getCard());
        return new Hand(handToReturn);
    }

    
    
}
