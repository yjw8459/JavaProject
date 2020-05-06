package FXML.Ex00;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginEx02 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane canvas = new Pane();
		Button btn = new Button("OK");
		
		btn.setPrefSize(100, 30);
		btn.setOnAction(e->System.out.println("Ok 버튼 클릭"));
		
		canvas.getChildren().add(btn);
		
		primaryStage.setScene(new Scene(canvas));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}








