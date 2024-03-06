package GUI.choicebuttons;

import javax.swing.*;
import java.awt.*;

import static GUI.Constants.FontConstants.BUTTON_FONT;

public class ChoiceButton extends JButton {

    public ChoiceButton(String text) {

        this.setFocusPainted(false);
        this.setBackground(Color.black);
        this.setForeground(Color.white);
        this.setFont(BUTTON_FONT);
        this.setText(text);
    }

}
