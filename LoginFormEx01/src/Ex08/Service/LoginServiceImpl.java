package Ex08.Service;

import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginServiceImpl implements LoginService{
	@Override
	public void LoginProc(Parent root) {
		TextField idTxt = (TextField)root.lookup("#txtid");//idTxt
		TextField pwTxt = (TextField)root.lookup("#txtpw");//pwTxt
		System.out.println("ID "+idTxt.getText()+
				", PW "+pwTxt.getText()+
				"�� �ԷµǾ����ϴ�.");	
	}
		@Override
	public void OpenMembershipForm() {
		CommonService comServ = new CommonServiceImpl();
		Stage membershipForm = new Stage();
		comServ.showWindow(membershipForm, "../Membership.fxml");
		/*
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../Membership.fxml"));
		try {
			membershipForm.setScene(new Scene(loader.load()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		membershipForm.show();
		*/
	}
	
	
	
	
	
}








