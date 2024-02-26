package dataClasses;

import dataClasses.Map.Map;
import dataClasses.Map.MapCell;
import dataClasses.Story.Storyline;

import java.util.Scanner;

public class Player {
    Entity player;
    MapCell currentPosition;

    public Player(){
    }

    public Player(Entity player){
        this.player = player;
    }

    public Entity getPlayerEntity(){
        return this.player;
    }

    public MapCell getCurrentPosition(){
        return currentPosition;
    }

    public void createPlayer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the world of Thravis. \n"
        + "What is your name, oh adventurer?");
        String playerName = scanner.nextLine();
        createBasicPlayerEntity(playerName);
        setStartingPosition();
        Storyline.startStoryIntroduction(player);
    }

    private void createBasicPlayerEntity(String playerName){
        int baseLevel = 1;
        int baseHealth = 10;
        int baseAttack = 1;
        this.player = new Entity(true, playerName, baseLevel, baseHealth, baseAttack);
    }

    private void setStartingPosition(){
        this.currentPosition = Map.getInstance().getMapCellByCoordinates(0, 0);
    }
}
