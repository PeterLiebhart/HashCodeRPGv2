package GUI;

import GUI.choicebuttons.ChoiceButtonPanel;
import GUI.maintext.MainTextPanel;
import GUI.playerstats.StatBoard;
import GUI.testscenes.Scene0;

import java.awt.*;


public class GameScreen {

    GameWindow mainWindow;
    Container container;

    StatBoard statBoardPlayer;
    MainTextPanel mainTextPanel;

    ChoiceButtonPanel choiceButtonPanel;
    String playerName;

    public GameScreen(GameWindow window) {
        this.mainWindow = window;
        this.container = window.getContentPane();
        createGameScreen();

    }

    public void createGameScreen() {

        // player stats board
        statBoardPlayer = new StatBoard(playerName, 80, 100, 100);
        statBoardPlayer.updatePlayerAttackLabel(150);
        container.add(statBoardPlayer);


        // main text panel
        mainTextPanel = new MainTextPanel("");
        container.add(mainTextPanel);


        // choice buttons & panel
        choiceButtonPanel = new ChoiceButtonPanel();
        container.add(choiceButtonPanel);


        Scene0 scene0 = new Scene0();
        scene0.greeting(mainTextPanel, choiceButtonPanel);

    }
}