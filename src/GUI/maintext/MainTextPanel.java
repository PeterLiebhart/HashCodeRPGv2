package GUI.maintext;

import javax.swing.*;
import java.awt.*;

import static GUI.Constants.FontConstants.TEXT_FONT;
import static GUI.Constants.WindowConstants.*;

public class MainTextPanel extends JPanel {

    JTextArea mainTextArea;
    String text;

    public MainTextPanel(String text) {

        // main text panel
        this.setBounds(320, 120, 600, 250);
        this.setBackground(Color.cyan);

        // main text area
        mainTextArea = new JTextArea(text);
        mainTextArea.setBounds(WINDOW_WIDTH / 2 - 100, 120, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(TEXT_FONT);
        mainTextArea.setLineWrap(true); // if text is too long it will wrap it automatically
        mainTextArea.setWrapStyleWord(true); // ensure words aren't broken up

        this.add(mainTextArea);
    }

    public void updateMainText(String text) {
        this.text = text;
        mainTextArea.setText(text);
    }
}
