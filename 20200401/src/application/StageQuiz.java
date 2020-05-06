package application;

//Quiz 02 


import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.*;

public class StageQuiz extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Text txt = new Text(100, 100, "Infiscap World!");//텍스트의 좌표
		txt.setFont(new Font(20));
		Scene scene = new Scene(new Group(txt));//크기 값 생략
		
		primaryStage.setTitle("Quiz02");
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();//글자 위치에 맞게 화면 지정
		primaryStage.show();
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}


}
