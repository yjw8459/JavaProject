package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StageQuiz01 extends Application{
@Override
public void start(Stage primaryStage) throws Exception {
	// TODO Auto-generated method stub
	BorderPane root = new BorderPane();
	Scene scene = new Scene(root,300,200);
	
	primaryStage.setTitle("Quiz01");
	primaryStage.setScene(scene);
	
	primaryStage.show();
	
	
	
}
public static void main(String[] args) {
	launch(args);
}
}
