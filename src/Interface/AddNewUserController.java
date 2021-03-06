package Interface;

import Model.BBR;
import Model.Main;
import Model.MainDomain;
import Model.Role;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class AddNewUserController {

    MainDomain domain = LoginController.domain;
    @FXML private javafx.scene.control.TextField name;
    @FXML private javafx.scene.control.TextField emailaddress;
    @FXML private javafx.scene.control.TextField username;
    @FXML private javafx.scene.control.TextField role;
    @FXML private javafx.scene.control.TextField password;
    @FXML private javafx.scene.control.ComboBox address;
    @FXML AnchorPane rootPane;



    @FXML
    void homeButton() {
        try {
            URL homeButton = getClass().getResource("../Interface/SuperUser.fxml");
            AnchorPane home = FXMLLoader.load(homeButton);
            BorderPane border = Main.getRoot();
            border.setCenter(home);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void loadUsers (){
        address.getItems().clear();
        for (BBR bbr: domain.getBbr()) {
            address.getItems().add(bbr.getAddress());
        }
    }

    @FXML
    void addNewUser (javafx.event.ActionEvent event){

        for (BBR bbr:domain.getBbr()) {
            if (bbr.getAddress() == ((String) address.getValue())){
                domain.addUser(name.getText(), emailaddress.getText(), username.getText(), (Role.valueOf(role.getText().toUpperCase())), bbr, password.getText());
            }

        }

    name.clear();
    emailaddress.clear();
    username.clear();
    role.clear();
    password.clear();

}

@FXML
    void Home (javafx.event.ActionEvent event) throws IOException {

    AnchorPane superUser = FXMLLoader.load(getClass().getResource("Interface/SuperUser.fxml"));
    rootPane.getChildren().setAll(superUser);
}
}
