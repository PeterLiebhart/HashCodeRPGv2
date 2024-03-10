package GUI.choicebuttons;

import GUI.maintext.MainTextPanel;
import GUI.testscenes.Scene1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoiceHandler implements ActionListener {

    private String sceneID;
    MainTextPanel mainTextPanel;

    public void setSceneID(String sceneID) {
        this.sceneID = sceneID;
    }

    public void setMainTextPanel(MainTextPanel mainTextPanel) {
        this.mainTextPanel = mainTextPanel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (sceneID == null) {
            return;
        }

        String choice = e.getActionCommand();


        switch(sceneID) {
            case "greeting":
                switch(choice) {
                    case "choice1Clicked":
                        Scene1 scene1 = new Scene1();
                        scene1.townGate(mainTextPanel, new ChoiceButtonPanel());
                        break;

                    case "choice2Clicked":
                        mainTextPanel.updateMainText("ChoiceButton2 clicked");
                        break;

                    case "choice3Clicked":
                        mainTextPanel.updateMainText("ChoiceButton3 clicked");
                        break;

                    case "choice4Clicked":
                        mainTextPanel.updateMainText("ChoiceButton4 clicked");
                        break;
                }
                break;

            case "townGate":
                
                switch(choice) {
                    case "choice1Clicked":
                        mainTextPanel.updateMainText("ChoiceButton1 clicked");
                        break;

                    case "choice2Clicked":
                        mainTextPanel.updateMainText("ChoiceButton2 clicked");
                        break;

                    case "choice3Clicked":
                        mainTextPanel.updateMainText("ChoiceButton3 clicked");
                        break;

                    case "choice4Clicked":
                        mainTextPanel.updateMainText("ChoiceButton4 clicked");
                        break;
                }

                break;
        }

        sceneID = null;
    }
}
