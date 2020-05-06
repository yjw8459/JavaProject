package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StageEx01 extends Application{//상속받을 때 fx붙은걸로

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 300, 200);
		primaryStage.setTitle("Infiscap");//윈도우의 창 이름
		primaryStage.setScene(scene);
		
		
		//System.out.println(primaryStage.getTitle());//콘솔에 출력
		
		primaryStage.show();//화면 출력
		
		Thread.sleep(2000);
		primaryStage.setIconified(true);//2초 뒤에 최소화
		Thread.sleep(2000);
		primaryStage.setIconified(false);//2초 뒤에 최대화
		
		
	}
	public static void main(String[] args) {
		launch(args);//launch = 이 클래스 안에 있는 메소드 호출하면 start가 호출됌 (메인과 스타트 메소드가 동시에 동작함)
	}
	
	

}
