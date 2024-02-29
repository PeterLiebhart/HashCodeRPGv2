package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitleScreenHandler implements ActionListener {

    private GameWindow window;


    // Constructor that takes GameWindow instance
    public TitleScreenHandler(GameWindow window) {
        this.window = window;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        // Check for null before using window
        if (window != null) {
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
