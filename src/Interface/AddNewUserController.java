package Interface;

import Model.MainDomain;
import Model.Role;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.io.IOException;

public class AddNewUserController {

    MainDomain domain = new MainDomain();
    @FXML private javafx.scene.control.TextField name;
    @FXML private javafx.scene.control.TextField emailaddress;
    @FXML private javafx.scene.control.TextField username;
    @FXML private javafx.scene.control.TextField role;
    @FXML private javafx.scene.control.TextField password;
    @FXML private javafx.scene.control.TextField address;
    @FXML AnchorPane rootPane;


    @FXML
    void addNewUser (javafx.event.ActionEvent event){


    domain.addUser(name.getText(),emailaddress.getText() ,username.getText() ,(Role.valueOf(role.getText())) , domain.getBbrObject(address.getText()),password.getText() );
}

@FXML
    void Home (javafx.event.ActionEvent event) throws IOException {

    AnchorPane superUser = FXMLLoader.load(getClass().getResource("Interface/SuperUser.fxml"));
    rootPane.getChildren().setAll(superUser);
}
}
