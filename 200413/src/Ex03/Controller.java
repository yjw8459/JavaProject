package Ex03;

import java.net.URL;
import java.util.ResourceBundle;

import Ex03.Service.Service;
import Ex03.Service.ServiceImpl;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class Controller implements Initializable{	
	private Parent root;
	private Service loginServ;
@Override
public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub
	loginServ = new ServiceImpl();
}
@FXML	public void LoginProc() {
	// TODO Auto-generated method stub
loginServ.LoginProc(root);

}
public void setRoot(Parent root2) {
// TODO Auto-generated method stub
this.root = root2;
}
@FXML public void CancelProc() {
loginServ.CancelProc(root);

}
@FXML public void OpenMembershipForm() {
loginServ.OpenMembershipForm();
}

}
