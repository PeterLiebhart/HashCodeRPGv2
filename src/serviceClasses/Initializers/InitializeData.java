package Services.Initializers;

import static Services.Initializers.EnemyInitializor.initializeEnemies;
import static Services.Initializers.MapInitializor.initializeMap;

public class InitializeData {
    public static String MAP_FILEPATH = "C:\\Users\\everyone codes\\IdeaProjects\\hashCodeRPG\\Cardinal\\src\\XMLFile\\Map.xml";
    public static String ENEMIES_FILEPATH = "C:\\Users\\everyone codes\\IdeaProjects\\hashCodeRPG\\Cardinal\\src\\XMLFile\\Enemies.xml";
    public static void initializeData(){
        try{
            initializeEnemies(ENEMIES_FILEPATH);
            initializeMap(MAP_FILEPATH);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
