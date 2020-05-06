package Quiz02.Service;

import java.io.IOException;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginServiceImpl implements LoginService{
	@Override	public void LoginProc(Parent root) {
		// TODO Auto-generated method stub
	TextField idTxt1 = (TextField)root.lookup("#idTxt");
	TextField pwTxt1 = (TextField)root.lookup("#pwTxt");
	System.out.println("ID"+idTxt1.getText()+
			", PW"+pwTxt1.getText()
	+"가 입력됐습니다");

	}
	 public void CancelProc(Parent root) {
Stage stage = (Stage) root.getScene().getWindow();
stage.close();
		
	}
	 public void OpenMembershipForm() {
		 CommonService comServ = new CommonServiceImpl();

		Stage membershipForm = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../Membership.fxml"));
		//Service에 있는 값이기 때문에 ..을 붙여야함
		try {
			membershipForm.setScene(new Scene(loader.load()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		membershipForm.show();
		
		
	}
	 public void getName(Parent root) {
		 TextField nameTxt = (TextField)root.lookup("#txtName");
			System.out.println(nameTxt.getText());
		}

}
