package Model;



import com.sun.jndi.toolkit.url.Uri;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
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
        //launch(args);
        MainDomain domain = new MainDomain();
        domain.addBbr("Horsens");
        domain.addUser("Sebastian","sebstian@via.dk","seb123",Role.SUPERUSER,domain.getBbrObject("Horsens"),"123");
        User user = domain.login("seb123","123");
        domain.addMeter(user.getBbrData(),MeterType.Heat,1);
        domain.addConsumption(user.getBbrData().getMeter(0),1000,Role.SUPERUSER);
    }
}



