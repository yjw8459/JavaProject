package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ListViewEx extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane ap = new AnchorPane();
		ListView<String> lstView = new ListView<String>();
		
		lstView.getItems().addAll("item1", "item2", "item3");
		lstView.setPrefSize(100, 70);
		lstView.setLayoutX(20);
		lstView.setLayoutY(20);
		
		ap.getChildren().add(lstView);
		ap.setPrefSize(300, 200);
		
		primaryStage.setScene(new Scene(ap));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}











