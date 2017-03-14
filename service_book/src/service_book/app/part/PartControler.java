package service_book.app.part;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import service_book.control.AppConfig;

public class PartControler implements Initializable {

	@FXML
	private AnchorPane backgroundPanel;
	@FXML
	private TextField prop1;
	@FXML
	private TextField prop2;
	@FXML
	private TextField prop3;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}
	
	@FXML 
	private Button cancelButton;
	@FXML
	private void dropProperties(){
	    Stage stage = (Stage) cancelButton.getScene().getWindow();
	    stage.close();
	}

	@FXML 
	private Button okButton;
	
	public void saveProperties(ActionEvent event){
		Stage stage = (Stage) okButton.getScene().getWindow();
	    stage.close();
	}
	
}
