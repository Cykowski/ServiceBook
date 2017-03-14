package service_book.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javafx.scene.control.Alert;

public class DbConn {

	private	static	String	JDBC_Driver;
	private	static	String	DB_URL;
	private	static	String	USER;
	private	static	String	PASS;

	private static	Connection connId;
	   
	private static int updateConfiguration()
	{
		if (AppConfig.readConf() != 0){
			Mess.setErrorMessage("Unable to read config.properties");
			return(service_book.Book.CONFIGERROR);
		}

		USER = AppConfig.properties.getProperty("DBUSER");
		PASS = AppConfig.properties.getProperty("DBPASS");
		JDBC_Driver = AppConfig.properties.getProperty("JDBCDRIVER");

		if ( AppConfig.properties.getProperty("DBTYPE").equals("sqlserver")){
			DB_URL = "jdbc:" +
					 AppConfig.properties.getProperty("DBTYPE") +
					 "://" +
					 AppConfig.properties.getProperty("DBHOST") +
					 ";databaseName="+
					 AppConfig.properties.getProperty("DBNAME");
		}		
		return(0);
	}
	
	public static void testConnection(){
		
		if (testingDB() == 0){
			Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
			alert.setTitle("DB Test");
			alert.setHeaderText("OK");
			alert.setContentText("Successful connection test");
			alert.showAndWait();
		}
		else{
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("DB Test");
			alert.setHeaderText("Connection error :(");
//			alert.setContentText("");
			alert.showAndWait();
		}
			

		
	}
	
	
	private static int testingDB(){

		if (updateConfiguration() != 0){
			Mess.setInfoMessage("Check DB Connection properties");
			return(service_book.Book.CONFIGERROR);
		}
		try{
			Class.forName(JDBC_Driver);
			connId = DriverManager.getConnection(DB_URL, USER, PASS);
		}
		catch (ClassNotFoundException e) {
			Mess.setErrorMessage("JDBC Driver error (wrong driver)");
			return(service_book.Book.CONFIGERROR);
		} 
		catch (SQLException e) {
			Mess.setErrorMessage("Database connection error");
			return(service_book.Book.CONFIGERROR);
		}
		
		try {
			connId.close();
		} catch (SQLException e) {
			Mess.setErrorMessage("Closing DB connection error");
			return(service_book.Book.CONFIGERROR);
		}
		return(0);
	}
	
	
}
