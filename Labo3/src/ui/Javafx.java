package ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import launcher.App;

import javax.swing.*;

public class Javafx {

    public static String drawMainMenu(){
        String menu = "1. Add party item\n" +
                "2. Remover paryt item\n" +
                "3. Rent party item\n" +
                "4. Return party item\n" +
                "5. Repair party item\n" +
                "6. Show available party items\n\n" +
                "0. Quit\n\n" +
                "Make your choice:";
        return JOptionPane.showInputDialog(menu);
    }

    public static String addPartyItemName(){
        String menu = "Give a name:";
        return JOptionPane.showInputDialog(menu);
    }

    public static String addPartyItemPrice(){
        String menu = "Give a price:";
        return JOptionPane.showInputDialog(menu);
    }

    public static void showList(String list){
        JOptionPane.showMessageDialog(null,list);
    }

    public static String giveId(){
        String menu = "Give the id:";
        return JOptionPane.showInputDialog(menu);
    }

    public static String checkDamage(){
        String menu = "Is the item damaged:\n" +
            "1. yes\n" +
            "2. no";
        return JOptionPane.showInputDialog(menu);
    }


/*

    private static Stage primaryStage;

    public static void main(String[] args) {
        Scene scene = new Scene();
        Stage stage = new Stage();
        start(stage);
    }

    public static void start(Stage primaryStage){
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }

 */
}
