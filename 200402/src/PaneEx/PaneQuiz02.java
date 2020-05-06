package PaneEx;



import java.util.*;

import ContainerEx.Container;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PaneQuiz02 extends Application{
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Scene scene;
		Group g = new Group();
		
		Shape shape = new Shape();
		Container container = new Container();
		
		List<Pane> lstPane = new ArrayList<Pane>();// 이 리스트에는 패인만 들어갈 수 있음
		
		lstPane.add(container.getPane("black", 220, 220, 20, 20));//리스트 패인에 컨테이너클래스 겟패인 메소드에 인자 전달 후 더함
		lstPane.add(container.getPane("yellow", 220, 220, 260, 20));
		lstPane.add(container.getPane("red", 440, 220, 20, 260));
		
		
		
		Circle c = shape.getCircle(Color.PURPLE, 20, 20, 50);//Circle클래스를 shape.getCircle인스턴스에 인자전달
		Rectangle r = shape.getRectangle(Color.RED, 70, 70, 100, 100);
		lstPane.get(0).getChildren().addAll(r,c);//리스트 0에 사각형, 원 더함
		
		Ellipse e = shape.getEllipse(Color.GREEN, 110.0, 110.0, 80.0, 25.0);
		lstPane.get(1).getChildren().add(e);//리스트 1에 일립스 더함
		
		for(Pane p :lstPane)
			g.getChildren().add(p);//패널 세개 추가
		
		
		scene=  new Scene(g, 500, 500,Color.BLUE);
		
		primaryStage.setTitle("PaneQuiz");
		primaryStage.setScene(scene);
		
		primaryStage.show();

		
	}
	public static void main(String[] args) {
		launch(args);
	}
	

}
