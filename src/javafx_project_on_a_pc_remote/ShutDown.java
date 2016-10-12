package javafx_project_on_a_pc_remote;

import java.awt.Desktop;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.*;
import javax.swing.JOptionPane;

public class ShutDown extends Application implements EventHandler<ActionEvent> {
//here Application contains Scene //Scene contains Pane//Pane contains UI components.

    Pane root = new Pane();
    TextField txt_hours, txt_min, txt_seconds;
    Label hours_lbl, min_lbl, seconds_lbl;
    Button ok_btn;
    String s1, s2, s3;
    int a, b, c, d;

    public void start(Stage primaryStage) {
        ////////////
        hours_lbl = new Label("Enter Hours : ");
        txt_hours = new TextField();
        hours_lbl.setLayoutX(100);
        hours_lbl.setLayoutY(100);
        txt_hours.setLayoutX(200);
        txt_hours.setLayoutY(100);
        root.getChildren().add(hours_lbl);
        root.getChildren().add(txt_hours);
        /////////////
        min_lbl = new Label("Enter Minute : ");
        txt_min = new TextField();
        min_lbl.setLayoutX(100);
        min_lbl.setLayoutY(150);
        txt_min.setLayoutX(200);
        txt_min.setLayoutY(150);
        root.getChildren().add(min_lbl);
        root.getChildren().add(txt_min);
        ///////////
        seconds_lbl = new Label("Enter Minute : ");
        txt_seconds = new TextField();
        seconds_lbl.setLayoutX(100);
        seconds_lbl.setLayoutY(200);
        txt_seconds.setLayoutX(200);
        txt_seconds.setLayoutY(200);
        root.getChildren().add(seconds_lbl);
        root.getChildren().add(txt_seconds);
        ////////////
        ok_btn = new Button("OK SHUT DOWN");
        ok_btn.setOnAction(this);
        ok_btn.setLayoutX(180);
        ok_btn.setLayoutY(280);
        root.getChildren().add(ok_btn);

        Scene s = new Scene(root, 500, 400);
        primaryStage.setTitle("Project On a PC Remote");
        // primaryStage.setScene(new Scene(root, 600, 550));
        primaryStage.setScene(s);
        primaryStage.show();
    }

   /* public static void main(String[] args) {
        launch(args);
    }*/

    @Override
    public void handle(ActionEvent event) {

        if (event.getSource() == ok_btn) {

            s1 = new String();
            s2 = new String();
            s3 = new String();
            if ((txt_hours.getText().equals("")) && (txt_min.getText().equals("")) && (txt_seconds.getText().equals(""))) {
                JOptionPane.showConfirmDialog(null, "Please!!!Enter connect value");
            } else {
                s1 = txt_hours.getText();
                a = Integer.valueOf(s1);
                s2 = txt_min.getText();
                b = Integer.valueOf(s2);
                s3 = txt_seconds.getText();
                c = Integer.valueOf(s3);
                d = (a * 60 * 60) + (b * 60) + c;
                try {

                    Runtime rt = Runtime.getRuntime();
                    Process proc = rt.exec("shutdown -s -t " + d);

                } 
                catch (Exception e) 
                {
                      JOptionPane.showConfirmDialog(null, "Please!!!!Enter connect value");
                }

            }

        }
    }
}
