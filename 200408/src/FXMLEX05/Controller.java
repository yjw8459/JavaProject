package FXMLEX05;

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
	public void initialize(URL location, ResourceBundle resources) {//로그인 버튼이 눌렸을 때
		db = new DB();
		// TODO Auto-generated method stub
		loginBtn.setOnAction(e->LoginProc(e));
		
	}
	private void MsgBox(String contents) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(contents);
		alert.show();
		
	}
	public void LoginProc(ActionEvent e) {
		String id = idTxtField.getText();//Text Field의 Text 반환
		String pw = pwField.getText();
	
		if(pw.equals(db.getPassword(id))) {//키 값을 보내서 Value 값을 반환받음
		MsgBox("성공");	
		}else MsgBox("실패");	
		
	}

}
