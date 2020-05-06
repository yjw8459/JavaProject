package Ex07.ElevatorEx6.Service;

import java.util.ArrayList;


import java.util.List;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BtnServiceImpl implements IBtnService {
	@Override
	public TextField getField(ActionEvent e, String id) {
		/*
		 * Parent btn = (Parent)e.getSource(); Parent form = btn.getScene().getRoot();
		 */
		Parent form = ((Parent)e.getSource()).getScene().getRoot();//위 코드 간소호ㅏ

		
		return (TextField)form.lookup(id);
	}
	@Override
	public int getIntToField(TextField txt) {
		/*
		 * String strNum = txt.getText(); int num = Integer.parseInt(strNum);
		 * 
		 * return num;
		 */
		return Integer.parseInt( txt.getText() );
	}
	private String setFloor(int floor) {
		return floor<0?"지하"+(floor*-1)+"층":floor+"층";
	}
	@Override
	public List<String> getFloor(ActionEvent e) {
		int startFloor = getIntToField(getField(e, "#startFloorTxtFld"));
		int endFloor = getIntToField(getField(e, "#endFloorTxtFld"));
		List<String> lstFloor = new ArrayList<String>();
		
		for(int i=startFloor;i<=endFloor;i++) {
			if(i==0)	continue;
			lstFloor.add(setFloor(i));
		}
		
		return lstFloor;
	}
	
	@Override
	public void CreateBtn() {
		Stage btnStage = new Stage();
		int startFloor = getIntToField(getField(e, "#startFloorTxtFld"));
		int endFloor = getIntToField(getField(e, "#endFloorTxtFld"));
		
		GridPane gridpane = getBtnLayout(startFloor, endFloor);
		
		//for(int i = )
		

		btnStage.setScene(new Scene(gridpane));
		btnStage.show();
	}
	@Override
	public GridPane getBtnLayout(int sFloor, int eFloor) {
		GridPane gridpane = new GridPane();//GridPane생성
		
		for(int i=sFloor;i<=eFloor;i++) {
			//새로운 Button을 생성해서 GridPane에 담음
			if(i==0)continue;//0을 만나면 컨티뉴 0층 제거
			Button btn = new Button(setFloor(i));
			//String형으로 버튼 이름 세팅해주는 setFloor
			gridpane.add(btn, 0, i);
			//버튼의 레이아웃 지정 및 gridpane에 추가
		}
		return gridpane;
	}

}











