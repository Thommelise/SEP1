package Interface;

import Model.BBR;
import Model.MainDomain;
import javafx.fxml.FXML;

public class ConsumptionController {


    MainDomain domain = new MainDomain();

    @FXML
    void ShowConsumption (javafx.event.ActionEvent event){

        System.out.println(domain.toString());
    }

    @FXML
    void ShowUser(javafx.event.ActionEvent event) {

        domain.u
    }

}
