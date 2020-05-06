package FXML.EX04;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Controller implements Initializable{
	@FXML private TextField idTxt;
	@FXML private TextField pwTxt;
	@FXML private TextField mailTxt;
	@FXML private Button membershipBtn;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		idTxt.setOnAction(e->pwTxt.requestFocus());
		pwTxt.setOnAction(e->mailTxt.requestFocus());
		mailTxt.setOnAction(e->membershipBtn.requestFocus());
		
		membershipBtn.setOnKeyPressed(e->handleBtnAction(e));
	}
	private void handleBtnAction(KeyEvent e) {
		System.out.println("회원 가입 실행");
		
	}
}
