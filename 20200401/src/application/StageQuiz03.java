package application;

//Quiz03

import javafx.application.Application;
import javafx.scene.Group;

import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/*
 * 좌표 120, 140 글자크기 35의 "Infiscap World!"문구를 만들고
 * 창 크기는 400,350으로 제목은 Quiz03으로 만드시오
 */
public class StageQuiz03 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Text txt = new Text(120,140,"Infiscap World!");//좌표 및 문구 지정
		txt.setFont(new Font(35));//폰트 크기 지정
		Scene scene = new Scene(new Group(txt),400,350);//윈도우 크기 지정
		
		primaryStage.setTitle("Quiz03");//윈도우 창 제목
		primaryStage.setScene(scene);//출력 크기
		
		primaryStage.show();
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}


}
