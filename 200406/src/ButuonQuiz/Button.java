package ButuonQuiz;

import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;

class Btn{

	public Button getBtn(String str,ImageView Image, int width, int height) 
	{
		// TODO Auto-generated method stub
		//Button btn = new Button(str,Image);
		Button btn = new Button(str,Image);
		
		btn.setOnAction(e->{
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("미구현");
			alert.setHeaderText("아직 구현중입니다");
			alert.setContentText("운영진 올림");
			alert.show();
		});
		btn.setPrefSize(width, height);
		btn.setPadding(new Insets(0,0,0,0));//사이 공간 없이
		return btn;

	}
	

}
