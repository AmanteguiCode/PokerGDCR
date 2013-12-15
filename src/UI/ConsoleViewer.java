
package UI;

import Model.HandTypes.HandType;

public class ConsoleViewer implements Viewer{

    public ConsoleViewer() {
    }

    
    @Override
    public void showHandType(HandType handType) {
        System.out.println(handType);
    }

}
