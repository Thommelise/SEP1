package Interface;

import Model.BBR;
import Model.MainDomain;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.io.IOException;

public class AddNewUserController {

    MainDomain domain = new MainDomain();
    @FXML private TextField name;
    @FXML private TextField emailaddress;
    @FXML private TextField username;
    @FXML private TextField role;
    @FXML private TextField password;
    @FXML AnchorPane rootPane;

    @FXML
    void addNewUser (javafx.event.ActionEvent event){

    domain.addUser(name.getText(),emailaddress.getText() ,username.getText() ,role.getText() , domain.getBbrObject(),password.getText() );
}

@FXML
    void Home (javafx.event.ActionEvent event) throws IOException {

    AnchorPane superUser = FXMLLoader.load(getClass().getResource("SuperUser.fxml"));
    rootPane.getChildren().setAll(superUser);
}
}
