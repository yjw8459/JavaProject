package Ex07.ElevatorEx7;

import java.net.URL;


import java.util.ResourceBundle;

import Ex07.ElevatorEx7.Service.*;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;


public class Controller implements Initializable{
	IBtnService btnServ;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnServ = new BtnServiceImpl();
	}
	
	public void CreateBtn(ActionEvent e){
		/*
		 * 1. ���� �� �о� ����
		 * 2. ���� �� �о� ����
		 * 3. stage ����
		 * 4. ��ư ����(����, ����)
		 * 5. stage�� ��ư �߰�
		 */
		btnServ.CreateBtn();
	}
}








