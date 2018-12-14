package Interface;

import Model.Main;
import javafx.fxml.FXMLLoader;
import Model.MainDomain;
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
    @FXML Scene root;



    MainDomain domain = new MainDomain();

    @FXML
    void  loginButton (javafx.event.ActionEvent event){

       // if (domain.login(user.getText(), password.getText())!=null) {
         try {

             URL superUserUrl = getClass().getResource("SuperUser.fxml");
             AnchorPane superUser = FXMLLoader.load(superUserUrl);

             BorderPane border = Main.getRoot();
             border.setCenter(superUser);




          }
         catch (IOException e){e.printStackTrace();

    }}}


