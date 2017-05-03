import config.Instancer;
import controllers.CalController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Instancer.setStage(primaryStage);
        new CalController().index();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
