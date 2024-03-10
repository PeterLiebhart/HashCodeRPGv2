package dataClasses;

public class Player extends Entity {

    private static Player instance;

    //Private constructor to prevent other classes from instantiating it
    private Player(String name, int HP, int AP, int armor) {
        super(name, HP, AP, armor);
    }

    //Singleton pattern. If the instance is null, it creates a new one. If it's not, it returns the existing one.
    //Use this as if it was a constructor, but without the "new" keyword
    public static Player getInstance(String name, int HP, int AP, int armor) {
        if (instance == null) {
            instance = new Player(name, HP, AP, armor);
        }
        return instance;
    }

    public void reset(String name, int HP, int AP, int armor) {
        this.setName(name);
        this.setHP(HP);
        this.setAP(AP);
        this.setArmor(armor);
    }


}
