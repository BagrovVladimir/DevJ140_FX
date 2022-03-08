/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import settings.Settings;

/**
 *
 * @author Владимир
 */
public class ConnectionStage extends Stage{
    
    Scene scene;
    Label infoLabel;
    GridPane root;
    
    public void init(){
        
        root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setAlignment(Pos.CENTER);
        
        FlowPane row1 = new FlowPane();
        Label label = new Label();
        String s = "Enter your login and password";
        label.setText(s);
        row1.getChildren().add(label);
        row1.setAlignment(Pos.CENTER);
        root.add(label, 0, 0);
        
        GridPane row2 = new GridPane();
        row2.setHgap(10);
        row2.setVgap(10);
        Label urlLabel = new Label("URL: ");
        row2.add(urlLabel, 0, 0);
        TextField urlField = new TextField();
        row2.add(urlField, 1, 0);
        Label loginLabel = new Label("Login: ");
        row2.add(loginLabel, 0, 1);
        TextField loginField = new TextField();
        row2.add(loginField, 1, 1);
        Label passLabel = new Label("Password: ");
        row2.add(passLabel, 0, 2);
        PasswordField passwordField = new PasswordField();
        row2.add(passwordField, 1, 2);
        root.add(row2, 0, 1);
        
        FlowPane row3 = new FlowPane();
        Button signIn = new Button("Sign in");
        signIn.setOnAction(e ->{
            Settings settings = new Settings();
            if(!urlField.getText().equals(settings.getValue(Settings.URL))
                    || !loginField.getText().equals(settings.getValue(Settings.LOGIN))
                    || !passwordField.getText().equals(settings.getValue(Settings.PSW)))
                {infoLabel.setText("Something wrong");}
            else {infoLabel.setText("Everything ok");
                TableStage tableStage = new TableStage();
                tableStage.init();
            }
           //infoLabel.setText("to be continued");
        });
        row3.getChildren().add(signIn);
        row3.setAlignment(Pos.CENTER);
        root.add(row3, 0, 2);
        
        FlowPane row4 = new FlowPane();
        infoLabel = new Label();
        row4.getChildren().add(infoLabel);
        row4.setAlignment(Pos.CENTER);
        root.add(row4, 0, 3);
        
        scene = new Scene(root, 250, 300);
        
        this.setTitle("Connection with DataBase");
        this.setScene(scene);
        this.show();
    }
}
