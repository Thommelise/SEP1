package Interface;

import Handlers.CreateBBR;
import Model.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;

public class AddMeterController {
    @FXML AnchorPane rootPane;
    MainDomain domain = LoginController.domain;
    @FXML
    ComboBox comboBox = new ComboBox();
    @FXML
    ComboBox comboBox1 = new ComboBox();
    @FXML
    void setComboBox (){
        comboBox.getItems().clear();
        for (MeterType meterType:MeterType.values()){
            comboBox.getItems().add(meterType);
        }
    }
    @FXML
    void setComboBox1 (){
        comboBox1.getItems().clear();
        for (BBR bbr:domain.getBbr()){
            comboBox1.getItems().add(bbr.getAddress());
        }
    }
@FXML
    void addMeter () {
        for (BBR bbr: domain.getBbr()) {
            if(((String) comboBox1.getValue()) == bbr.getAddress()){
                domain.addMeter(bbr, MeterType.valueOf((String) comboBox.getValue()),domain.bbrSize()+1);
            }
        }
    }
    @FXML
    void homeButton (){
        try {
            URL homeButtonUrl = getClass().getResource("../Interface/SuperUser.fxml");
            AnchorPane homeButton = FXMLLoader.load(homeButtonUrl);
            BorderPane border = Main.getRoot();
            border.setCenter(homeButton);
        }catch (IOException e){e.printStackTrace();}}
}
