package GUI.namescreen;

import GUI.GameScreen;
import GUI.GameWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NameScreenHandler implements ActionListener {

    private GameWindow window;
    private JTextField textField;

    // Constructor that takes GameWindow instance
    public NameScreenHandler(GameWindow window, JTextField nameField) {
        this.window = window;
        this.textField = nameField;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        // Check for null before using window
        if (window != null) {

            // store USERNAME somewhere!!!
            String playerName = textField.getText();
            System.out.println(playerName);


            // Remove components from the content pane
            window.getContentPane().removeAll();

            // Pass the GameWindow instance to the GameScreen
            new GameScreen(window).createGameScreen();

            // Repaint the window
            window.revalidate();
            window.repaint();
        } else {
            System.err.println("GameWindow is null");
        }
    }
}
