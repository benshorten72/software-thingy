package sample;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Controller implements Initializable {

    public static int seconds;
    public static boolean yes = false;
    public String strtime = String.format("Current Date/Time : %tc", new Date());

    @FXML
    Button remind,remindset;
    @FXML
    Label secondsuntil,date;
    @FXML
    TextField remindwhen, remindname;
    @FXML
    private Button Butt;
    static String Nameoftask;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        date.setText(strtime);
    }



    @FXML
    private void handleButtonAction(ActionEvent actionEvent) throws IOException {

        String gettext = remindwhen.getText();
        Nameoftask = remindname.getText();
        seconds = Integer.parseInt(gettext);
        new Reminder(seconds);


        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Popup.fxml"));
        primaryStage.setTitle(Nameoftask);
        primaryStage.initModality(Modality.NONE);
        primaryStage.setScene(new Scene(root, 200,50));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        primaryStage.setX(width);
        primaryStage.setY(height*-1);
        primaryStage.show();


        try {
            FXMLLoader loader = new
                    FXMLLoader(getClass().getResource("Popup.fxml"));
            loader.setController(new Controller());

            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}


