package dataClasses.Story;

import dataClasses.Enemies.Entity;

import java.util.Scanner;

public class Storyline {

    public static void prePlayerNameStory(){
        System.out.println("Welcome to the world of Thravis. \n"
                + "What is your name, oh adventurer?");
    }
    public static void startStoryIntroduction(Entity player){
        System.out.println(player.name + ", this world is under constant thread of destruction.\n"
                + "Not by monsters, but by the Kingdoms ruling it. Something must be done.\n"
                + "Or there will be nothing left to safe ...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void printRoomIntroduction(){
        System.out.println("The darkness around you slowly recedes.\n" +
                "You awaken in a dark cold room.\n" +
                "Besides a pile of hay and a bucket, there is nothing there.\n" +
                "The wall your facing has a slightly ajar door.");
    }
}
