package ComboBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ComboBoxEx01 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
	HBox hBox = new HBox();
	hBox.setPadding(new Insets(10));
	
	ComboBox<String> cb = new ComboBox<String>();
	cb.getItems().addAll("크라이밍","서핑","산악자전거");//목록 생성
	
	cb.setValue("서핑");//초기값 지정
	
	
	hBox.getChildren().addAll(cb);
	hBox.setPrefSize(300, 200);
	
	primaryStage.setScene(new Scene(hBox));
	primaryStage.show();
	
	}
public static void main(String[] args) {
	launch(args);
}
}
