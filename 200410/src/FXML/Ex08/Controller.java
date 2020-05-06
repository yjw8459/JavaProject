package FXML.Ex08;

import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;

import javax.print.attribute.standard.PDLOverrideSupported;

import FXML.Ex08.Service.CommonService;
import FXML.Ex08.Service.ICommonService;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Controller implements Initializable{
	@FXML private TextField idTxt;
	@FXML private TextField pwTxt;//아이디 패스워드 텍스트 필드 2개
	@FXML private Button okBtn; //확인 버튼
	
	@FXML private CheckBox idRememberChkBox;//아이디 기억 체크박스
	
	private ICommonService comServ;//인터페이스 ICommonService 선언
	
	final private int FIELDLENGTH = 10; //아이디 최대 자리 10
	private MyDB db; //구현한 데이터베이스
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		comServ = new CommonService();//comServ에 인터페이스ICommonService의 구현체  CommonService 인스턴스 생성
		//인터페이스와 구현한 Service Class 중요(구조 이해하기)
		db = new MyDB();//데이터베이스 생성
		okBtn.setDisable(true);//확인 버튼 비활성화
		okBtn.setOnAction(e->{ //확인 버튼은 LoginProc()메소드 진행 후 활성화
			LoginProc(e);
			//LoginProc(); = 1.isTextField로 이동해 id,pw텍스트 필드가 비어있는지 확인하고
						   //2. 3중 if else문  - > if 비어있지 않다면, if 로그인 정보가 아니라면, if 아이디 저장 체크박스를 선택하였다면	   
		});
		okBtn.setOnKeyPressed(e->LoginProc(null));//setOnAction ? setOnKeyPressed ? 
		idTxt.setOnAction(e->pwTxt.requestFocus()); //id텍스트필드 진행 후 pw텍스트필드로 포커싱
		pwTxt.setOnAction(e->okBtn.requestFocus());//pw텍스트필드 진행 후 확인 버튼으로 포커싱
		
		//.textProperty = 텍스트 필드 이벤트
		idTxt.textProperty().addListener((obs, oldTxt, newTxt)->{
			checkFieldLength(idTxt);//id텍스트 필드 값을 매개변수로 전달하고 최대 설정값을 넘는지 비교 메소드
			//넘는경우 설정 최대 길이까지만 출력하도록 설정해줌
			isTextField();//매개변수 인자전달이 없는 메소드 호출
			//isTextField 메소드는 매개변수 전달이 있는 메소드와 없는 메소드 두개이다
			//이런 경우를 Override라고 하고 매개변수 인자전달이 있을경우 없을경우 다른 메소드를 호출
			checkEscapeText(idTxt);//설정 값 말고 다른 값이 입력되지 않도록 하는 메소드에 id텍스트필드 전달
			
		});
		pwTxt.textProperty().addListener((obs, oldTxt, newTxt)->{
			isTextField();//위와 동일한 메소드 호출
		});
	}

	private void LoginProc(ActionEvent e){		
		if(isTextField(idTxt) && isTextField(pwTxt))//둘 중 하나라도 false라면 X 
			{//3중 if else문 if 비어있지 않다면, if 로그인 정보가 아니라면, if 아이디 저장 체크박스를 선택하였다면
			String id = idTxt.getText();//아이디와 패스워드의 텍스트 필드 값을 얻어와서 해당 변수에 저장
			String pw = pwTxt.getText();
			//hash ��ȣȭ
			pw = comServ.encryptSHA512(pw);//pw 텍스트 필드 값을 인터페이스 comServ를 통해 암호화
			System.out.println(pw);//암호화 된 값을 확인하기 위한 출력
			
			if(pw.equals( db.getPassword(id) ) ){
				//입력 아이디를 db hashmap에 보내서 입력 pw와 데이터 pw가 맞는지 확인
				comServ.MsgBox("성공");//맞다면 로그인 성공
			}else{//아래 아니라면 if else 문 실
				comServ.MsgBox("실패");//아닐 시 실패
				pwTxt.clear();//실패 시 pw텍스트필드 초기화
				
				if(!idRememberChkBox.isSelected()){//아이디 저장 체크박스가 체크되어있지 않다면
					idTxt.clear();//id텍스트필드 클리어
					idTxt.requestFocus();//id텍스트필드로 포커싱 이동
				}else{
					pwTxt.requestFocus();//체크박스가 체크되어있다면 pw텍스트 필드로 포커싱 이동
				}
			}
		}
		
	}
	private boolean isTextField(TextField txt) {//텍스트 필드가 비었는지 확인
		String id = txt.getText();
		if(id.isEmpty()) {//비어있다면
			comServ.MsgBox(txt.getId() + "�� �Է��ϼ���");//비어있는 텍스트 필드의 아이디 값 +메세지
			txt.clear();//텍스트 필드를 비워줌
			txt.requestFocus();//입력 포커스를 해당 텍스트 필드
			return false;//false를 리턴
		}
		return true;//값이 비어있지 않다면 True반환
	}
	private void isTextField() {//인자전달을 받지 않는 isTextField메소드
		if(idTxt.getLength()>0 && pwTxt.getLength()>0)
			//id텍스트 필드와 pw텍스트필드에 입력값이 있을경우
			okBtn.setDisable(false);//ok버튼 비활성화 해제
		else
			okBtn.setDisable(true);//id,pw텍스트 필드가 하나라도 비어있을 경우 비활성화를 해제하지 않음
	}
	private void checkFieldLength(TextField txt) {//아이디 텍스트필드를 받아서
		if(txt.getLength()>=FIELDLENGTH) {//아이디 텍스트필드 입력 값을 설정 최대값과 비교
			txt.setText(txt.getText().substring(0, FIELDLENGTH));
			//설정 최대 값보다 길다면 설정 최대값까지만 반환
		}
	}
	private void checkEscapeText(TextField txt) {//해당 설정 값만 입력되도록 함
		txt.setText(txt.getText().replaceAll("[^a-zA-Z0-9_]", ""));
		//a~z, A~Z, 0~9만 입력되도록 함
	}
}



















