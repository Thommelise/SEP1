package Interface;

import Handlers.CreateConsumption;
import Model.*;
import Model.MainDomain;
import Model.Meter;
import Model.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;


public class ConsumptionController {

    @FXML
    ComboBox showUser = new ComboBox();
    @FXML
    ComboBox showEnum = new ComboBox();
    @FXML
    TextArea showConsumption = new TextArea();

    MainDomain domain = LoginController.domain;

    @FXML
    void homeButton (){
        try {
            URL homeButtonUrl = getClass().getResource("../Interface/SuperUser.fxml");
            AnchorPane homeButton = FXMLLoader.load(homeButtonUrl);
            BorderPane border = Main.getRoot();
            border.setCenter(homeButton);
        }catch (IOException e){e.printStackTrace();}}


    @FXML
    void ShowConsumptionButton(){


        ArrayList<Meter> userMeters = new ArrayList<Meter>();
        MeterType tempEnum = null;

        try {
            tempEnum = (MeterType) showEnum.getValue();

            for (User user:domain.getUsers()){
                if (showUser.getValue() == user.getInfo().getName()){
                    userMeters = (user).getBbrData().getMeters();
                }
            }
        } catch(Exception e){ e.printStackTrace();

        }

        for(int i = 0; i<userMeters.size(); i++){
            if(userMeters.get(i).getType().equals(tempEnum)){
                showConsumption.appendText(userMeters.get(i).getConsumptionString().toString());

            }

        }

    }

    @FXML
    void ShowEnum(){
        showEnum.getItems().clear();
        for (int i = 0; i<MeterType.values().length; i++){
            showEnum.getItems().add(MeterType.values()[i]);
        }

    }

    @FXML
    void ShowUser() {
        showUser.getItems().clear();
        for(User user :domain.getUsers()) {
            showUser.getItems().add(user.getInfo().getName());
        }

    }
@FXML
    void addConsumption(){
        for(BBR bbr:domain.getBbr()){
            for(Meter meter:bbr.getMeters()){
                if(meter.getType() == MeterType.HEAT) {
                    meter.addConsumption(CreateConsumption.createConsumption(((float) Math.random()*2), Unit.MWH));
                }else if(meter.getType() == MeterType.WATER){
                    meter.addConsumption(CreateConsumption.createConsumption(((float) Math.random()*10), Unit.M3));
                }else if(meter.getType() == MeterType.POWER){
                    meter.addConsumption(CreateConsumption.createConsumption(((float) Math.random()*12), Unit.KWH));
                }
            }
        }
    }
}
