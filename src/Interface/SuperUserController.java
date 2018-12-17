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
    void logOutButton () {
        try{
        URL logOutUrl = getClass().getResource("../Interface/LoginScene.fxml");
        AnchorPane logOut = FXMLLoader.load(logOutUrl);
        BorderPane border = Main.getRoot();
        border.setCenter(logOut);
    }catch(IOException e){e.printStackTrace();}}


    @FXML
    void activeUserButton (javafx.event.ActionEvent event) {
        try{
        URL activeUserButton = getClass().getResource("../Interface/ActiveScene.fxml");
        AnchorPane activeUser = FXMLLoader.load(activeUserButton);
        BorderPane border = Main.getRoot();
        border.setCenter(activeUser);

    }catch (IOException e){e.printStackTrace();}}

    @FXML
    void inactiveUserButton (javafx.event.ActionEvent event){
        try {
            URL inactiveUserButton =getClass().getResource("../Interface/InactiveScene.fxml");
            AnchorPane inactiveUser = FXMLLoader.load(inactiveUserButton);
            BorderPane border = Main.getRoot();
            border.setCenter(inactiveUser);

    }catch (IOException e){ e.printStackTrace();}}

    @FXML
    void deleteUserButton (javafx.event.ActionEvent event) {
        try {
            URL deleteUserButtonUrl = getClass().getResource("../Interface/DeleteUserScene.fxml");
            AnchorPane deleteUser = FXMLLoader.load(deleteUserButtonUrl);
            BorderPane border = Main.getRoot();
            border.setCenter(deleteUser);
        } catch (IOException e){e.printStackTrace();}
    }

    @FXML
    void userButton (javafx.event.ActionEvent event){
        try {
            URL userButtonUrl = getClass().getResource("../Interface/UserScene.fxml");
            AnchorPane user = FXMLLoader.load(userButtonUrl);
            BorderPane border = Main.getRoot();
            border.setCenter(user);
        }catch(IOException e){e.printStackTrace();}
    }

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


