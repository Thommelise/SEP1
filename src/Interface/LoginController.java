package Interface;

import Handlers.UserValidationHandler;
import javafx.fxml.FXMLLoader;
import Model.MainDomain;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;


public class LoginController {
    @FXML  private TextField user;
    @FXML  private TextField password;
    @FXML AnchorPane rootPane;


    MainDomain domain = new MainDomain();

    @FXML
    void  loginButton (javafx.event.ActionEvent event){
       if (domain.login(user.getText(), password.getText())!=null) {

          try {

              AnchorPane superUser = FXMLLoader.load(getClass().getResource("SuperUser.fxml"));
              rootPane.getChildren().setAll(superUser);




          }
          catch (IOException e){e.printStackTrace();

    }


}}}