/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.*;
import models.Champions;

/**
 *
 * @author Владимир
 */
public class TableStage extends Stage{
    
    Scene scene;
    
    public void init(){
        
        TableView <Champions> tableView = new TableView<>();
        
        TableColumn<Champions, Integer> seasonColumn = new TableColumn<>("Season");
        seasonColumn.setCellValueFactory(new PropertyValueFactory<>("season"));
        tableView.getColumns().add(seasonColumn);
        
        TableColumn<Champions, String> racerColumn = new TableColumn<>("Racer");
        racerColumn.setCellValueFactory(new PropertyValueFactory<>("racer"));
        tableView.getColumns().add(racerColumn);
        
        TableColumn<Champions, Integer> pointsColumn = new TableColumn<>("Points");
        pointsColumn.setCellValueFactory(new PropertyValueFactory<>("ponts"));
        tableView.getColumns().add(pointsColumn);
        
        TableColumn<Champions, String> shassisColumn = new TableColumn<>("Shassis");
        shassisColumn.setCellValueFactory(new PropertyValueFactory<>("shassis"));
        tableView.getColumns().add(shassisColumn);
        
        TableColumn<Champions, String> engineColumn = new TableColumn<>("Engine");
        engineColumn.setCellValueFactory(new PropertyValueFactory<>("engine"));
        tableView.getColumns().add(engineColumn);
        
        GridPane root =  new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setAlignment(Pos.CENTER);
        root.add(tableView, 0, 0);
        
        FlowPane rowButton = new FlowPane();
        rowButton.setVgap(10);
        rowButton.setHgap(10);
        Button addRecord = new Button("Add record");
        addRecord.setOnAction(e ->{
            AddRecordStage addRecordStage = new AddRecordStage();
            addRecordStage.init();
        });
        Button updateTable = new Button("Udate table");
        rowButton.getChildren().addAll(addRecord, updateTable);
        
        root.add(rowButton, 0, 2);
        
        scene = new Scene(root, 500, 500);
        
        this.setTitle("Personal championships");
        this.setScene(scene);
        this.show();
    }
    
}
