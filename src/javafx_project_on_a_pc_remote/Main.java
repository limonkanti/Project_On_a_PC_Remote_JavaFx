package javafx_project_on_a_pc_remote;

import java.awt.Desktop;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class Main extends Application implements EventHandler<ActionEvent> {
//here Application contains Scene //Scene contains Pane//Pane contains UI components.

    private Stage stage;
    Button btn;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;
    Date date, date2;
    Desktop desktop = Desktop.getDesktop();
    Pane root = new Pane();

    public void start(Stage primaryStage) {

        btn = new Button("C-Drive");
        btn.setOnAction(this);
        btn.setLayoutX(50);
        btn.setLayoutY(50);
        root.getChildren().add(btn);
        //
        btn2 = new Button("D-Drive");
        btn2.setOnAction(this);
        btn2.setLayoutX(130);
        btn2.setLayoutY(50);
        root.getChildren().add(btn2);
        //
        btn3 = new Button("E-Drive");
        btn3.setOnAction(this);
        btn3.setLayoutX(210);
        btn3.setLayoutY(50);
        root.getChildren().add(btn3);
        //
        btn4 = new Button("F-Drive");
        btn4.setOnAction(this);
        btn4.setLayoutX(290);
        btn4.setLayoutY(50);
        root.getChildren().add(btn4);
        //
        btn5 = new Button("G-Drive");
        btn5.setOnAction(this);
        btn5.setLayoutX(370);
        btn5.setLayoutY(50);
        root.getChildren().add(btn5);
        //
        btn6 = new Button("Re-Start");
        btn6.setOnAction(this);
        btn6.setLayoutX(50);
        btn6.setLayoutY(150);
        root.getChildren().add(btn6);
        //
        btn7 = new Button("Shut-Down");
        btn7.setOnAction(this);
        btn7.setLayoutX(130);
        btn7.setLayoutY(150);
        root.getChildren().add(btn7);
        //
        date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        String str = sdf.format(date);
        btn8 = new Button(str);
        btn8.setLayoutX(240);
        btn8.setLayoutY(150);
        root.getChildren().add(btn8);
        //
        date2 = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("hh/MMMM/YYYY");
        String s3 = sdf2.format(date2);
        btn9 = new Button(s3);
        btn9.setLayoutX(320);
        btn9.setLayoutY(150);
        root.getChildren().add(btn9);
        //
        btn10 = new Button("SET TIME FOR SHUTTING DOWN PC AFTER SPECIFIC TIME");
        btn10.setOnAction(this);
        btn10.setLayoutX(70);
        btn10.setLayoutY(250);
        root.getChildren().add(btn10);
        //
        btn11 = new Button("SET TIME FOR RE-STARTING THE PC AFTER SPECIFIC TIME");
        btn11.setOnAction(this);
        btn11.setLayoutX(70);
        btn11.setLayoutY(350);
        root.getChildren().add(btn11);
        Scene s = new Scene(root, 500, 550);
        primaryStage.setTitle("Project On a PC Remote");
        // primaryStage.setScene(new Scene(root, 600, 550));
        primaryStage.setScene(s);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == btn) {

            try {

                File dirToOpen = new File("C:");
                desktop.open(dirToOpen);

            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "Sorry !!! Not Found Drive C");
                //System.out.println(ex);
            }

        }
        if (event.getSource() == btn2) {

            try {

                File dirToOpen = new File("D:");
                desktop.open(dirToOpen);

            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "Sorry !!! Not Found Drive C");
                //System.out.println(ex);
            }

        }

        if (event.getSource() == btn3) {

            try {

                File dirToOpen = new File("E:");
                desktop.open(dirToOpen);

            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "Sorry !!! Not Found Drive C");
                //System.out.println(ex);
            }

        }

        if (event.getSource() == btn4) {

            try {

                File dirToOpen = new File("F:");
                desktop.open(dirToOpen);

            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "Sorry !!! Not Found Drive C");
                //System.out.println(ex);
            }

        }

        if (event.getSource() == btn5) {

            try {

                File dirToOpen = new File("G:");
                desktop.open(dirToOpen);

            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "Sorry !!! Not Found Drive C");
                //System.out.println(ex);
            }

        }

        if (event.getSource() == btn6) {

            try {

                Runtime rt = Runtime.getRuntime();
                 Process proc=rt.exec("shutdown -r -t 1");

            } catch (Exception e6) {
                JOptionPane.showMessageDialog(null, "Not Valid!!!");
            }

        }

        if (event.getSource() == btn7) {

            try {

                Runtime rt = Runtime.getRuntime();
                Process proc = rt.exec("shutdown -s -t 1");

            } catch (Exception e6) {
                JOptionPane.showMessageDialog(null, "Not Valid!!!");
            }

        }
        if (event.getSource() == btn10) {

            Application app2 = new ShutDown();
            Stage anotherStage = new Stage();
            try {
                app2.start(anotherStage);
            } catch (Exception ex) {
                System.out.println("Error is.\t" + ex.toString());
            }

        }
        if (event.getSource() == btn11) {

            Application app2 = new ReStart();
            Stage anotherStage = new Stage();
            try {
                app2.start(anotherStage);
            } catch (Exception ex) {
                System.out.println("Error is.\t" + ex.toString());
            }

        } 
        
        

    }

}
