package serviceClasses;

import dataClasses.Entity;

public class Combat {

    //Method to calculate the damage of an attack
    public static int calculateDamage(int AP, int armor) {
        return AP - armor;
    }
    //Method to apply the damage to the entity
    public static void applyDamage(int damage, Entity entity) {
        entity.setHP(entity.getHP() - damage);
    }
    //Method to check if the entity is dead
    public static boolean isDead(Entity entity) {
        return entity.getHP() <= 0;
    }
    //Method to heal the entity by a certain amount
    public static void heal(int amount, Entity entity) {
        entity.setHP(entity.getHP() + amount);
    }

}
