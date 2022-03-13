
package views;

import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.*;
import models.Champions;


public class AddRecordStage extends Stage{
    
    Scene scene;
    Label infoLabel;
    public static TextField seasonField;
    public static TextField racerField;
    public static TextField pointsField;
    public static TextField shassisField;
    public static TextField engineField;
    
    public void init(){
        
        VBox root = new VBox();
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        
        FlowPane rowSeason = new FlowPane();
        rowSeason.setHgap(10);
        rowSeason.setVgap(10);
        rowSeason.setAlignment(Pos.CENTER);
        Label seasonLabel = new Label("Season: ");
        seasonField = new TextField();
        rowSeason.getChildren().addAll(seasonLabel, seasonField);
        root.getChildren().add(rowSeason);
        
        FlowPane rowRacer = new FlowPane();
        rowRacer.setHgap(10);
        rowRacer.setVgap(10);
        rowRacer.setAlignment(Pos.CENTER);
        Label racerLabel = new Label("Racer: ");
        racerField = new TextField();
        rowRacer.getChildren().addAll(racerLabel, racerField);
        root.getChildren().add(rowRacer);
        
        FlowPane rowPoints = new FlowPane();
        rowPoints.setHgap(10);
        rowPoints.setVgap(10);
        rowPoints.setAlignment(Pos.CENTER);
        Label pointsLabel = new Label("Points: ");
        pointsField = new TextField();
        rowPoints.getChildren().addAll(pointsLabel, pointsField);
        root.getChildren().add(rowPoints);
        
        FlowPane rowShassis = new FlowPane();
        rowShassis.setHgap(10);
        rowShassis.setVgap(10);
        rowShassis.setAlignment(Pos.CENTER);
        Label shassisLabel = new Label("Shassis: ");
        shassisField = new TextField();
        rowShassis.getChildren().addAll(shassisLabel, shassisField);
        root.getChildren().add(rowShassis);
        
        FlowPane rowEngine = new FlowPane();
        rowEngine.setHgap(10);
        rowEngine.setVgap(10);
        rowEngine.setAlignment(Pos.CENTER);
        Label engineLabel = new Label("Engine: ");
        engineField = new TextField();
        rowEngine.getChildren().addAll(engineLabel,  engineField);
        root.getChildren().add(rowEngine);
        
        Button add = new Button("Add");
        add.setOnAction(e ->{
            if(getTextSeasonField().trim().isEmpty()
                    || getTextRacerField().trim().isEmpty()
                    || getTextPointsField().trim().isEmpty()
                    || getTextShassisField().trim().isEmpty()
                    || getTextEngineField().trim().isEmpty() )
                {infoLabel.setText("All fields must be filled");}
            else{
                Champions.addChampions();
                infoLabel.setText("Everything ok");
                }
        });
        root.getChildren().add(add);
        
        infoLabel = new Label();
        root.getChildren().add(infoLabel);
                
        scene = new Scene(root, 250, 300);
        
        this.setTitle("Add Record");
        this.setScene(scene);
        this.show(); 
    }
    
    public static String getTextSeasonField(){
        return seasonField.getText();
    }
    
    public static String getTextRacerField(){
        return racerField.getText();
    }
    
    public static String getTextPointsField(){
        return pointsField.getText();
    }
    
    public static String getTextShassisField(){
        return shassisField.getText();
    }
    
    public static String getTextEngineField(){
        return engineField.getText();
    }  
}
