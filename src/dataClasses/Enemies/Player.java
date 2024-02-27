package dataClasses.Enemies;

import dataClasses.Map.Map;
import dataClasses.Map.MapCell;
import dataClasses.Map.Position;

public class Player {
    private static Entity player;
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

    public MapCell getCurrentPosition(){
        return currentPosition;
    }

    public void setCurrentPositionViaPosition(Position position){
        setCurrentPositionViaMapCell(Map.getInstance().getMapCellByPosition(position));
    }

    public void setCurrentPositionViaMapCell(MapCell mapCell){
        Player.currentPosition = mapCell;
    }
}
