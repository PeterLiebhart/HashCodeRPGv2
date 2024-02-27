package serviceClasses.Initializers;

import dataClasses.Enemies.Entity;
import dataClasses.Enemies.Player;
import dataClasses.Map.Map;
import dataClasses.Map.MapCell;
import dataClasses.Story.Storyline;

import java.util.Scanner;

public class InitializePlayer {
    public static void initializePlayer(){
        createPlayer();
    }

    private static void createPlayer(){
        Storyline.prePlayerNameStory();
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();

        Entity player = createBasicPlayerEntity(playerName);
        Player.getInstance().setCurrentPositionViaMapCell(getStartingMapCell());
        Storyline.startStoryIntroduction(player);
    }

    private static Entity createBasicPlayerEntity(String playerName){
        int baseLevel = 1;
        int baseHealth = 10;
        int baseAttack = 1;
        return new Entity(true, playerName, baseLevel, baseHealth, baseAttack);
    }

    private static MapCell getStartingMapCell(){
        return Map.getInstance().getMapCellByCoordinates(0, 0);
    }
}
