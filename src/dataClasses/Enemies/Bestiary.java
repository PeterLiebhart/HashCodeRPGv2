package dataClasses.Enemies;

import java.util.List;
import java.util.Objects;

public class Bestiary {
    private static Bestiary single_instance = null;
    private static List<Entity> entities;

    public Bestiary() {
    }
    public static synchronized Bestiary getInstance()
    {
        if (single_instance == null)
            single_instance = new Bestiary();

        return single_instance;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        Bestiary.entities = entities;
    }

    public List<Entity> getEntitiesByName(String name){
        return getEntities().stream().filter(x -> Objects.equals(x.getName(), name)).toList();
    }

    public Entity getEntityByID(int id){
        return getEntities().stream().filter(x -> x.getId() == id).toList().getFirst();
    }
}
