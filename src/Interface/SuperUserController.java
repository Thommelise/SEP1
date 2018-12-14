package Interface;
import java.net.URL;
import Model.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;



public class SuperUserController {

    @FXML
    void  addNewUserButton (javafx.event.ActionEvent event) {

        try{

            URL addNewUserUrl = getClass().getResource("../Interface/AddNewUserScene.fxml");
            AnchorPane addNewUser = FXMLLoader.load(addNewUserUrl);
            BorderPane border = Main.getRoot();
            border.setCenter(addNewUser);
        }
        catch (IOException e) {
            e.printStackTrace();
        }}

    @FXML AnchorPane rootPane;

    @FXML
        void  consumptionButton (javafx.event.ActionEvent event) {

            try{

                URL consumptionUrl = getClass().getResource("../Interface/ConsumptionScene.fxml");
                AnchorPane consumption = FXMLLoader.load(consumptionUrl);
                BorderPane border = Main.getRoot();
                border.setCenter(consumption);
            }
            catch (IOException e) {
                e.printStackTrace();
            }}}


