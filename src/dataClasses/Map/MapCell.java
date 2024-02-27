package dataClasses.Map;

import dataClasses.Enemies.Entity;

import java.util.List;

public class MapCell {
    public String title;
    String description;
    List<Entity> availableEntitiesInCell;
    Position position;

    public MapCell(){
    }
    public MapCell(String title, String description){
        this.title = title;
        this.description = description;
    }

    public MapCell(String title, String description, List<Entity> availableEntitiesInCell, Position position) {
        this.title = title;
        this.description = description;
        this.availableEntitiesInCell = availableEntitiesInCell;
        this.position = position;
    }

    public List<Entity> getAvailableEntitiesInCell() {
        return availableEntitiesInCell;
    }

    public void setAvailableEntitiesInCell(List<Entity> availableEntitiesInCell) {
        this.availableEntitiesInCell = availableEntitiesInCell;
    }

    public void setPosition(Position position){
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    //TODO: move and rework
    public void printDescription(){
            System.out.println(this.description);
    }
}
