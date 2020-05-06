package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

public class HTMLEditorEx extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane ap = new AnchorPane();
		
		HTMLEditor ta = new HTMLEditor();
		//ta.setPrefSize(200, 150);
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











