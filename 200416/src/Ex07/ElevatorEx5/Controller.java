package Ex07.ElevatorEx5;

import java.net.URL;




import java.util.ResourceBundle;

import Ex07.ElevatorEx5.Service.*;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	IBtnService btnServ;
	Parent root;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnServ = new BtnServiceImpl();
	}
	
	public void CreateBtn(ActionEvent e){
		//메소드 명은 Button Id와 같아야함 누름 시 메소드 진행
		btnServ.CreateBtn(root);
		
		/*
		 * List<String> lstFloor = btnServ.PrintFloor(e); for(String floor : lstFloor)
		 * System.out.println(Floor); 
		 * 리스트를 생성해서 출력해도 됌
		 */
		
		
		
		//btnServ.setTextField(e, "#outputTxtFld", String.valueOf(num*10));
	}

	public void setForm(Parent root) {
		this.root = root;
		
	}
	
}
