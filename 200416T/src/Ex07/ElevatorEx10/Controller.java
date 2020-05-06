package Ex07.ElevatorEx10;

import java.net.URL;


import java.util.ResourceBundle;

import Ex07.ElevatorEx10.Service.*;
import Ex07.ElevatorEx10.Service.IBtnService;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


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
		TextField sFloorTxt = btnServ.getField(e, "#startFloorTxtFld");
		TextField eFloorTxt = btnServ.getField(e, "#endFloorTxtFld");
		int sFloor = btnServ.getIntToField(sFloorTxt);
		int eFloor = btnServ.getIntToField(eFloorTxt);
		
		Stage btnStage = new Stage();

		GridPane gridpane = btnServ.getBtnLayout(sFloor, eFloor);
		
		btnStage.setScene(new Scene(gridpane));
		btnStage.show();
	}
}








