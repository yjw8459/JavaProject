package Ex06;

import java.net.URL;

import java.util.ResourceBundle;

import Ex06.Service.CommonService;
import Ex06.Service.CommonServiceImpl;
import Ex06.Service.LoginService;
import Ex06.Service.LoginServiceImpl;
import Ex06.Service.MembershipService;
import Ex06.Service.MembershipServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class Controller implements Initializable{
	private Parent root;
	private LoginService loginServ;
	private CommonService comServ;
	private MembershipService membershipServ;
	
	public void setRoot(Parent root) {//showwindow로부터 받은 root로 클래스 root초기화
		this.root = root;
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		loginServ = new LoginServiceImpl();
		//loginService 인터페이스와 구현체 생성
		comServ = new CommonServiceImpl();
		//commonService 인터페이스와 구현체 생성
		membershipServ = new MembershipServiceImpl();
		//membershipService 인터페이스와 구현체 생성
	}
	//FXML���� onAction���� ó���� �̸�
	public void LoginProc() {//LoginForm에 입력한 텍스트 필드 아이디와 패스워드 입력 값 콘솔 창에 출력
		loginServ.LoginProc(root);
	}
	public void CancelProc(ActionEvent event) {//현재 윈도우를 닫는 작업 수행
		//loginServ.CancelProc(root);
		comServ.WindowClose(event);
	}
	public void OpenMembershipForm() {//MembershipForm을 ShowWindow를 통해 새창
		//LoginForm에서 회원가입 버튼을 눌렀을 때 새로운 MembershipForm을 띄움
		loginServ.OpenMembershipForm();
	}
	public void MembershipProc() {
		membershipServ.MembershipProc(root);
		//MembershipForm에서 회원가입을 눌렀을 때 현재 Form을 보내주고 
		//Membership인터페이스에 있는 getMember메소드를 통해 Member클래스에 데이터 저장
	}
}













