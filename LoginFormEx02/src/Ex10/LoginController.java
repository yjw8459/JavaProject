package Ex10;

import java.net.URL;


import java.util.Arrays;
import java.util.Map;
import java.util.ResourceBundle;

import Ex10.Service.*;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class LoginController extends Controller implements Initializable{
	private Parent root;
	private LoginService loginServ;
	private CommonService comServ;
	private MembershipService memberServ;
		
	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		loginServ = new LoginServiceImpl();
		comServ = new CommonServiceImpl();
		memberServ = new MembershipServiceImpl();//사용할 인터페이스와 구현체 
		
	}
	public void LoginProc() {
		String []txtFldIdArr = {"#txtid", "#txtpw"};
		Map<String, TextField> txtFldMap = 
				comServ.getTextFieldInfo(root, txtFldIdArr);
		if(comServ.isEmpty(txtFldMap, txtFldIdArr)) {
			System.out.println("��� �־��");
			return ;
		}
		
		loginServ.LoginProc(root);	
	}
	public void CancelProc(ActionEvent event) {		comServ.WindowClose(event);	}
	public void OpenMembershipForm() {		
		Parent form=loginServ.OpenMembershipForm();
	String [] items = {"20대 미만","20대","30대","40대","50대","60대이상"};
	memberServ.AddComboBox(form, Arrays.asList(items));
	System.out.println("..");
	}
	//Arrays = 리스트로 바꿔줌
}













