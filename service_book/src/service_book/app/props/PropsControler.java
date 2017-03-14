package service_book.app.props;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import service_book.control.AppConfig;

public class PropsControler implements Initializable {

	@FXML
	private AnchorPane backgroundPanel;
	@FXML
	private TextField prop1t1;
	@FXML
	private TextField prop2t1;
	@FXML
	private TextField prop3t1;
	@FXML
	private TextField prop4t1;
	@FXML
	private TextField DBHOST;
	@FXML
	private TextField DBNAME;
	@FXML
	private TextField DBUSER;
	@FXML
	private PasswordField DBPASS;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		loadProperties();
	}
	
	@FXML 
	private Button cancelButton;
	@FXML
	private void dropProperties(){
	    Stage stage = (Stage) cancelButton.getScene().getWindow();
		System.out.println("Properties closed by clicking Cancel");
	    stage.close();
	}

	@FXML 
	private Button okButton;
	@FXML
	private void saveProperties(ActionEvent event){
		setProperties();
		if (AppConfig.saveConf() == 0){
			Stage stage = (Stage) okButton.getScene().getWindow();
			System.out.println("Properties closed by clicking OK");
		    stage.close();
		}
		else{
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Information Dialog");
			alert.setHeaderText("Unhandled file save error");
			alert.setContentText("Try again or drop by clicking Cancel button");
			alert.showAndWait();
		}
			
	}
	
	
	private void setProperties(){
		if (prop1t1.getText() != null)
			AppConfig.properties.setProperty("prop1", prop1t1.getText());
		if (prop2t1.getText() != null)
			AppConfig.properties.setProperty("prop2", prop2t1.getText());
		if (prop3t1.getText() != null)
			AppConfig.properties.setProperty("prop3", prop3t1.getText());
		if (prop4t1.getText() != null)
			AppConfig.properties.setProperty("prop4", prop4t1.getText());

		if (DBHOST.getText() != null)
			AppConfig.properties.setProperty("DBHOST", DBHOST.getText());
		if (DBNAME.getText() != null)
			AppConfig.properties.setProperty("DBNAME", DBNAME.getText());
		if (DBUSER.getText() != null)
			AppConfig.properties.setProperty("DBUSER", DBUSER.getText());
		if (DBPASS.getText() != null)
			AppConfig.properties.setProperty("DBPASS", DBPASS.getText());
	}
	
	private void loadProperties(){
		prop1t1.setText(AppConfig.properties.getProperty("prop1"));
		prop2t1.setText(AppConfig.properties.getProperty("prop2"));
		prop3t1.setText(AppConfig.properties.getProperty("prop3"));
		prop4t1.setText(AppConfig.properties.getProperty("prop4"));

		DBHOST.setText(AppConfig.properties.getProperty("DBHOST"));
		DBNAME.setText(AppConfig.properties.getProperty("DBNAME"));
		DBUSER.setText(AppConfig.properties.getProperty("DBUSER"));
		DBPASS.setText(AppConfig.properties.getProperty("DBPASS"));
	}
	
	
}
