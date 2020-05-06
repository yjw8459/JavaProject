package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ImageViewEx01 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane ap = new AnchorPane();
		
		//ImageView ta = new ImageView("/img/smilerere.png");
		ImageView ta = new ImageView();
		ta.setImage(new Image("/img/smilerere.png"));
		
		//이미지 크기 지정
		ta.setFitHeight(50);
		ta.setFitWidth(1000);
		
		//동일한 비율로 크기 조정
		ta.setPreserveRatio(true);
		
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











