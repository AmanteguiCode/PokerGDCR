
package UI;

import Model.HandTypes.HandType;

public class ConsoleViewer implements Viewer{

    @Override
    public void show(HandType handType) {
        System.out.println(handType);
    }

}
