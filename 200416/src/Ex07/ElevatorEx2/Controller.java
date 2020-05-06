package Ex07.ElevatorEx2;

import java.net.URL;


import java.util.ResourceBundle;

import Ex07.ElevatorEx2.Service.BtnServiceImpl;
import Ex07.ElevatorEx2.Service.IBtnService;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	IBtnService btnServ;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnServ = new BtnServiceImpl();
	}
	
	public void CreateBtn(ActionEvent e){
		//메소드 명은 Button Id와 같아야함 누름 시 메소드 진행
		String txt1 = btnServ.getTextField(e, "#inputTxtFld");
		String txt2 = btnServ.getTextField(e, "#outputTxtFld");
		btnServ.outFloor(txt1,txt2);
		//btnServ.setTextField(e, "#outputTxtFld", String.valueOf(num*10));
	}
	
}
