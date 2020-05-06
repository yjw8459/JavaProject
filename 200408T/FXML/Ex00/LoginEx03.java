package FXML.Ex00;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginEx03 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();
		TextField tf = new TextField();
		Button btn = new Button("OK");
		
		btn.setPrefSize(100, 30);
		btn.setOnAction(e->System.out.println(tf.getText()));
		
		hbox.getChildren().addAll(tf, btn);
		
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}








