package service_book.app.part;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Part extends AnchorPane {
	
	private static Stage partStage;
	
	public Part(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Part.fxml"));
			Scene scene = new Scene(root);
			partStage = new Stage();
			partStage.setTitle("Item/Part");
			partStage.setScene(scene);
			partStage.initStyle(StageStyle.UNDECORATED);
			partStage.initModality(Modality.WINDOW_MODAL);
			partStage.initOwner(primaryStage);
			partStage.setResizable(false);
			partStage.show();
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
