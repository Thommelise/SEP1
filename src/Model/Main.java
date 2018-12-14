package Model;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../Interface/LoginScene.fxml"));
        primaryStage.setTitle("Energy");
        primaryStage.setScene(new Scene(root, 676  , 477));
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



