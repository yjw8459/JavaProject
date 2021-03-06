package Ex07;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

import Ex07.Service.CommonService;
import Ex07.Service.CommonServiceImpl;
import Ex07.Service.LoginService;
import Ex07.Service.LoginServiceImpl;
import Ex07.Service.MembershipService;
import Ex07.Service.MembershipServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	private Parent root;
	private LoginService loginServ;
	private CommonService comServ;
	private MembershipService membershipServ;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		loginServ = new LoginServiceImpl();
		comServ = new CommonServiceImpl();
		membershipServ = new MembershipServiceImpl();
	}
	//FXML에서 onAction으로 처리한 이름
	public void LoginProc() {
		loginServ.LoginProc(root);
	}
	public void CancelProc(ActionEvent event) {
		//loginServ.CancelProc(root);
		comServ.WindowClose(event);
	}
	public void OpenMembershipForm() {
		loginServ.OpenMembershipForm();
	}
	public void MembershipProc() {
		String []txtFldIdArr = {"#txtName", "#txtID", "#txtPw", "#txtPwOK"};
		Map<String, TextField> txtFldMap = 
				membershipServ.getTextFieldInfo(root, txtFldIdArr);
		if(membershipServ.isEmpty(txtFldMap, txtFldIdArr)) {
			System.out.println("비어 있어요");
			return ;
		}
		String pw = txtFldMap.get(txtFldIdArr[2]).getText();
		String pwOk = txtFldMap.get(txtFldIdArr[3]).getText();
		if(!membershipServ.comparePW(pw, pwOk)) {
			System.out.println("패스워드가 다릅니다.");
			return;
		}
				
		Member member = new Member();
		
		System.out.println(member.getName());
		System.out.println(member.getId());
		System.out.println(member.getPw());
	}
}













