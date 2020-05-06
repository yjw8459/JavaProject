package Ex07.ElevatorEx12;

import java.net.URL;

import java.util.ResourceBundle;

import Ex07.ElevatorEx12.Service.*;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Controller implements Initializable{
	IBtnService btnServ; //버튼 서비스 인터페이스
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnServ = new BtnServiceImpl();//ButtonService 구현체 생성
	}
	
	public void CreateBtn(ActionEvent e){
		/* 1.고층 값 읽어오기
		 * 2.저층 값 읽어 오기
		 * 3.stage 생성
		 * 4.버튼 생성(고층, 저층)
		 * 5.stage에 버튼 추가
		 *  */
		TextField sFloorTxt = btnServ.getField(e, "#startFloorTxtFld");
		//저층 텍스트필드 값 반환받음
		TextField eFloorTxt = btnServ.getField(e, "#endFloorTxtFld");
		//고층 텍스트필드 값 반환
		int sFloor = btnServ.getIntToField(sFloorTxt);
		//텍스트필드 값의 String형을 int형으로
		int eFloor = btnServ.getIntToField(eFloorTxt);
		
		Stage btnStage = new Stage();
		//새로운 btnStage 생성

		GridPane gridpane = btnServ.getBtnLayout(sFloor, eFloor);
		//int형 저층, 고층 값으로 버튼생성
		
		btnStage.setScene(new Scene(gridpane));
		//새로운 Stage를 GridPane으로 설정
		btnStage.show();
	}
}








