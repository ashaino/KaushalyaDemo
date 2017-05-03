package controllers;

import components.ViewProperties;
import config.Instancer;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Ashain on 5/2/2017.
 */
public class Controller {

    private String defaultTitle;

    public Controller (){
        //initializing data
        this.defaultTitle="";
    }

    protected void setDefaultTitle(String title){
        this.defaultTitle=title;
    }

    protected String getDefaultTitle(){
        return this.defaultTitle;
    }

    /**
     * load view by passing all params
     * */
    public void  render(ViewProperties prop){

        Stage primaryStage = Instancer.getStage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(prop.viewPath));
            primaryStage.setTitle( prop.title!=null?prop.title:this.getDefaultTitle());

        } catch (IOException e) {
            e.printStackTrace();
        }

        primaryStage.setScene(new Scene(root, prop.width, prop.height));
        primaryStage.show();
    }

}
