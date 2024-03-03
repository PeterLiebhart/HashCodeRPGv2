package GUI.playerstats;

import javax.swing.*;
import java.awt.*;

import static GUI.Constants.FontConstants.BUTTON_FONT;

public class StatLabel extends JLabel {

    public StatLabel(String text) {
        this.setBackground(Color.black);
        this.setForeground(Color.white);
        this.setText(text);
        this.setFont(BUTTON_FONT);
    }
}
