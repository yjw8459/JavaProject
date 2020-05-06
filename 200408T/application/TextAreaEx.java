package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TextAreaEx extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane ap = new AnchorPane();
		
		DatePicker ta = new DatePicker();
		ta.setPrefSize(200, 150);
		ta.setLayoutX(20);
		ta.setLayoutY(20);
		
		ap.getChildren().add(ta);
		ap.setPrefSize(300, 200);
		
		primaryStage.setScene(new Scene(ap));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}











