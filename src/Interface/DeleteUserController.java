package Interface;

import Model.Main;
import Model.MainDomain;
import Model.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;

public class DeleteUserController {
    @FXML
    ComboBox comboBox = new ComboBox();
    MainDomain domain = LoginController.domain;

    @FXML
    void deleteUser() {

        for (User user: domain.getUsers()) {
            if (user.getInfo().getName() == comboBox.getValue()) {
                domain.removeUser(user);
                setComboBox();
            }
        }
    }

    @FXML
    void setComboBox (){
        comboBox.getItems().clear();
        for (int i = 0; i<domain.getUsers().size();i++){
            comboBox.getItems().addAll(domain.getUsers().get(i).getInfo().getName());

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