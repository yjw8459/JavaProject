package LoginForm;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	private Parent root;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
	}
	//FXML에서 OnAction으로 처리한 이름
	//FXML에 OnAction으로 연결해줘도 됨
@FXML	private void LoginProc() {
		//lookup을 이용하여 객체 얻기
		TextField txtField = (TextField)root.lookup("#idTxt");
		System.out.println(txtField.getText());

	}
	

}
