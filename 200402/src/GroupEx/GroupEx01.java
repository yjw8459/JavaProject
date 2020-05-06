package GroupEx;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GroupEx01 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group g = new Group();//Group은 객체를 묶을  때 사용
		
		Scene scene;
		Shape shape = new Shape();
		for(int i = 0; i<5; i++) {
			Rectangle R = shape.getRectangle(i*20, i*20, 100, 10, Color.RED);
			g.getChildren().add(R);
		}
		
		
		scene=new Scene(g,300,200);
		
		primaryStage.setTitle("GroupEx");
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}
public static void main(String[] args) {
	launch(args);
}
}
