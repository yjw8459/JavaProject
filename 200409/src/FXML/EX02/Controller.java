package FXML.EX02;

import java.net.URL;
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
//Property = 속성
//Stream : 데이터가 계속 흐르는 것
//Listen = 대기 상태
public class Controller implements Initializable{
	@FXML private TextField idTxt;
	@FXML private TextField pwTxt;
	@FXML private Button okBtn;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		okBtn.setOnAction(e->{
			//cleanTest(e);
			//requestFocusTest(e);
		
		});
		idTxt.textProperty().addListener((obs,oldTxt,newTxt)->{
			addListenerTest(obs,oldTxt,newTxt);
		});//idTxt의 값이 변경됐을 때 동작시킨다
		pwTxt.setOnKeyPressed(e->{
			setOnKeyPressedTest(e);
			
		});//키보드가 눌렸을 때
		
	}
	private void cleanTest(ActionEvent e) {
		idTxt.clear(); // 객체에 있는 값을 비워주는 것 idTxt에 쓴 값을 지워줌
	}
	private void requestFocusTest(ActionEvent e) {
		pwTxt.requestFocus();//포커스가 pwTxt로 이동함
		
	}

	
	private void addListenerTest(ObservableValue<? extends String> obs, String oldTxt, String newTxt)
	//변경으로 자동완성한 메소드임
	{
	//System.out.println(":"+obs);//옵저버 여러가지 값들을 가지고 있게 됌
		System.out.println("obs:"+obs.getValue());//.getValue()로 값을 가져올 수 있음
	System.out.println("oldTxt:"+oldTxt);//전에 있던 값
	System.out.println("newTxt:"+newTxt);//신규 값
	//아이디 중복체크도 이런 사이클로 작동 DB에 보내서 비교함
	}
	//ActionEvent는 마우스 이벤트임
	private void setOnKeyPressedTest(KeyEvent e) {//KeyEvent!
		System.out.println(e.getText());//키보드에 눌린 값을 가져와라
	}
}
