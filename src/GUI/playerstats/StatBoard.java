package GUI.playerstats;

import javax.swing.*;
import java.awt.*;

public class StatBoard extends JPanel {

    // player stats that are displayed, custom class StatLabel (JLabel child)
    StatLabel playerNameLabel, playerLevelLabel, playerHealthLabel, playerAttackLabel;

    public StatBoard(String playerName, int playerHealth, int playerLevel, int playerAttack) {

        // info about player container/panel
        this.setBounds(50, 15, 250, 70);
        this.setBackground(Color.gray);
        this.setLayout(new GridLayout(2, 2));     // name, level, health, attack power


        playerNameLabel = new StatLabel("NAME: " + playerName);
        this.add(playerNameLabel);

        playerHealthLabel = new StatLabel("HEALTH: " + playerHealth);
        this.add(playerHealthLabel);

        playerLevelLabel = new StatLabel("LEVEL: " + playerLevel);
        this.add(playerLevelLabel);

        playerAttackLabel = new StatLabel("ATTACK: " + playerAttack);
        this.add(playerAttackLabel);

    }

    public void updateAllStats(int playerHealth, int playerLevel, int playerAttack) {
        // get the updated values for health, level and attack

    }

    public void updatePlayerLevelLabel(int update) {
        playerLevelLabel.setText("LEVEL: " + update);
    }

    public void updatePlayerHealthLabel(int update) {
        playerHealthLabel.setText("HEALTH: " + update);
    }

    public void updatePlayerAttackLabel(int update) {
        playerAttackLabel.setText("ATTACK: " + update);
    }
}
