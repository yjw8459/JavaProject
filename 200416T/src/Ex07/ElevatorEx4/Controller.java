package Ex07.ElevatorEx4;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import Ex07.ElevatorEx4.Service.*;
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
		List<String> lstFloor = btnServ.getFloor(e);
		
		for(String floor : lstFloor)
			System.out.println(floor);
	}
}








