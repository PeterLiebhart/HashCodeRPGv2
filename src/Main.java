import Classes.Entities.Base.Entity;
import Data.Enemies.Bestiarium;
import Classes.Entities.Player;
import Data.Story.Storyline;
import Services.Initializers.InitializeData;

import java.util.List;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InitializeData.initializeData();

        Player currentPlayer = new Player();
        currentPlayer.createPlayer();

        Storyline.printRoomIntroduction();

        boolean runGame = true;
        while (runGame){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What would you like to do?");

            String input = scanner.nextLine();
            if(Objects.equals(input.toLowerCase().replaceAll("\\s+",""), "lookaround")){
                currentPlayer.getCurrentPosition().printDescription();
            }

            /*Combat combat = new Combat(currentPlayer.getPlayerEntity(), new ArrayList<>(List.of(spawnEnemy())));
            combat.startCombat();

            while (combat.isCombatActive){
                Combat.Action action = currentPlayer.getPlayerEntity().decideAction();
                combat.combatRound(action);
            }*/
        }
    }

    public static Entity spawnEnemy(){
        List<Entity> enemies = Bestiarium.getInstance().getEntitiesByName("Goblin");
        Entity currentEnemy = enemies.getFirst();
        System.out.println("A " + currentEnemy.name + " appeared!");
        return currentEnemy;
    }
}