import javax.swing.*;

public class simpleWindow extends JFrame{

    public simpleWindow() {
        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 500;

        setTitle("My Simple Window (extends)");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
