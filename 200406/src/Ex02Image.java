
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Ex02Image extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Image image = new Image(
				getClass().getResourceAsStream(
						"/img/search.png"
						)
				);
		Label lbl = new Label("Search", new ImageView(image));
		lbl.setGraphic(new ImageView(image));
		lbl.setTextFill(Color.web("#0076a3"));
		primaryStage.setTitle("image");
		primaryStage.setScene(new Scene(lbl,300,200));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	}


