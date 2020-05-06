package FXML.Ex03;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Controller implements Initializable{
	@FXML private TextField idTxtField;
	@FXML private PasswordField pwTxtField;
	@FXML private Button loginBtn;
	private MyDB db;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		db = new MyDB();
		loginBtn.setOnAction(e->LoginProc(e));		
	}
	private void MsgBox(String contents) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(contents);
		
		alert.show();
	}
	public void LoginProc(ActionEvent e) {
		String id = idTxtField.getText();
		String pw = pwTxtField.getText();
		
		if(pw.equals(db.getPassword(id))) {
			MsgBox("성공");
		}else
			MsgBox("실패");
	}
}












