package GUI;

import GUI.choicebuttons.ChoiceButtonPanel;
import GUI.maintext.MainTextPanel;
import GUI.playerstats.StatBoard;

import java.awt.*;

public class GameScreen {

    GameWindow mainWindow;
    Container container;

    StatBoard statBoardPlayer;
    MainTextPanel mainTextPanel;

    ChoiceButtonPanel choiceButtonPanel;

    public GameScreen(GameWindow window) {
        this.mainWindow = window;
        this.container = window.getContentPane();
        createGameScreen();

    }

    public void createGameScreen() {

        // player stats board
        statBoardPlayer = new StatBoard("Katzuro", 80, 100, 100);
        statBoardPlayer.updatePlayerAttackLabel(150);
        container.add(statBoardPlayer);

        // main text panel
        mainTextPanel = new MainTextPanel("Hi, I'm the main text area! And this is gonna be the best f*ing adventure you've ever played in your entire life, muthafucka!");
        container.add(mainTextPanel);

        // choice buttons & panel
        choiceButtonPanel = new ChoiceButtonPanel();
        container.add(choiceButtonPanel);
    }
}