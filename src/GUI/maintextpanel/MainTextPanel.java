package GUI.maintextpanel;

import javax.swing.*;
import java.awt.*;

import static GUI.Constants.FontConstants.TEXT_FONT;
import static GUI.Constants.WindowConstants.*;

public class MainTextPanel extends JPanel {

    JTextArea mainTextArea;

    public MainTextPanel() {

        // main text panel
        this.setBounds(320, 120, 600, 250);
        this.setBackground(Color.cyan);

        // main text area
        mainTextArea = new JTextArea("Hi, I'm the main text area! And this is gonna be the best f*ing adventure you've ever played in your entire life, muthafucka!");
        mainTextArea.setBounds(WINDOW_WIDTH / 2 - 100, 120, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(TEXT_FONT);
        mainTextArea.setLineWrap(true); // if text is too long it will wrap it automatically
        mainTextArea.setWrapStyleWord(true); // ensure words aren't broken up

        this.add(mainTextArea);
    }
}
