package GUI;

import javax.swing.*;
import java.awt.*;

public class TestGameUI {

    GameWindow window;
    Container container;
    JPanel titlePanel, startButtonPanel;
    JLabel titleText;
    JButton startButton;

    Font titleFont = new Font("Verdana", Font.PLAIN, 30);
    Font textFont = new Font("Verdana", Font.PLAIN, 15);


    public TestGameUI() {

        window = new GameWindow();

        container = window.getContentPane();

        // create space in our window for the title, using a panel
        titlePanel = new JPanel();
        titlePanel.setBounds(320, 100, 600, 150);
        titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        titlePanel.setBackground(Color.black);

        // JLabel creates a text field
        titleText = new JLabel("Best Adventure Game Ever!");
        titleText.setFont(titleFont);
        titleText.setForeground(Color.white);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(560, 400, 150, 50);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("START!");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFocusPainted(false);
        startButton.setFont(textFont);

        // add elements to their respective panels
        titlePanel.add(titleText);
        startButtonPanel.add(startButton);

        // in this container we can place buttons, text etc.
        container.add(titlePanel);
        container.add(startButtonPanel);

    }

}
