package serviceClasses.Activities;

import dataClasses.Enemies.Player;
import dataClasses.Map.Map;
import serviceClasses.Saving.Save;

import java.util.Objects;
import java.util.Scanner;

public class Exploration {
    public static void startExploration(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do?");

        String input = scanner.nextLine();
        String [] commands = input.toLowerCase().split("\\s+");
        switch (commands[0]){
            case "look":
            case "lookaround":
                Player.getCurrentPosition().printDescription();
                break;
            case "move":
                //TODO: add try catch if only one argument
                String secondArgument = commands[1];
                if(Objects.equals(secondArgument.toLowerCase(), "forward") ||
                        Objects.equals(secondArgument.toLowerCase(), "north"))
                    Move.moveToMapCellByCardinalDirections(Map.DIRECTION.NORTH);
                break;
            case "save":
                Save.saveToXML();
            default:
                break;
        }
    }
}
