package GUI.testscenes;

import GUI.choicebuttons.ChoiceButtonPanel;
import GUI.choicebuttons.ChoiceHandler;
import GUI.maintext.MainTextPanel;

import java.util.concurrent.TimeUnit;

public class Scene1 {

    String sceneID;

    public void townGate(MainTextPanel mainTextPanel, ChoiceButtonPanel choiceButtonPanel) {

        this.sceneID = "townGate";
        ChoiceHandler choiceHandler = new ChoiceHandler();
        choiceHandler.setSceneID(sceneID);
        choiceHandler.setMainTextPanel(mainTextPanel);

        mainTextPanel.updateMainText("You're at the gate of the town. A guard is right in front of you. What do you want to do?");

        choiceButtonPanel.choiceButton1.setText("Ahhhhhh!");
        choiceButtonPanel.choiceButton1.addActionListener(choiceHandler);

        choiceButtonPanel.choiceButton2.setText("Attack the guard");
        choiceButtonPanel.choiceButton2.addActionListener(choiceHandler);

        choiceButtonPanel.choiceButton3.setText("Insult the guard");
        choiceButtonPanel.choiceButton3.addActionListener(choiceHandler);

        choiceButtonPanel.choiceButton4.setText("Run away and hide");
        choiceButtonPanel.choiceButton4.addActionListener(choiceHandler);
    }

}
