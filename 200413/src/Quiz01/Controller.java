package Quiz01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller implements Initializable{
	private Parent root;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
@FXML	public void LoginProc() {
		// TODO Auto-generated method stub
	TextField idTxt1 = (TextField)root.lookup("#idTxt");
	TextField pwTxt1 = (TextField)root.lookup("#pwTxt");
	System.out.println("ID"+idTxt1.getText()+
			", PW"+pwTxt1.getText()
	+"가 입력됐습니다");

	}
public void setRoot(Parent root2) {
	// TODO Auto-generated method stub
	this.root = root2;
}
public void CancelProc() {
	TextField idTxt1 = (TextField)root.lookup("#idTxt");
	TextField pwTxt1 = (TextField)root.lookup("#pwTxt");
	
	idTxt1.clear();
	pwTxt1.clear();
	
}
public void OpenMembershipForm() {
	Button membershipBtn = (Button)root.lookup("#OpenMembershipForm");
	System.out.println(membershipBtn.getId());
	
}

}
