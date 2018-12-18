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

public class InactiveController {
    @FXML
    javafx.scene.control.TextArea output = new TextArea();

    public static MainDomain domain = LoginController.domain;

    @FXML
    void showInactiveMeters (){
        for (User user:domain.getUsers()){
            for (Meter meter: user.getBbrData().getMeters()){
                if(!meter.isActive()){
                    output.appendText(meter.getConsumptionString().toString());
                }
            }
        }
    }

    @FXML
    void homeButton() {
        try {
            URL homeButtonUrl = getClass().getResource("../Interface/SuperUser.fxml");
            AnchorPane homeButton = FXMLLoader.load(homeButtonUrl);
            BorderPane border = Main.getRoot();
            border.setCenter(homeButton);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}