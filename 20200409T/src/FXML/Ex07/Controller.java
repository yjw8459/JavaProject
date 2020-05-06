package FXML.Ex07;

import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;



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
	final private int FIELDLENGTH = 10; //최대 10자리까지
	private MyDB db;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		db = new MyDB();
		okBtn.setDisable(true);//okBtn을 비활성화
		okBtn.setOnAction(e->{
			LoginProc(e);//로그인 정보가 맞는지 확인
		});
		idTxt.textProperty().addListener((obs, oldTxt, newTxt)->{
			checkFieldLength(idTxt);//최대 길이보다 긴지 확인
			isTextField();//idTxt와 pwTxt가 둘 다 값이 있어야 버튼이 활성화
			checkEscapeText(idTxt);
		});
		pwTxt.textProperty().addListener((obs, oldTxt, newTxt)->{
			isTextField();
		});
	}
	private void MsgBox(String contents){
		Alert alert = new Alert(AlertType.WARNING);
		alert.setContentText(contents);
		alert.show();
	}
	private void LoginProc(ActionEvent e){		
		if(isTextField(idTxt) && isTextField(pwTxt)) {
			String id = idTxt.getText();//입력한 아이디 패스워드를 DB의 HashMap과 비교
			String pw = pwTxt.getText();
				
			if(pw.equals( db.getPassword(id) ) ){
				MsgBox("����");
			}else{
				MsgBox("����");
			}
		}
		
	}
	private boolean isTextField(TextField txt) {//txt field가 비어있는지 값이 있는지
		String id = txt.getText();
		if(id.isEmpty()) {
			MsgBox(txt.getId() + "다시 입력해주세요");
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
	private void checkFieldLength(TextField txt) { //id txtField를 받아서 최대 길이보다 긴지 확인
		if(txt.getLength()>=FIELDLENGTH) {
			txt.setText(txt.getText().substring(0, FIELDLENGTH));
		}
	}
	private void checkEscapeText(TextField txt) {
		txt.setText(txt.getText().replace("[a-zA-Z0-9_]", ""));
		//id값 받을 때 특수문자는 등록 자체가 안됌 
		
	}
	public final static String encryptSHA512(String data) {//암호화 코드
        try {
            MessageDigest sha = MessageDigest.getInstance("SHA-512");
            sha.update(data.getBytes());
            StringBuffer sb = new StringBuffer();
            for (byte b : sha.digest()){ 
                sb.append(Integer.toHexString(0xff & b));
            }
            return  sb.toString();
        } catch (NoSuchAlgorithmException e) {
           e.printStackTrace();
            return null;
        }
    }
}



















