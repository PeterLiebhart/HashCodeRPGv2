package GUI.namescreen;

import GUI.GameWindow;
import GUI.choicebuttons.ChoiceButton;
import GUI.maintext.MainTextPanel;


import javax.swing.*;
import java.awt.*;


public class NameScreen {

    GameWindow mainWindow;
    Container container;

    MainTextPanel mainTextPanel;

    JPanel okButtonPanel;
    ChoiceButton okButton;

    NameScreenHandler nameScreenHandler;

    JTextField textField;


    public NameScreen (GameWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.container = mainWindow.getContentPane();

        createNameScreen();
    }

    public void createNameScreen() {

        mainTextPanel = new MainTextPanel("What's ya name?");
        mainTextPanel.setBackground(Color.green);

        textField = new JTextField(20);
        textField.setBounds(mainWindow.getWIDTH() / 2 - 70, 200, 100, 30);

        // Start Button & its Panel, custom class ChoiceButton extends JButton
        okButtonPanel = new JPanel();
        okButtonPanel.setBounds(mainWindow.getWIDTH() / 2 - 100, 400, 150, 50);
        okButtonPanel.setBackground(Color.black);

        okButton = new ChoiceButton("OK");


        // add elements to their respective panels
        okButtonPanel.add(okButton);

        // in this container we can place buttons, text etc.
        container.add(mainTextPanel);
        container.add(textField);
        container.add(okButtonPanel);

        // Instantiate NameScreenHandler after initializing textField
        this.nameScreenHandler = new NameScreenHandler(mainWindow, textField);
        okButton.addActionListener(nameScreenHandler);

    }

    // getter for the name that was entered in the textfield
    public JTextField getTextField() {
        return textField;
    }
}