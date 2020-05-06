package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StageQuizFinalMain extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root,300,200);
		
		primaryStage.setTitle("Quiz04");
		primaryStage.setScene(scene);
		
		StageQuizFinal quiz = new StageQuizFinal(primaryStage,300,200);
		quiz.ShowFrame(40);
		
		
	}

}
