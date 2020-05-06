package Ex07.ElevatorEx7;

import java.net.URL;
import java.util.ResourceBundle;

import Ex07.ElevatorEx7.Service.*;
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
		/* 1.고층 값 읽어오기
		 * 2.저층 값 읽어 오기
		 * 3.stage 생성
		 * 4.버튼 생성(고층, 저층)
		 * 5.stage에 버튼 추가
		 *  */
		TextField sFloorTxt = btnServ.getField(e, "#startFloorTxtFld");
		//저층과 고층의 텍스트필드 값을 받아옴 (event와 텍스트필드 아이디 값 전달)
		TextField eFloorTxt = btnServ.getField(e, "#endFloorTxtFld");
		int sFloor = btnServ.getIntToField(sFloorTxt);
		//String형 TextField를 int형으로 반환
		int eFloor = btnServ.getIntToField(eFloorTxt);
		
		Stage btnStage = new Stage();
		//새로운 스테이지 생성

		GridPane gridpane = btnServ.getBtnLayout(sFloor, eFloor);
		//버튼을 추가한 GridPane을 반환받음 
		
		
		btnStage.setScene(new Scene(gridpane));
		btnStage.show();
	}
}








