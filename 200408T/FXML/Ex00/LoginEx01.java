package FXML.Ex00;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginEx01 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane canvas = new Pane();
		Button btn = new Button("OK");
		EventHandler<ActionEvent> eh = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Ok ��ư Ŭ��");
			}
		};
		btn.setPrefSize(100, 30);
		btn.setOnAction(eh);
		
		canvas.getChildren().add(btn);
		
		primaryStage.setScene(new Scene(canvas));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}








