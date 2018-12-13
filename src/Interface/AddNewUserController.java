package Interface;

import Model.MainDomain;
import javafx.fxml.FXML;

import java.awt.*;

public class AddNewUserController {

    MainDomain domain = new MainDomain();
    @FXML private TextField name;
    @FXML private TextField emailaddress;
    @FXML private TextField username;
    @FXML private TextField role;
    @FXML private TextField password;

    @FXML
    void addNewUser (javafx.event.ActionEvent event){

    domain.addUser(name.getText(),emailaddress.getText() ,username.getText() ,role.getText() , ,password.getText() );
}
}
