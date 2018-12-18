package Interface;

import Model.Main;
import Model.MainDomain;
import Model.Meter;
import Model.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class ActiveController {
    MainDomain domain = LoginController.domain;
    @FXML
    TextArea output = new TextArea();

    @FXML
    void 

    @FXML
    void deactivateMeters(){

    }

    @FXML
    void showActiveMeters() {

        for (User user:domain.getUsers()){
            for (Meter meter: user.getBbrData().getMeters()){
                if(meter.isActive()){
                    output.appendText(user.getBbrData().getAddress()+","+meter.getType().name()+","+meter.isActive()+"\r\n");
                }
            }
        }
    }


    @FXML
    void homeButton (){
        try {
            URL homeButtonUrl = getClass().getResource("../Interface/SuperUser.fxml");
            AnchorPane homeButton = FXMLLoader.load(homeButtonUrl);
            BorderPane border = Main.getRoot();
            border.setCenter(homeButton);
        }catch (IOException e){e.printStackTrace();}}
}
