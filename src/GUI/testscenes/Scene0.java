package GUI.testscenes;

import GUI.choicebuttons.ChoiceButtonPanel;
import GUI.choicebuttons.ChoiceHandler;
import GUI.maintext.MainTextPanel;

public class Scene0 {

    String sceneID;

    public void greeting(MainTextPanel mainTextPanel, ChoiceButtonPanel choiceButtonPanel) {

        this.sceneID = "greeting";
        ChoiceHandler choiceHandler = new ChoiceHandler();
        choiceHandler.setSceneID(sceneID);
        choiceHandler.setMainTextPanel(mainTextPanel);

        mainTextPanel.updateMainText("Hi, I'm the main text area! And this is gonna be the best f*ing adventure you've ever played in your entire life, muthafucka!");

        choiceButtonPanel.choiceButton1.setText("OK");
        choiceButtonPanel.choiceButton1.addActionListener(choiceHandler);

        choiceButtonPanel.choiceButton2.setText("Groovy!");
        choiceButtonPanel.choiceButton2.addActionListener(choiceHandler);

        choiceButtonPanel.choiceButton3.setText("Let's rock!");
        choiceButtonPanel.choiceButton3.addActionListener(choiceHandler);

        choiceButtonPanel.choiceButton4.setText("I have come to chew bubble gum and kick ass. And I'm all out of gum.");
        choiceButtonPanel.choiceButton4.addActionListener(choiceHandler);
    }

}
