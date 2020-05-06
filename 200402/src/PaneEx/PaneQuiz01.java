package PaneEx;

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/*
 * Ellipse ellipse = new Ellipse();
 */

public class PaneQuiz01 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene;
		Group g = new Group();
		Pane canvas = new Pane();
		Shape shape = new Shape();
		//Ellipse e = new Ellipse(40, 40);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screensize =tk.getScreenSize();
		
		Circle c = shape.getCircle(Color.BLACK, scene.getWidth(), scene.getWidth(), 20);
		Rectangle r = shape.getRectangle(Color.BLACK, screensize.width/2, screensize.height/2, 100, 100);
		
		
		
		
		canvas.setStyle("-fx-background-color : yellow;");
		canvas.setPrefSize(200, 200);
		canvas.getChildren().add(c);
		canvas.setLayoutX(screensize.width/2);
		canvas.setLayoutY(screensize.height/2);
		g.getChildren().add(canvas);
		scene = new Scene(g, 500, 500,Color.BLUE);
		primaryStage.setTitle("김차빈 병신");
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
public static void main(String[] args) {
	launch(args);
}
}
