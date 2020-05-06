package GroupEx;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GroupEx03 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group g = new Group();//Group은 객체를 묶을  때 사용
		
		int posX=20;
		int posY=20;
		int width=100;
		int height = 100;
		Scene scene;
		Shape shape = new Shape();
		Rectangle R = shape.getRectangle(Color.RED, posX, posY, width, height);
		Circle c = shape.getCircle(Color.BLUE, 40, 40,30);//Circle 클래스에 shape 인스턴스 생성 
		
			
		g.getChildren().addAll(R,c);//순서 바꿈으로 곂칠 때 올라오는 도형 변경 가능
		
		
		
		scene=new Scene(g,300,200);
		
		primaryStage.setTitle("GroupEx");
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}
public static void main(String[] args) {
	launch(args);
}
}
