package GUI;

import javax.swing.*;
import java.awt.*;

public class GameScreen {

    GameWindow window;
    Container container;

    JPanel mainTextPanel;
    JTextArea mainTextArea;

    Font textFont = new Font("Verdana", Font.PLAIN, 15);

    public GameScreen(GameWindow window) {
        this.window = window;
        this.container = window.getContentPane();
        createGameScreen();

    }

    public void createGameScreen() {

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(320, 100, 600, 250);
        mainTextPanel.setBackground(Color.cyan);

        container.add(mainTextPanel);

        // main text area
        mainTextArea = new JTextArea("Hi, I'm the main text area! And this is gonna be the bestest f*ing adventure\n" +
                "you've ever played in your entire life, muthafucka!");
        mainTextArea.setBounds(320, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(textFont);
        mainTextArea.setLineWrap(true); // if text is too long it will wrap it automatically
        mainTextPanel.add(mainTextArea);
    }
}