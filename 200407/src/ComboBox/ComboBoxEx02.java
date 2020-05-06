package TextField;

import javafx.application.Application;
import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.ComboBox;


import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ComboBoxEx02 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
	HBox hBox = new HBox();
	hBox.setPadding(new Insets(10));
	
	ComboBox<Rectangle> cb = new ComboBox<Rectangle>();
	cb.getItems().addAll(
			new Rectangle(10,10,Color.RED),
	new Rectangle(10,10,Color.SKYBLUE),
	new Rectangle(10,10,Color.PURPLE));
	
	
	hBox.getChildren().addAll(cb);
	hBox.setPrefSize(300, 200);
	
	primaryStage.setScene(new Scene(hBox));
	primaryStage.show();
	
	}
public static void main(String[] args) {
	launch(args);
}
}
