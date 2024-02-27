package serviceClasses.Initializers;

import static serviceClasses.Initializers.Data.EnemyInitializor.initializeEnemies;
import static serviceClasses.Initializers.Data.MapInitializor.initializeMap;

public class InitializeData {
    public static String MAP_FILEPATH = "C:\\Users\\everyone codes\\IdeaProjects\\#code_RPG\\HashCodeRPGv2\\src\\XMLFiles\\Map.xml";
    public static String ENEMIES_FILEPATH = "C:\\Users\\everyone codes\\IdeaProjects\\#code_RPG\\HashCodeRPGv2\\src\\XMLFiles\\Enemies.xml";
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
