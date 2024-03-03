package GUI;

import GUI.buttons.ChoiceButton;
import GUI.maintextpanel.MainTextPanel;
import GUI.playerstats.StatBoard;


import javax.swing.*;
import java.awt.*;

public class GameScreen {

    GameWindow mainWindow;
    Container container;

    StatBoard statBoardPlayer;
    MainTextPanel mainTextPanel;

    JPanel choiceButtonPanel;
    ChoiceButton choice1, choice2, choice3;

    public GameScreen(GameWindow window) {
        this.mainWindow = window;
        this.container = window.getContentPane();
        createGameScreen();

    }

    public void createGameScreen() {

        // player stats board
        statBoardPlayer = new StatBoard("Katzuro", 80, 100, 100);
        container.add(statBoardPlayer);

        // main text panel
        mainTextPanel = new MainTextPanel();
        container.add(mainTextPanel);

        // choice buttons & panel
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(mainWindow.getWIDTH() / 2 - 190, 410, 350, 150);
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