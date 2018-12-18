package Interface;

import Model.Main;
import Model.MainDomain;
import Model.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;

public class UserController {
    public TextArea output;

public static MainDomain domain = LoginController.domain;
    @FXML
    void showUsers(){
        for (User user: domain.getUsers()){
            output.appendText(user.getInfo().getName()+"\r\n");
        }
    }

    @FXML
    void homeButton (){
        try {
            URL homeButtonUrl = getClass().getResource("../Interface/SuperUser.fxml");
            AnchorPane homeButton = FXMLLoader.load(homeButtonUrl);
            BorderPane border = Main.getRoot();
            border.setCenter(homeButton);
        }catch (IOException e){e.printStackTrace();}
    }
}
