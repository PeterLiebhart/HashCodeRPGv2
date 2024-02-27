package serviceClasses;

import dataClasses.Enemies.Bestiary;
import dataClasses.Enemies.Entity;
import dataClasses.Enemies.Player;
import dataClasses.Map.MapCell;

import java.util.List;

public class EnemySpawner {

    public static Entity spawnEnemyViaEnemyName(String name){
        List<Entity> enemies = Bestiary.getInstance().getEntitiesByName(name);
        Entity currentEnemy = enemies.getFirst();
        printEnemyAppearance(currentEnemy);
        return currentEnemy;
    }
    public static Entity spawnRandomEnemyViaMapCell(MapCell mapCell){
        Entity currentEnemy = mapCell.getRandomAvailableEnemy();
        printEnemyAppearance(currentEnemy);
        return currentEnemy;
    }
    public static Entity spawnRandomEnemyViaCurrentPlayer(Player currentPlayer){
        Entity currentEnemy = spawnRandomEnemyViaMapCell(currentPlayer.getCurrentPosition());
        printEnemyAppearance(currentEnemy);
        return currentEnemy;
    }
    private static void printEnemyAppearance(Entity enemy){
        System.out.println("A " + enemy.name + " appeared!");
    }
}
