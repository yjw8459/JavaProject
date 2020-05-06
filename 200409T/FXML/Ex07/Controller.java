package FXML.Ex07;

import java.net.URL;
import java.util.ResourceBundle;

import javax.print.attribute.standard.PDLOverrideSupported;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Controller implements Initializable{
	@FXML private TextField idTxt;
	@FXML private TextField pwTxt;
	@FXML private Button okBtn;
	final private int FIELDLENGTH = 10;
	private MyDB db;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		db = new MyDB();
		okBtn.setDisable(true);
		okBtn.setOnAction(e->{
			LoginProc(e);
		});
		idTxt.textProperty().addListener((obs, oldTxt, newTxt)->{
			checkFieldLength(idTxt);
			isTextField();
		});
		pwTxt.textProperty().addListener((obs, oldTxt, newTxt)->{
			isTextField();
		});
	}
	private void MsgBox(String contents){
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(contents);
		alert.show();
	}
	private void LoginProc(ActionEvent e){		
		if(isTextField(idTxt) && isTextField(pwTxt)) {
			String id = idTxt.getText();
			String pw = pwTxt.getText();
				
			if(pw.equals( db.getPassword(id) ) ){
				MsgBox("����");
			}else{
				MsgBox("����");
			}
		}
		
	}
	private boolean isTextField(TextField txt) {
		String id = txt.getText();
		if(id.isEmpty()) {
			MsgBox(txt.getId() + "�� �Է��ϼ���");
			txt.clear();
			txt.requestFocus();
			return false;
		}
		return true;
	}
	private void isTextField() {
		//������
		/*
		 * String id = idTxt.getText(); String pw = pwTxt.getText();
		 * 
		 * if(id.isEmpty() && pw.isEmpty()) okBtn.setDisable(true); else
		 * okBtn.setDisable(false);
		 */
		
		//ȿ����(ó���ӵ�, �޸�)
		if(idTxt.getLength()>0 && pwTxt.getLength()>0)
			okBtn.setDisable(false);
		else
			okBtn.setDisable(true);
	}
	private void checkFieldLength(TextField txt) {
		if(txt.getLength()>=FIELDLENGTH) {
			txt.setText(txt.getText().substring(0, FIELDLENGTH));
		}
	}
}



















