package PaneEx;



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class PaneQuiz01F extends Application{
	private int SCENEWIDTH=500;
	private int SCENEHEIGHT=400;
	private int PANEWIDTH=250;
	private int	PANEHEIGHT=250;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Scene scene;
		Group g = new Group();
		Pane canvas = new Pane();
		
		int x = (SCENEWIDTH - PANEWIDTH)/2;
		int y = (SCENEHEIGHT - PANEHEIGHT)/2;
		Shape shape = new Shape();
		
		canvas.setStyle("-fx-background-color : yellow;");
		canvas.setPrefSize(PANEWIDTH, PANEHEIGHT);
		canvas.setLayoutX(x);
		canvas.setLayoutX(y);
		
		Ellipse e = shape.getEllipse(Color.RED, 125.0, 125.0, 50.0, 25.0);
		
		canvas.getChildren().add(e);
		g.getChildren().add(canvas);
		
		scene=  new Scene(g, SCENEWIDTH, SCENEHEIGHT,Color.BLUE);
		
		primaryStage.setTitle("PaneQuiz");
		primaryStage.setScene(scene);
		
		primaryStage.show();

		
	}
	public static void main(String[] args) {
		launch(args);
	}
	

}
