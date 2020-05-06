package selfLogin;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	DB db = new DB();
	@FXML TextField idTxt;
	@FXML TextField pwTxt;
	@FXML Button okBtn;
	boolean check;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if(check) 
			massage("성공");
		else massage("실패");
		
	}
	public boolean loginProc() {
		
		if(pwTxt.equals(db.getMap(idTxt.getText()))) {
			check = true;
		}else check = false;
		return check;
	}
	public void massage(String mas) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(mas);
		alert.show();
	}

}
