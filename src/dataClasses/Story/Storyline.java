package Data.Story;

import Classes.Entities.Base.Entity;

import java.util.Scanner;

public class Storyline {
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
