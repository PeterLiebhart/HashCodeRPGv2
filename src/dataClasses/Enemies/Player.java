package dataClasses.Enemies;

import dataClasses.Map.Map;
import dataClasses.Map.MapCell;
import dataClasses.Map.Position;

public class Player {
    private static Entity playerEntity;
    private static MapCell currentPosition;
    private static Player single_instance = null;

    public Player(){
    }

    public static synchronized Player getInstance()
    {
        if (single_instance == null)
            single_instance = new Player();

        return single_instance;
    }

    public static void setPlayerEntity(Entity currentPlayer){
        playerEntity = currentPlayer;
    }

    public static Entity getPlayerEntity() {
        return playerEntity;
    }

    public static String getPlayerName() {
        return playerEntity.getName();
    }

    public static MapCell getCurrentPosition(){
        return currentPosition;
    }

    public static void setCurrentPositionViaPosition(Position position){
        setCurrentPositionViaMapCell(Map.getInstance().getMapCellByPosition(position));
    }

    public static void setCurrentPositionViaMapCell(MapCell mapCell){
        Player.currentPosition = mapCell;
    }
}
