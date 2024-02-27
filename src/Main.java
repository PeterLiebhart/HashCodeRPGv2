import dataClasses.Enemies.Bestiary;
import dataClasses.Enemies.Player;
import dataClasses.Enemies.Entity;
import dataClasses.Story.Storyline;
import serviceClasses.Activities.Exploration;
import serviceClasses.Initializers.InitializeData;
import serviceClasses.Initializers.InitializePlayer;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InitializeData.initializeData();
        InitializePlayer.initializePlayer();

        Storyline.printRoomIntroduction();

        boolean runGame = true;
        while (runGame){
            Exploration.startExploration();
        }
    }
}