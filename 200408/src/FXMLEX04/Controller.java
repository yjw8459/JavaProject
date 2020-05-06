package FXMLEX04;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	@FXML private TextField idTxtField;
	@FXML private PasswordField pwField;
	@FXML private Button loginBtn;
	private DB db;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		db = new DB();
		loginBtn.setOnAction(e->LoginProc(e));
		
		
	}
	public void MsgBox(String contents) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(contents);
		alert.show();
		
	}
	public void LoginProc(ActionEvent e) {
		String id = idTxtField.getText();
		String pw = pwField.getText();
		
		if(pw.equals(db.getPassword(id))) MsgBox("성공");
		else MsgBox("실패");
		
	}
	
}