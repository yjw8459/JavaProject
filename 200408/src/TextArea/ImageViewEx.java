package TextArea;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ImageViewEx extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		AnchorPane ap = new AnchorPane();		
		ImageView ta = new ImageView("/img/smilerere.png");
		
		ta.setFitHeight(100);
		ta.setFitWidth(50);
		
		ta.setPreserveRatio(true);//동일한 비율로 크기 조정
		
		ta.setLayoutX(20);
		ta.setLayoutY(20);
		
		ap.getChildren().add(ta);
		ap.setPrefSize(300, 200);
	
	primaryStage.setScene(new Scene(ap));
	primaryStage.show();
	}
public static void main(String[] args) {
	launch(args);
}
}
