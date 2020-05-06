package Quiz02;

import java.net.URL;


import java.util.ResourceBundle;

import Quiz02.Service.CommonService;
import Quiz02.Service.CommonServiceImpl;
import Quiz02.Service.LoginService;
import Quiz02.Service.LoginServiceImpl;//인터페이스 임폴트
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;



public class Controller implements Initializable{
	private Parent root;
	private LoginService loginServ;
	private CommonService comServ;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		loginServ = new LoginServiceImpl();
		comServ = new CommonServiceImpl();
	}
@FXML	public void LoginProc() {
		// TODO Auto-generated method stub
	loginServ.LoginProc(root);

	}
public void setRoot(Parent root2) {
	// TODO Auto-generated method stub
	this.root = root2;
}
@FXML public void CancelProc(ActionEvent event) {
//loginServ.CancelProc(root);
comServ.WindowClose(event);
	
}
@FXML public void OpenMembershipForm() {
loginServ.OpenMembershipForm();
}
@FXML public void getName() {
	loginServ.getName(root);
}

}
