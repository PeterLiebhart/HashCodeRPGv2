package serviceClasses.Initializers;

import dataClasses.Enemies.Entity;
import dataClasses.Enemies.Player;
import dataClasses.Map.Map;
import dataClasses.Map.MapCell;
import dataClasses.Story.Storyline;

import java.io.File;
import java.util.Scanner;

public class InitializePlayer {
    public static String SAVE_PATH = "C:\\Users\\everyone codes\\IdeaProjects\\Save\\";
    public static void initializePlayer(){
        checkForPlayerSaves();
        createPlayer();
    }

    private static void checkForPlayerSaves(){
        File folder = new File(SAVE_PATH);
        File[] listOfFiles = folder.listFiles();

        if(listOfFiles != null){
            System.out.println("Available player files:");
            for (File listOfFile : listOfFiles) {
                if (listOfFile.isFile()) {
                    System.out.println("Player " + listOfFile.getName().replace(".xml", ""));
                }
            }
        }
    }

    private static void loadSaveOrStartNewGame(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to load a save or start new?");
        String command = scanner.nextLine();
    }

    private static void createPlayer(){
        Storyline.prePlayerNameStory();
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();

        Player.getInstance();
        Player.setPlayerEntity(createBasicPlayerEntity(playerName));
        Player.setCurrentPositionViaMapCell(getStartingMapCell());
        Storyline.startStoryIntroduction(Player.getPlayerEntity());
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
