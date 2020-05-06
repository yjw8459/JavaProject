package ToggleButton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Ex01 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hbox = new HBox();
		ToggleButton toggleBtn = new ToggleButton("Toggle Btn");
		/*
		 * ToggleButton toggleBtn2 = new ToggleButton("", new
		 * ImageView("/img/magi.png")); 이미지 넣기 가능
		 * 
		 * 
		 */
		hbox.getChildren().addAll(toggleBtn);
		hbox.setPrefSize(300, 200);
		toggleBtn.setText("Toogle Button");
		
		primaryStage.setTitle("Button Test");
		primaryStage.setScene(new Scene(hbox));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	

}
