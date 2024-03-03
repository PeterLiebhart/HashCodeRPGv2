package GUI;

import javax.swing.*;
import java.awt.*;

import static GUI.Constants.WindowConstants.*;

public class GameWindow extends JFrame {

    private final int WIDTH = WINDOW_WIDTH;
    private final int HEIGHT = WINDOW_HEIGHT;


    public GameWindow() {

        this.setSize(WIDTH, HEIGHT);
        this.setTitle("The BESTEST adventure ever, muthafuckas!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.black);
        this.setLocationRelativeTo(null);     // center the window on screen
        this.setLayout(null); // disable default layout to create customized layout
        this.setVisible(true);

    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }
}
