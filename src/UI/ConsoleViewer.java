
package UI;

import Model.HandType;

public class ConsoleViewer implements Viewer{

    public ConsoleViewer() {
    }

    
    @Override
    public void showHandType(HandType handType) {
        System.out.println(handType);
    }

}
