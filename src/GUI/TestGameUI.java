package GUI;

import javax.swing.*;
import java.awt.*;

public class TestGameUI {

    Container container;
    JPanel titlePanel;

    public static void main(String[] args) {
        new TestGameUI();
    }

    public TestGameUI() {

        GameWindow window = new GameWindow();

        container = window.getContentPane();

        // titlePanel is a blue box here
        titlePanel = new JPanel();       // create space in our window for the title, using a panel
        titlePanel.setBounds(100, 100, 600, 150);
        titlePanel.setBackground(Color.cyan);

        // JLabel creates a text field
        JLabel textPanel = new JLabel();

        textPanel.setBounds(200, 150, 500, 50);
        textPanel.setFont(new Font("Arial", Font.PLAIN, 40));
        textPanel.setForeground(Color.white);
        textPanel.setText("Hello! I'm a JLabel!");

        // text field to enter text
        TextField answerField = new TextField();
        answerField.setBounds(200, 270, 100, 50);


        // in this container we can place buttons, text etc.
        container.add(answerField);
        container.add(textPanel);
        container.add(titlePanel);


    }

}
