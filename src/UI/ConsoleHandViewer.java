
package UI;

import Model.Card;
import Model.Hand;
import Model.Rank;
import Model.Suit;
import Model.Suit;

public class ConsoleHandViewer implements HandViewer{

    @Override
    public void showHand(Hand hand) {
        for (Card card : hand.getHand()) {
            System.out.println(" Rank: " + Rank.getValue(card.getRank())+ " Suit: " + Suit.getStringedSuit(card.getSuit()));
        }
    }


}
