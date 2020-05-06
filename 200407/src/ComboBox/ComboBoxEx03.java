package ComboBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ComboBoxEx03 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
	HBox hBox = new HBox();
	hBox.setPadding(new Insets(10));
	
	ComboBox<Color> cb = new ComboBox<Color>();
	cb.getItems().addAll(
			Color.RED,
	Color.SKYBLUE,
	Color.PURPLE);
	
	cb.setPromptText("색상을 고르세요");
	
	
	hBox.getChildren().add(cb);
	hBox.setPrefSize(300, 200);
	
	primaryStage.setScene(new Scene(hBox));
	primaryStage.show();
	
	}
public static void main(String[] args) {
	launch(args);
}
}
