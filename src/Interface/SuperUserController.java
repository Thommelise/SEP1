package Interface;

import Model.MainDomain;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class SuperUserController {
    @FXML AnchorPane rootPane;

    MainDomain domain = new MainDomain();

    @FXML
    void  addNewUserButton (javafx.event.ActionEvent event) {

    try{
        AnchorPane addNewUserButton = FXMLLoader.load(getClass().getResource("AddNewUserScene.fxml"));
        rootPane.getChildren().setAll(addNewUserButton);

    }
    catch (IOException e){e.printStackTrace();


}}}
