package serviceClasses;

import dataClasses.Entity;

public class Combat {

    // Callback interface
    public interface CombatCallback {
        void onDamageApplied(int damage, Entity entity);
        void onHealApplied(int amount, Entity entity);
        void onEntityDied(Entity entity);
    }

    private CombatCallback callback;

    public Combat(CombatCallback callback) {
        this.callback = callback;
    }

    //Method to calculate the damage of an attack
    public int calculateDamage(int AP, int armor) {
        return AP - armor;
    }

    //Method to apply the damage to the entity
    public void applyDamage(int damage, Entity entity) {
        entity.setHP(entity.getHP() - damage);
        callback.onDamageApplied(damage, entity);
        if (isDead(entity)) {
            callback.onEntityDied(entity);
        }
    }

    //Method to heal the entity by a certain amount
    public void applyHeal(int amount, Entity entity) {
        entity.setHP(entity.getHP() + amount);
        callback.onHealApplied(amount, entity);
    }

    //Method to check if the entity is dead
    public boolean isDead(Entity entity) {
        return entity.getHP() <= 0;
    }

    //Method to check if the entity is at full health
    public boolean isAtFullHealth(Entity entity) {
        return entity.getHP() == 100;
    }
}