package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StageQuiz05Main extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 300, 200);
		
		primaryStage.setTitle("Quiz05");
		primaryStage.setScene(scene);
		
		StageQuiz05 quiz = new StageQuiz05(primaryStage, 300, 200);
		//인스턴스 생성과 동시에 StageQuiz05 생성자에 인자전달을 함 
		quiz.showWindow();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
