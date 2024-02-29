package GUI;

import javax.swing.*;
import java.awt.*;

public class TitleScreen {

    GameWindow mainWindow;
    Container container;

    JPanel titlePanel, startButtonPanel;

    JLabel titleText;
    JButton startButton;

    Font titleFont = new Font("Verdana", Font.PLAIN, 30);
    Font textFont = new Font("Verdana", Font.PLAIN, 15);

    TitleScreenHandler titleScreenHandler;


    public TitleScreen(GameWindow mainWindow) {

        this.mainWindow = mainWindow;
        this.container = mainWindow.getContentPane();
        this.titleScreenHandler = new TitleScreenHandler(mainWindow);
        createTitleScreen();
    }

    private void createTitleScreen() {

        // create space inside our window for the title, using a panel
        titlePanel = new JPanel();
        titlePanel.setBounds(380, 80, 450, 70);
        titlePanel.setBackground(Color.magenta);

        // JLabel creates a text field
        titleText = new JLabel("Best Adventure Game Ever!");
        titleText.setFont(titleFont);
        titleText.setForeground(Color.white);


        // Start Button & its Panel
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(mainWindow.getWIDTH() / 2 - 100, 400, 150, 50);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFocusPainted(false);
        startButton.setFont(textFont);
        startButton.addActionListener(titleScreenHandler);

        // add elements to their respective panels
        titlePanel.add(titleText);
        startButtonPanel.add(startButton);

        // in this container we can place buttons, text etc.
        container.add(titlePanel);
        container.add(startButtonPanel);

    }
}
