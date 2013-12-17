
package UI;

import Model.HandType;

public class ConsoleHandTypeViewer implements HandTypeViewer{

    public ConsoleHandTypeViewer() {
    }

    
    @Override
    public void showHandType(HandType handType) {
        System.out.println(handType);
    }

}
