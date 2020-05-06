package PaneEx;
import GroupEx.Shape;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PaneEx02 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Scene scene;
		Pane canvas = new Pane();
		Shape shape = new Shape();
		Circle c = shape.getCircle(Color.BLUE, 40, 40,30);//Circle 클래스에 shape 인스턴스 생성 
		Rectangle R = shape.getRectangle(Color.RED, 70, 70, 100, 100);
		
		
		
		canvas.setStyle("-fxbackgrond-color : black;");
		canvas.setPrefSize(200, 200);
		canvas.getChildren().addAll(c,R);
		
		scene = new Scene(canvas,500,500,Color.BLUE);
		
			
			
		
		
		
		
		
		primaryStage.setTitle("GroupEx");
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}
public static void main(String[] args) {
	launch(args);
}
}
