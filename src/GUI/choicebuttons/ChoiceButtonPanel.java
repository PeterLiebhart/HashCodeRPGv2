package GUI.choicebuttons;

import javax.swing.*;
import java.awt.*;

import static GUI.Constants.WindowConstants.*;

public class ChoiceButtonPanel extends JPanel {

    public ChoiceButton choiceButton1, choiceButton2, choiceButton3, choiceButton4;

    public ChoiceButtonPanel() {

        this.setBounds(WINDOW_WIDTH / 2 - 190, 410, 350, 150);
        this.setBackground(Color.black);
        this.setLayout(new GridLayout(4, 1));  // # of rows, # of cols

        choiceButton1 = new ChoiceButton("Hello, I'm choice button #1");
        this.add(choiceButton1);
        choiceButton1.setActionCommand("choice1Clicked");

        choiceButton2 = new ChoiceButton("Howdy, I'm choice button #2");
        this.add(choiceButton2);
        choiceButton2.setActionCommand("choice2Clicked");

        choiceButton3 = new ChoiceButton("Jagshemash, I'm choice button #3");
        this.add(choiceButton3);
        choiceButton3.setActionCommand("choice3Clicked");

        choiceButton4 = new ChoiceButton("Hi, I'm choice button #4");
        this.add(choiceButton4);
        choiceButton4.setActionCommand("choice4Clicked");
    }

}
