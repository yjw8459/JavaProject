package PaneEx;
import java.awt.Dimension;
import java.awt.Toolkit;

import GroupEx.Shape;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PaneEx04 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Scene scene;
		Group g = new Group(); //클래스 그룹 참조
		Pane canvas = new Pane();//클래스 패널 참조
		Pane canvas2 = new Pane();
		Shape shape = new Shape();//Shape클래스 만든 것
		Circle c = shape.getCircle(Color.BLUE, 40, 40,30);//Circle 클래스에 shape 인스턴스 생성 
		Rectangle R = shape.getRectangle(Color.RED, 70, 70, 100, 100);
		
		
		
		
		canvas.setStyle("-fx-background-color : black;");//패널의 모양을 바꿔줌 "-fx-background-color : black;" = css코드
		// 패널의 배경색을 검은색으로 바꿔줌
		canvas.setPrefSize(200, 200);//패널의 크기 지정
		
		canvas2.setStyle("-fx-background-color : Yellow;");
		canvas2.setPrefSize(200, 200);
		canvas2.setLayoutX(230);//레이아웃으로 좌표 설정 **
		
		canvas.getChildren().addAll(c,R);//패널에 도형 Circle과 Rectangle 넣어줌
		
		g.getChildren().addAll(canvas,canvas2);//두개는 addAll , 하나는 add
		
		
		scene = new Scene(g,500,500,Color.BLANCHEDALMOND);
		
		
		primaryStage.setTitle("PaneEx");
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}
public static void main(String[] args) {
	launch(args);
}
}
