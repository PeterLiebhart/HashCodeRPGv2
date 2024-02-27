package serviceClasses.Activities;

import dataClasses.Enemies.Player;
import dataClasses.Map.Map;
import dataClasses.Map.Position;

public class Move {
    public static void moveToMapCellByCardinalDirections(Map.DIRECTION direction){
        Position newPlayerPosition;

        switch (direction){
            case NORTH:
                newPlayerPosition = new Position(Player.getCurrentPosition().getPosition().getX(),
                        Player.getCurrentPosition().getPosition().getY() + 1);
                Player.setCurrentPositionViaPosition(newPlayerPosition);
                //TODO: make this print better
                Player.getCurrentPosition().printDescription();
                break;
            case SOUTH:
                newPlayerPosition = new Position(Player.getCurrentPosition().getPosition().getX(),
                        Player.getCurrentPosition().getPosition().getY() - 1);
                Player.setCurrentPositionViaPosition(newPlayerPosition);
                break;
            default:
                System.out.println("Direction not recognized.");
                break;
        }

    }
}
