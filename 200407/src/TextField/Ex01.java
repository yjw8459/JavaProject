package TextField;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
	HBox hBox = new HBox();
	hBox.setPadding(new Insets(10));
	
	TextField tf = new TextField("입력 받는 부분");
	TextField tf2 = new TextField();
	//tf.setText("입력");
	//비활성화시 출력
	tf2.setPromptText("패스워드를 입력하세요");
	tf2.setPrefSize(150, 40);//사이즈
	tf2.setAlignment(Pos.CENTER_LEFT);//정렬
	System.out.println(tf.getText());//콘솔 창에서 처리를 보기위해
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
