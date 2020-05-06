package FXML.EX01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

//Stream : 데이터가 계속 흐르는 것
public class Controller implements Initializable{
	@FXML private TextField idTxt;
	@FXML private TextField pwTxt;
	@FXML private Button okBtn;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		okBtn.setOnAction(e->{
			isEmptyTest(e);
		});
	}
	private void MsgBox(String contents) {

	Alert alert = new Alert(AlertType.INFORMATION);
	
	alert.setContentText(contents);
	alert.show();
	
	}
	private void isEmptyTest(ActionEvent e) {

	String str = idTxt.getText();
	boolean result =str.isEmpty();//값이 비어있는지 확인. 불린형임
	MsgBox(String.valueOf(result));//valueOf 모든 형태를 문자열로 바꿔주는 스태틱형 메소드 유용할듯
	//result는 불린형이기 때문에 바꿔줘야함
	MsgBox(""+result);//강제형변환
	
	}
	private void lengthTest(ActionEvent e) {

		String str = idTxt.getText();
		
		int result = str.length();//length = 길이를 구하는 메소드 스트링에도 있음
		MsgBox("length :" + String.valueOf(result));
				
	}
	private void EqualsTest(ActionEvent e) {

		String id = idTxt.getText();
		String pw = pwTxt.getText();
		//완전 일치
		boolean result = id==pw;//false 완전 일치하지 않음
		MsgBox("id==pw:" +String.valueOf(result) );
		//내용일치
		result = id.contentEquals(pw); //equals와 같음 문자열만 비교할 땐 이 메소드 사용
		MsgBox("id==pw:" +String.valueOf(result) );
		//객체가 같은 종류이며 내용 일치
		result = id.equals(pw);
		MsgBox("id==pw:" +String.valueOf(result) );
	}
	
private void subStringTest(ActionEvent e) {
	String id = idTxt.getText();
	
	MsgBox("id.substring(2):"+id.substring(2));//문자열을 자를 때 사용 일부분만 얻어온다 
	//두번 째 위치부터 끝까지 출력해라
	MsgBox("id.substring(2,4):"+id.substring(2,4));//두번 째에서 네번 째까지 출력해라
	
}
}
