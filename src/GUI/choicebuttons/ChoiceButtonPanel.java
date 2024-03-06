package GUI.choicebuttons;

import javax.swing.*;
import java.awt.*;

import static GUI.Constants.WindowConstants.*;

public class ChoiceButtonPanel extends JPanel {

    ChoiceButton choice1, choice2, choice3;

    public ChoiceButtonPanel() {

        this.setBounds(WINDOW_WIDTH / 2 - 190, 410, 350, 150);
        this.setBackground(Color.yellow);
        this.setLayout(new GridLayout(4, 1));  // # of rows, # of cols

        choice1 = new ChoiceButton("Hello, I'm choice button #1");
        this.add(choice1);

        choice2 = new ChoiceButton("Howdy, I'm choice button #2");
        this.add(choice2);

        choice3 = new ChoiceButton("Jagshemash, I'm choice button #3");
        this.add(choice3);
    }
}
