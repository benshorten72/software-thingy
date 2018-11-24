package sample;

import java.awt.*;
import java.io.*;
import java.net.URL;
import java.util.*;

import javafx.animation.PauseTransition;
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
import javafx.util.Duration;

import static javafx.application.Application.launch;


public class Controller implements Initializable {

    public int seconds;
    public String strtime = String.format("Current Date/Time : %tc", new Date());

    @FXML
    Button remind, Butt,Set;
    @FXML
    Label secondsuntil, date;
    @FXML
    TextField Day, Minute, remindname;
    @FXML
    TextField c1,c2,c3,c4,c5,c6,c7,c8,c9;

    String Nameoftask;
    int days, minutes;

    static String c1text,c2text,c3text,c4text,c5text,c6text,c7text,c8text,c9text;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        date.setText(strtime);


        ///Seirlizing beignis
        Serilization object = new Serilization(1,"OOf");
        String filename = "file.ser";
        Serilization object1 = null;

        try
        {
            // Reading the object from a file=
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object1 = (Serilization)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");

            c1text=object1.c1seri;
            c2text=object1.c2seri;
            c3text=object1.c3seri;
            c4text=object1.c4seri;
            c5text=object1.c5seri;
            c6text=object1.c6seri;
            c7text=object1.c7seri;
            c8text=object1.c8seri;
            c9text=object1.c9seri;



        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
        c1.setText(c1text);
        c2.setText(c2text);
        c3.setText(c3text);
        c4.setText(c4text);
        c5.setText(c5text);
        c6.setText(c6text);
        c7.setText(c7text);
        c8.setText(c8text);
        c9.setText(c9text);

    }


    @FXML
    private void buttonSave(ActionEvent actionevent) {
        c1text=c1.getText();
        c2text=c2.getText();
        c3text=c3.getText();
        c4text=c4.getText();
        c5text=c5.getText();
        c6text=c6.getText();
        c7text=c7.getText();
        c8text=c8.getText();
        c9text=c9.getText();

        Serilization object = new Serilization(1, "geeksforgeeks");
        String filename = "file.ser";

        // Serialization
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }

    @FXML
    private void handleButtonAction(ActionEvent actionEvent) throws IOException {

        PauseTransition wait = new PauseTransition(Duration.minutes(seconds));
        wait.setOnFinished((e) -> {
            Stage primaryStage = new Stage();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("Popup.fxml"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            primaryStage.setTitle(Nameoftask);
            primaryStage.initModality(Modality.NONE);
            primaryStage.setScene(new Scene(root, 200, 50));
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            double width = screenSize.getWidth();
            double height = screenSize.getHeight();
            primaryStage.setX(width);
            primaryStage.setY(height * -1);
            primaryStage.show();

            try {
                FXMLLoader loader = new
                        FXMLLoader(getClass().getResource("Popup.fxml"));
                loader.setController(new Controller());

                primaryStage.show();
            } catch (Exception e2) {
                e2.printStackTrace();
            }

        });
        wait.play();

        String gettext = Day.getText();
        String getext = Minute.getText();
        Nameoftask = remindname.getText();
        days = Integer.parseInt(gettext);
        days *= 1440;
        minutes = Integer.parseInt(getext);
        minutes *= 60;
        seconds = days + minutes;


    }
    @FXML
    private void setvalues(ActionEvent c){
    }


     public static void main(String[] args) {
         {

         }

    }
}


