package Model;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.net.URL;



public class Main extends Application {
    private static BorderPane root = new BorderPane();

    public static BorderPane getRoot(){
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        URL loginSceneURL = getClass().getResource("../Interface/LoginScene.fxml");
        AnchorPane loginScene = FXMLLoader.load(loginSceneURL);
        root.setCenter(loginScene);

        Scene scene = new Scene(root,676,477);
        primaryStage.setTitle("");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);

    }
}



