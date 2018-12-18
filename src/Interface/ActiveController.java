package Interface;

import Model.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class ActiveController {
    MainDomain domain = LoginController.domain;
    @FXML
    TextArea output = new TextArea();

    @FXML
    ComboBox addressBox = new ComboBox();

    @FXML
    ComboBox meterTypeBox = new ComboBox();

    @FXML
    ComboBox statusBox = new ComboBox();

    @FXML
    void setAddressBox() {
        addressBox.getItems().clear();
        for (BBR bbr : domain.getBbr()){
            addressBox.getItems().add(bbr.getAddress());
        }
    }

    @FXML
    void setMeterTypeBox() {
        meterTypeBox.getItems().clear();
        for (MeterType meterType:MeterType.values()){
            meterTypeBox.getItems().add(meterType.name());
        }
    }

    @FXML
    void setStatusBox() {
        statusBox.getItems().clear();
        statusBox.getItems().add("Activate");
        statusBox.getItems().add("Inactive");
    }

    @FXML
    void execute() {
        for (BBR bbr : domain.getBbr()){
            if(bbr.getAddress() == ((String)addressBox.getValue())){
                for (Meter meter:bbr.getMeters()){
                    if(meter.getType().name() == (String)meterTypeBox.getValue()) {
                        if ((String) statusBox.getValue() == "Active") {
                            if (meter.isActive() != true){
                                meter.toggleActive();
                            }
                        } else if ((String) statusBox.getValue() == "Inactive") {
                            if (meter.isActive() != false){
                                meter.toggleActive();
                            }
                        }
                    }
                }
            }
        }
    }




    @FXML
    void showDeactivateBox(){
        output.clear();
        for(BBR bbr:domain.getBbr()){
            for(Meter meter:bbr.getMeters()){
                if(!meter.isActive()) {
                    output.appendText(bbr.getAddress() + "," + meter.getType().name() + "," + meter.isActive() + "\r\n");
                }
            }
        }
    }

    @FXML
    void showActiveMeters() {
        output.clear();
        for (BBR bbr:domain.getBbr()){
            for (Meter meter: bbr.getMeters()){
                if(meter.isActive()){
                    output.appendText(bbr.getAddress()+","+meter.getType().name()+","+meter.isActive()+"\r\n");
                }
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
