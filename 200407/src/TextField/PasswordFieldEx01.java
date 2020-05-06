package TextField;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PasswordFieldEx01 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
	HBox hBox = new HBox();
	hBox.setPadding(new Insets(10));
	
	TextField tf = new TextField("입력 받는 부분");
	PasswordField tf2 = new PasswordField();//입력 시 바둑판 표시
	//tf.setText("입력");
	//비활성화시 출력
	tf2.setPromptText("패스워드를 입력하세요");
	tf2.setPrefSize(150, 40);
	tf2.setAlignment(Pos.CENTER_LEFT);
	System.out.println(tf.getText());
	System.out.println(tf2.getText());
	hBox.getChildren().addAll(tf,tf2);
	hBox.setPrefSize(300, 200);
	
	primaryStage.setScene(new Scene(hBox));
	primaryStage.show();
	
	}
public static void main(String[] args) {
	launch(args);
}
}
