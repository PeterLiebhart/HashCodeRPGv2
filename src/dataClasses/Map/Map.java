package dataClasses.Map;

import java.util.List;
import java.util.Objects;

public class Map {
    List<MapCell> mapCells;
    private static Map single_instance = null;

    public enum DIRECTION {
        NORTH,
        EAST,
        SOUTH,
        WEST
    }

    public Map() {
    }

    public static synchronized Map getInstance()
    {
        if (single_instance == null)
            single_instance = new Map();

        return single_instance;
    }

    public List<MapCell> getMapCells() {
        return mapCells;
    }

    public void setMapCells(List<MapCell> mapCells) {
        this.mapCells = mapCells;
    }

    public MapCell getMapCellByCoordinates(int x, int y){
        return Map.getInstance().getMapCells().stream().filter(m ->  m.getPosition().getX() == x &&
                m.getPosition().getY() == y).toList().getFirst();
    }

    public MapCell getMapCellByPosition(Position position){
        return Map.getInstance().getMapCells().stream()
                .filter(m -> Objects.equals(m.getPosition(), position)).toList().getFirst();
    }
}
