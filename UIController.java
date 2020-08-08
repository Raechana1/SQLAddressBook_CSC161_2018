/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc5;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author rahon
 */
public class UIController implements Initializable {

    private Task currentTask = new Task();
    
    private final ObservableList<Task> task = FXCollections.observableArrayList();
    private final HashMap<Integer, Task> taskMap = new HashMap();

    public HashMap<Integer, Task> getTaskMap() {
        return taskMap;
    }
    
    @FXML
    private Button View;
    
    @FXML
    private Button Insert;
    
    @FXML
    private Button Delete;
    
    @FXML
    private Button Clear;
    
   @FXML
   private TextField idtext;
   
   @FXML
   private TextField lastNameText;
   
   @FXML
   private TextField firstNameText;
   
   @FXML
   private TextField miText;
   
   @FXML
   private TextField addressText;
   
   @FXML
   private TextField cityText;
   
   @FXML
   private TextField stateText;
   
   @FXML
   private TextField telephoneText;
   
   @FXML
   private Label databaseConnected;
        
    
   
   
    /*@FXML
    void addButtonClicked(ActionEvent event) {
        if(currentTask.getID() != null){
            Task t = new Task();
            task.add(t);
            taskMap.put(ID, t);
        }
        else(Exception e) {
            
        }
        setCurrentTask(null);
    }*/
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try(Connection conn = DBUtil.getConnection(DBType.MYSQLDB)){
            databaseConnected.setVisible(true);
        }
	catch(SQLException e) {
		DBUtil.showErrorMessage(e);
        }
        
        
        
    }   
    @FXML
    void ViewButtonClicked(ActionEvent event){
        String sql = "select * from staff_information where id = ?";
        String sqlID = idtext.getText();
        
    }
    
    
    
}
