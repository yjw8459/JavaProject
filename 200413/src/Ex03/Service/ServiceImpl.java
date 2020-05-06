package Ex03.Service;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ServiceImpl implements Service{
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
		Stage membershipForm = new Stage();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../Membership.fxml"));
		try {
			membershipForm.setScene(new Scene(loader.load()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		membershipForm.show();
		
	}


}
