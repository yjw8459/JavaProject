package CheckBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex01 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
	VBox vbox = new VBox(10);
	CheckBox chk1 = new CheckBox("차빈");//여러 개를 중복 선택할 경우 사용
	CheckBox chk2 = new CheckBox("완우");
	chk2.setSelected(true);//초기 값이 선택돼있음
	
	vbox.getChildren().addAll(chk1,chk2);
	vbox.setPrefSize(300, 200);
	vbox.setPadding(new Insets(10));
	
	chk1.setText("게임");//선언 시 괄호 안에 넣어도 됌
	chk2.setText("오락");
	
	primaryStage.setTitle("Button Test");
	primaryStage.setScene(new Scene(vbox));
	primaryStage.show();
	}
public static void main(String[] args) {
	launch(args);
}
}
