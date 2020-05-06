package ButtonQuiz;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class Btn {
	public Button size(String str,int width, int height) {
		Button btn = new Button(str);
		btn.setPrefWidth(width);
		btn.setPrefHeight(height);
		
		return btn;
		
		
	}
	public Button effectSize(String str, int width, int height) {
		
		Button btn = new Button(str);
		btn.setPrefWidth(width);
		btn.setPrefHeight(height);
		
		   btn.setOnAction(e->{
		         Alert alert = new Alert(AlertType.INFORMATION);
		          alert.setTitle("경고");
		          alert.setHeaderText("로그인 시도");
		          alert.setContentText("아직은 로그인 할 수 없습니다.");
		          alert.show();
		      });

		
		return btn;
		
	}
	

}
