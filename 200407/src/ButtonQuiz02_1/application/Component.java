package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class Component {
	public Button getButton(String btnName, int width, int height) {
		Button btn;
		btn = new Button(btnName);
		btn.setPrefWidth(width);
		btn.setPrefHeight(height);
		
		return btn;
	}
	
	public Alert getAlert(Alert.AlertType alertType, String title, String header, String content) {
		 Alert alert = new Alert(alertType);
         alert.setTitle(title);
         alert.setHeaderText(header);
         alert.setContentText(content);
         
         return alert;
	}
}
