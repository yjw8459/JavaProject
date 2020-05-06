package TextArea;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ListViewEx extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		AnchorPane ap = new AnchorPane();		
		ListView<String> lstView = new ListView<String>();
		
		lstView.getItems().addAll("items1","items3","items3");
		lstView.setPrefSize(100, 70);//사이즈
		lstView.setLayoutX(20);
		lstView.setLayoutX(20);
		ap.getChildren().add(lstView);		
		ap.setPrefSize(300, 200);
	
	primaryStage.setScene(new Scene(ap));
	primaryStage.show();
	}
public static void main(String[] args) {
	launch(args);
}
}
