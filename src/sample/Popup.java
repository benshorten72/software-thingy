package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;


/**
 * Created by benshorten on 22/10/2018.
 */
public class Popup implements Initializable{
    @FXML
    public javafx.scene.control.Button Dismiss;
    @FXML
    public javafx.scene.control.Label remind;

    @FXML
    Label nameoftask;

    @FXML
    public void handleButtonAction(ActionEvent event){
        Stage stage = (Stage) Dismiss.getScene().getWindow();
        stage.close();
    }


    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub

    }

}


