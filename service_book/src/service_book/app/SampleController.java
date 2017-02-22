package service_book.app;

import java.net.URL;
import java.util.Enumeration;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import service_book.files.LoadConfig;
import service_book.vehicle.Vehicle;

public class SampleController implements Initializable{

	public Vehicle veh;
	
	@FXML
	private Label propertiesLabel;
	@FXML
	private TextField descInput;
	@FXML
	private TextField nameInput;
	@FXML
	private TextField radInput;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		initializeVehicle();
	}
	
	public void readConfig(ActionEvent event){

		LoadConfig.readConf();
	}
	
	public void nextProperty(ActionEvent event){

		if (LoadConfig.enuKeys.hasMoreElements()) {
			String key = (String) LoadConfig.enuKeys.nextElement();
			String value = LoadConfig.properties.getProperty(key);
			propertiesLabel.setText(key + ": " + value);
		}
	}
	
	
	public void initializeVehicle(){
		veh = new Vehicle();
		veh.addPartGroup();
	}
	
	public void addPart(ActionEvent event){
		if (veh.group.isEmpty()) 
			return;
		else
			veh.group.get(0).addPart(	descInput.getText(), 
										nameInput.getText());
	}	
	
	
	public void addWheel(ActionEvent event){
		if (veh.group.isEmpty()) 
			return;
		else
			veh.group.get(0).addWheel(	descInput.getText(), 
										nameInput.getText(),
										radInput.getText());
	}
	
	public void showVehicleParts(ActionEvent event){
		veh.showAllPartGroups();
	}
}
