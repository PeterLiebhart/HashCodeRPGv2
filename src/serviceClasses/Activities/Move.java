package serviceClasses.Activities;

import dataClasses.Enemies.Player;
import dataClasses.Map.Map;
import dataClasses.Map.Position;

public class Move {
    public static void moveToMapCellByCardinalDirections(Player currentPlayer, Map.DIRECTION direction){
        Position newPlayerPosition;

        switch (direction){
            case NORTH:
                newPlayerPosition = new Position(currentPlayer.getCurrentPosition().getPosition().getX(),
                        currentPlayer.getCurrentPosition().getPosition().getY() + 1);
                currentPlayer.setCurrentPositionViaPosition(newPlayerPosition);
                //TODO: make this print better
                currentPlayer.getCurrentPosition().printDescription();
                break;
            case SOUTH:
                newPlayerPosition = new Position(currentPlayer.getCurrentPosition().getPosition().getX(),
                        currentPlayer.getCurrentPosition().getPosition().getY() - 1);
                currentPlayer.setCurrentPositionViaPosition(newPlayerPosition);
                break;
            default:
                System.out.println("Direction not recognized.");
                break;
        }

    }
}
