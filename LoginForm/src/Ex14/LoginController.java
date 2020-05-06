package Ex14;

import java.net.URL;
import java.util.Arrays;
import java.util.Map;
import java.util.ResourceBundle;

import Ex12.Service.*;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class LoginController extends Controller implements Initializable{
	private Parent root;//Controller에서 root를 전달받음
	private LoginService loginServ;//각 인터페이스 선언
	private CommonService comServ;
	private MembershipService memberServ;
		
	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		loginServ = new LoginServiceImpl();//인터페이스의 구현체 생성
		comServ = new CommonServiceImpl();
		memberServ = new MembershipServiceImpl();
	}
	public void LoginProc() {
		String []txtFldIdArr = {"#txtid", "#txtpw"};//텍스트필드들의 아이디 
		Map<String, TextField> txtFldMap = //스테이지와 텍스트 필드들의 아이디를 담은 배열을 전달
				comServ.getTextFieldInfo(root, txtFldIdArr);//그리고 해쉬맵으로 전달받음
		if(comServ.isEmpty(txtFldMap, txtFldIdArr)) {
			//commonServiceImpl의 isEmpty 메소드를 거쳐서 true가 반환된다면 일치하지 않는 문구 
			System.out.println("일치하지 않습니다");
			return ;//그리고 다음을 거치지 않고 바로 메소드 종료
		}
		
		loginServ.LoginProc(root);//값이 비어있지 않다면 LoginServiceImpl의 LoginProc 메소드 실행	
	}
	public void CancelProc(ActionEvent event) {	//취소버튼을 눌렀을 시 현재 Form을 닫음
		//event는 어디 Form에서 왔는지 출처를 알기 위해 
		
		comServ.WindowClose(event);	}
	public void OpenMembershipForm() {
		Parent form = loginServ.OpenMembershipForm();
		//root와 같은 Parent form을 생성하고
		String [] items= {"20대 미만", "20대", "30대", "40대", "50대", "60대 이상"};
		//콤보박스 메소드로 보내줄 String배열 초기화
		memberServ.AddComboBox(form, Arrays.asList(items));
		//새로 생성한 Stage와 String을 전달 Arrays.asList(items) = 배열을 List로 바꿔줌
	}
}













