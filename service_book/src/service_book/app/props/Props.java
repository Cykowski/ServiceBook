package service_book.app.props;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Props extends AnchorPane {
	
	private static Stage propsStage;
	
	public Props(Stage primaryStage) {

		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Props.fxml"));
			Scene scene = new Scene(root);
			Props.propsStage = new Stage();
			Props.propsStage.setTitle("Properties");
			Props.propsStage.setScene(scene);
			Props.propsStage.initStyle(StageStyle.UNDECORATED);
			Props.propsStage.initModality(Modality.WINDOW_MODAL);
			Props.propsStage.initOwner(primaryStage);
			Props.propsStage.setResizable(false);
			Props.propsStage.show();
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
//		Stage propsStage = new Stage();
//		try {
//			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Props.fxml"));
//			Scene scene = new Scene(root);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			propsStage.setScene(scene);
//			propsStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
		
//	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Main.fxml"));
}
