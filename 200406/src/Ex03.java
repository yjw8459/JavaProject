

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Ex03 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
			Label lbl = new Label("A label that needs to be "
					+ "Wrapped");
			lbl.setWrapText(true);//창 최소화했을경우 들여쓰기
			//lbl.setWrapText(false);//false는 들여쓰기되지않음
			lbl.setRotate(48);//텍스트 기울이기
			lbl.setTranslateY(50);
			primaryStage.setScene(new Scene(lbl,100,100));
			primaryStage.setTitle("VVV");
			primaryStage.show();
			
		
	}
public static void main(String[] args) {
	launch(args);
}
}
