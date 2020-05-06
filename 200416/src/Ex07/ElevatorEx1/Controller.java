package Ex07.ElevatorEx1;

import java.net.URL;
import java.util.ResourceBundle;

import Ex07.ElevatorEx1.Service.BtnServiceImpl;
import Ex07.ElevatorEx1.Service.IBtnService;
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
		btnServ.getTextField(e, "#inputTxtFld");
	}
}
