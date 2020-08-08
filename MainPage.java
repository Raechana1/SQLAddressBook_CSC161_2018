/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc5;


import java.sql.Connection;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author rahon
 */
public class MainPage extends Application{
    UIController controller;
    
    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("UI.fxml"));
        
        BorderPane bpane = loader.load();
        controller = loader.getController();
        
        Scene scene = new Scene(bpane, 700, 350);
        
        stage.setScene(scene);
        stage.setTitle("Staff Information");
        stage.setAlwaysOnTop(true);
        stage.setResizable(false);
        stage.show();
        
        
        
    }
    public static void main(String[] args){
        Application.launch(args);
    }
    
}
