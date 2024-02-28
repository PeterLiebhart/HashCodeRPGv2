package GUI;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame{

    private final int WIDTH = 1280;
    private final int HEIGHT = 720;


    public GameWindow() {

        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.black);
        this.setLocationRelativeTo(null);     // center the window on screen
        this.setLayout(null); // disable default layout to create customized layout
        this.setVisible(true);

    }
}
