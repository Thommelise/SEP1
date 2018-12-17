package Interface;

import Model.*;
import Model.MainDomain;
import Model.Meter;
import Model.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;


public class ConsumptionController {

    @FXML
    private ComboBox showUser;
    private ComboBox selectedType;


    MainDomain domain = new MainDomain();

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
        User tempUser = (User) showUser.getValue();
        ArrayList<Meter> userMeters = tempUser.getBbrData().getMeters();
        ArrayList<Meter> selectedMeters = new ArrayList<>();
        for(int i = 0; i<userMeters.size(); i++){
            if(userMeters.get(i).getType().equals(selectedType.getValue())){
                selectedMeters.add(userMeters.get(i));
            }

        }

    }

    @FXML
    void ShowEnum(){
        MeterType[] types = new MeterType[MeterType.values().length];
       for(int i = 0; i<types.length;i++){
           selectedType.getItems().add(types[i]);
       }
    }

    @FXML
    void ShowUser(javafx.event.ActionEvent event) {

        for(int i = 0; i<domain.getUsers().size();i++) {

            showUser.getItems().add(domain.getUsers().get(i));

        }

    }

}
