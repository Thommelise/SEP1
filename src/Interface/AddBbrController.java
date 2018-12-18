package Interface;

import Model.BBR;
import Model.Main;
import Model.MainDomain;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;

public class AddBbrController {

    MainDomain domain = LoginController.domain;
    @FXML
    TextField textField = new TextField();

    @FXML
    void addBbr() {

        String address = null;
        boolean addressFree = true;
        try{
            address = textField.getText();
        }catch(Exception e){}

        for(BBR bbr : domain.getBbr()){
            if(address == bbr.getAddress()){
                addressFree = false;
            }
        }
        if (addressFree == true){
            domain.addBbr(address);
        }
        addressFree = true;
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
