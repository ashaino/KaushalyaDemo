package config;

import javafx.stage.Stage;

/**
 * Created by Ashain on 5/2/2017.
 */
public final class Instancer {

    static Stage primaryStage = null;

    public static void setStage(Stage priStage){
        Instancer.primaryStage=priStage;
    }

    public static Stage getStage(){
        return primaryStage;
    }
}
