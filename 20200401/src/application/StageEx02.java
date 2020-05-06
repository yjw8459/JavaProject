package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StageEx02 extends Application{
@Override
public void start(Stage primaryStage) throws Exception {
	
	BorderPane root = new BorderPane();
	Scene scene = new Scene(root,300,200);

	primaryStage.setTitle("First Window");
	primaryStage.setScene(scene);

	primaryStage.show();
	
	Thread.sleep(2000);
	primaryStage.hide();
	
	Thread.sleep(2000);
	primaryStage.setX(10);
	primaryStage.setY(10);
	primaryStage.show();
	

}
public static void main(String[] args) {
	launch(args);
}
}
