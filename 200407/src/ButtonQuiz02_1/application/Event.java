package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class Event {
	Component com;
	public Event(Component com) {
		this.com = com;
	}
	public void setOnAction(Button btn) {
		btn.setOnAction(e->{
	         Alert alert = com.getAlert(
	        		 AlertType.INFORMATION, "���", "�α��� �õ�", "������ �α��� �� �� �����ϴ�.");
	          alert.show();
	      });
	}
}
