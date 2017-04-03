package service_book.app.main;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import service_book.Book;
import service_book.control.AppConfig;
import service_book.control.Mess;

public class Main extends Application {
	
	public static Stage primaryStage;

	@Override
	public void start(Stage primaryStage) throws Exception {

		if (AppConfig.readConf() != 0){
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Information Dialog");
			alert.setHeaderText("Initialization error");
			alert.setContentText("Check/update/repair yours 'config.properties' file");

			alert.showAndWait();
			System.exit(0);
		}
		
		Main.primaryStage = primaryStage;

		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("Main.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

		
		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
	          public void handle(WindowEvent we) {
	              System.out.println("Input additional instructions here");
	          }
	      });        
		
	}
		
	
//	@Override
//	public void stop() throws Exception
//	{
//		
//		System.out.println("Overrided stop");
//        System.exit(0);
//	}
	
	public static void main(String[] args) {
		
			launch(args);
			Mess.showMessInConsole(Book.ALL);
	}

}
