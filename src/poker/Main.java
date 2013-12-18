package poker;

import Control.Control;
import Model.MasterChecker;
import UI.ConsoleHandTypeViewer;
import UI.ConsoleHandViewer;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.execute();
    }

    private void execute() {
        Control control = new Control(new ConsoleHandTypeViewer(), new ConsoleHandViewer(), new MasterChecker());
        control.execute();
    }

}
