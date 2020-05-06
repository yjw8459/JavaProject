

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		
		Label lbl = new Label("setText test");//라벨 문구 메소드를 통해 전달
		lbl.setPrefSize(200, 100);//라벨 크기 지정
		lbl.setStyle("-fx-background-color:yellow;");//라벨 색 지정
		lbl.setAlignment(Pos.CENTER_RIGHT);//셋 얼라이먼트 메소드로 정렬
		
		hbox.getChildren().addAll(lbl);
		hbox.setPrefSize(300, 200);
		
		primaryStage.setTitle("Input Test");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
		
		
	}
public static void main(String[] args) {
	launch(args);
}
}
