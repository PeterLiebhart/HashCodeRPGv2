package dataClasses;

public class Entity {

    //Name of the entity
    private String name;

    //Level of the entity
    private int level;

    //Health Points
    private int HP;

    //Attack Points
    private int AP;

    //Armor Points
    private int armor;

    public Entity() {
    }
    public Entity(String name, int HP, int AP, int armor) {
        this.name = name;
        this.HP = HP;
        this.AP = AP;
        this.armor = armor;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public int getAP() {
        return AP;
    }

    public int getArmor() {
        return armor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setAP(int AP) {
        this.AP = AP;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
