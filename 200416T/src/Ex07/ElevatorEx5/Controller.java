package Ex07.ElevatorEx5;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import Ex07.ElevatorEx5.Service.*;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;


public class Controller implements Initializable{
	IBtnService btnServ;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnServ = new BtnServiceImpl();
	}
	
	public void CreateBtn(ActionEvent e){
		btnServ.CreateBtn(e);
	}
}








