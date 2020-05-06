package application;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ImageViewEx02 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();
		AnchorPane ap = new AnchorPane();
		
		ImageView iv1 = new ImageView("/img/smilerere.png");
		ImageView iv2 = new ImageView("/img/smilerere.png");
		
		//회전
		iv2.setRotate(45);
		
		//일부분만 화면 출력
		Rectangle2D viewportRect = new Rectangle2D(40, 35, 110, 110);
		iv2.setViewport(viewportRect);
		iv2.setLayoutX(40);
		iv2.setLayoutY(35);
		ap.getChildren().add(iv2);
		
		hbox.getChildren().addAll(iv1, ap);
		hbox.setPrefSize(1024, 768);
		
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}











