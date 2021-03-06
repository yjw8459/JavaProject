package Ex08;

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

public class MembershipController extends Controller implements Initializable{
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
	//FXML���� onAction���� ó���� �̸�
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
	comServ.MembershipProc();
	}
}













