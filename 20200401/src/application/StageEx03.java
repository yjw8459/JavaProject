package application;



import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StageEx03 extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root = new BorderPane(); //씬 설정을 위하여
		Scene scene = new Scene(root,300,200); //크기 300, 200
		
		
		primaryStage.setTitle("First Window"); //윈도우의 제목
		primaryStage.setScene(scene); //윈도우의 크기 scene만큼
		
		primaryStage.show();
		
		Thread.sleep(2000);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		Dimension screenSize = tk.getScreenSize();
		System.out.println("width : "+ screenSize.width);//해상도 출력
		System.out.println("height : "+ screenSize.height);
		primaryStage.setX(screenSize.width/2-150); //윈도우의 X축좌표
		primaryStage.setY(screenSize.height/2-100);//윈도우의 Y축 좌표
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
