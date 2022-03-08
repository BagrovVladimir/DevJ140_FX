/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.*;

/**
 *
 * @author Владимир
 */
public class AddRecordStage extends Stage{
    
    Scene scene;
    
    public void init(){
        
        VBox root = new VBox();
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        
        FlowPane rowSeason = new FlowPane();
        rowSeason.setHgap(10);
        rowSeason.setVgap(10);
        rowSeason.setAlignment(Pos.CENTER);
        Label seasonLabel = new Label("Season: ");
        TextField seasonField = new TextField();
        rowSeason.getChildren().addAll(seasonLabel, seasonField);
        root.getChildren().add(rowSeason);
        
        FlowPane rowRacer = new FlowPane();
        rowRacer.setHgap(10);
        rowRacer.setVgap(10);
        rowRacer.setAlignment(Pos.CENTER);
        Label racerLabel = new Label("Racer: ");
        TextField racerField = new TextField();
        rowRacer.getChildren().addAll(racerLabel, racerField);
        root.getChildren().add(rowRacer);
        
        FlowPane rowPoints = new FlowPane();
        rowPoints.setHgap(10);
        rowPoints.setVgap(10);
        rowPoints.setAlignment(Pos.CENTER);
        Label pointsLabel = new Label("Points: ");
        TextField pointsField = new TextField();
        rowPoints.getChildren().addAll(pointsLabel, pointsField);
        root.getChildren().add(rowPoints);
        
        FlowPane rowShassis = new FlowPane();
        rowShassis.setHgap(10);
        rowShassis.setVgap(10);
        rowShassis.setAlignment(Pos.CENTER);
        Label shassisLabel = new Label("Shassis: ");
        TextField shassysField = new TextField();
        rowShassis.getChildren().addAll(shassisLabel, shassysField);
        root.getChildren().add(rowShassis);
        
        FlowPane rowEngine = new FlowPane();
        rowEngine.setHgap(10);
        rowEngine.setVgap(10);
        rowEngine.setAlignment(Pos.CENTER);
        Label engineLabel = new Label("Engine: ");
        TextField engineField = new TextField();
        rowEngine.getChildren().addAll(engineLabel,  engineField);
        root.getChildren().add(rowEngine);
        
        //вставить кнопки ok и cancel
        
        scene = new Scene(root, 250, 300);
        
        this.setTitle("Add Record");
        this.setScene(scene);
        this.show(); 
    }
    
}
