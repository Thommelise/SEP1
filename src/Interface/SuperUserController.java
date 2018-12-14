package Interface;
import java.net.URL;
import java.util.ResourceBundle;

import Model.Main;
import Model.MainDomain;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;



public class SuperUserController {
    @FXML AnchorPane rootPane;

    MainDomain domain = new MainDomain();

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


