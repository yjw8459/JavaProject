package PaneEx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PaneVSGroup extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene;
		Pane pane = new Pane();
		Group group = new Group();
		Shape shape = new Shape();
		
		VBox.setVgrow(group, Priority.NEVER);
		//(VBox = 세로로 쭉 나열됨) 위는 그룹지정 그룹은 벽을 밀어서 다른 사각형이 움직이는 것처럼 보임
		VBox.setVgrow(pane, Priority.NEVER);// 아래는 패인지정 벽이 없이 뚫고 지나감
		
		VBox vbox = new VBox(group, pane);
		
		Rectangle rect1 = shape.getRectangle(Color.BLUE, 100, 100, 100, 100);
		Rectangle rect2 = shape.getRectangle(Color.BLUE, 100, 100, 100, 100);
		Rectangle rect3 = shape.getRectangle(Color.GREEN, 200, 200, 100, 100);
		Rectangle rect4 = shape.getRectangle(Color.GREEN, 200, 200, 100, 100);
		
		group.getChildren().addAll(rect1, rect3);
		pane.getChildren().addAll(rect2, rect4);
		
		
		scene = new Scene(vbox, 400, 500);
		
		scene.addEventHandler(KeyEvent.KEY_PRESSED, e->{
			double deltax;
			switch(e.getCode()) {
			case LEFT:
				deltax = -20;
				break;
			case RIGHT:
				deltax =20;
			break;
			default:
				deltax=0;
			}
			rect3.setX(rect3.getX() +deltax);
			rect4.setX(rect4.getX() +deltax);
			
		});
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
public static void main(String[] args) {
	launch(args);
}
}
