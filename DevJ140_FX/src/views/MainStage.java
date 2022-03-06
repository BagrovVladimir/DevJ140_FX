/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author Владимир
 */
public class MainStage extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setAlignment(Pos.CENTER);
        
        root.setCenter(vBox);
        
        Label label = new Label("Press \"Start\" to begin");
        Button start = new Button("Start");
        start.setOnAction(e ->{
            ConnectionStage connectionStage = new ConnectionStage();
            connectionStage.init();
            System.out.println("Done");
        });
        
        
        vBox.getChildren().addAll(label, start);
        
        Label label1 = new Label("All rights reseved by me :-)");
        root.setBottom(label1);
        
//        start.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                
//                System.out.println("Hello World!");
//                
//            }
//        });
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Proud of McLaren F1 Team");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
