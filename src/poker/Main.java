package poker;

import Model.Hand;
import Persistence.RandomHandLoader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Hand> handList = new ArrayList<Hand>();
        for (int i = 0; i < 10; i++) {
            handList.add(RandomHandLoader.getInstance().load());
        }
//        MasterChecker masterChecker = new MasterChecker();
//        Viewer consoleViewer = new ConsoleViewer();
//        for (Hand hand : handList) {
//            consoleViewer.show(masterChecker.check(hand));
//        }
    }

}
