package Ex12;

import java.net.URL;

import java.util.Map;
import java.util.ResourceBundle;

import Ex12.Service.*;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class MembershipController extends Controller implements Initializable{
	final int NAME = 0;
	final int ID = 1;
	final int PW = 2;
	final int PWOK = 3;
	
	private Parent root;
	private CommonService comServ;
	private MembershipService membershipServ;
	
	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		comServ = new CommonServiceImpl();
		membershipServ = new MembershipServiceImpl();
	}
	public void CancelProc(ActionEvent event) {
		comServ.WindowClose(event);
	}
	private boolean isCheck(Map<String, TextField> txtFldMap, String []txtFldIdArr) {
		if(comServ.isEmpty(txtFldMap, txtFldIdArr)) {
			System.out.println("��� �־��");
			return false;
		}
		
		String pw = txtFldMap.get(txtFldIdArr[PW]).getText();
		String pwOk = txtFldMap.get(txtFldIdArr[PWOK]).getText();
		if(membershipServ.comparePW(pw, pwOk)) {
			System.out.println("�н����尡 �ٸ��ϴ�.");
			return false;
		}
		if(!membershipServ.isComboBox(root))
			return false;
		return true;
	}
	public void MembershipProc() {
		String []txtFldIdArr = {"#txtName", "#txtID", "#txtPw", "#txtPwOk"};
		Map<String, TextField> txtFldMap = 
				comServ.getTextFieldInfo(root, txtFldIdArr);
		
		if(!isCheck(txtFldMap, txtFldIdArr))
			return;
		
		Member member = new Member();
		member.setName(	txtFldMap.get(txtFldIdArr[NAME]).getText());
		member.setId(txtFldMap.get(txtFldIdArr[ID]).getText());
		member.setPw(txtFldMap.get(txtFldIdArr[PW]).getText());
		member.setAge(membershipServ.getComboBoxString(root));
		
		System.out.println(member.getName());
		System.out.println(member.getId());
		System.out.println(member.getPw());
		System.out.println(member.getAge());
	}
}













