package GUI;

import GUI.buttons.ChoiceButton;
import static GUI.Constants.FontConstants.*;

import javax.swing.*;
import java.awt.*;

public class GameScreen {

    GameWindow mainWindow;
    Container container;

    JPanel mainTextPanel;
    JTextArea mainTextArea;

    JPanel choiceButtonPanel;
    ChoiceButton choice1, choice2, choice3;

    public GameScreen(GameWindow window) {
        this.mainWindow = window;
        this.container = window.getContentPane();
        createGameScreen();

    }

    public void createGameScreen() {

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(320, 100, 600, 250);
        mainTextPanel.setBackground(Color.cyan);

        container.add(mainTextPanel);


        // main text area
        mainTextArea = new JTextArea("Hi, I'm the main text area! And this is gonna be the best f*ing adventure you've ever played in your entire life, muthafucka!");
        mainTextArea.setBounds(mainWindow.getWIDTH() / 2 - 100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(TEXT_FONT);
        mainTextArea.setLineWrap(true); // if text is too long it will wrap it automatically
        mainTextPanel.add(mainTextArea);

        // choice buttons & panel
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(mainWindow.getWIDTH() / 2 - 190, 390, 350, 150);
        choiceButtonPanel.setBackground(Color.yellow);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));  // # of rows, # of cols

        container.add(choiceButtonPanel);

        choice1 = new ChoiceButton("Hello, I'm choice button #1");
        choiceButtonPanel.add(choice1);

        choice2 = new ChoiceButton("Howdy, I'm choice button #2");
        choiceButtonPanel.add(choice2);

        choice3 = new ChoiceButton("Jagshemash, I'm choice button #3");
        choiceButtonPanel.add(choice3);

    }
}