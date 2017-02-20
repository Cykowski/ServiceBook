package service_book.app;

import java.net.URL;
import java.util.Enumeration;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import service_book.files.LoadConfig;

public class SampleController implements Initializable{

	@FXML
	private Label propertiesLabel;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void readConfig(ActionEvent event){

		LoadConfig.readConf();
	}
	
	public void nextProperty(ActionEvent event){
//		Enumeration enuKeys = LoadConfig.properties.keys();

		if (LoadConfig.enuKeys.hasMoreElements()) {
			String key = (String) LoadConfig.enuKeys.nextElement();
			String value = LoadConfig.properties.getProperty(key);
			propertiesLabel.setText(key + ": " + value);
		}
	}
}
