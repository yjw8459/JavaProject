package Ex07.ElevatorEx7.Service;

import java.util.Map;
import java.util.Set;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class BtnServiceImpl implements IBtnService {
	@Override
	public TextField getField(ActionEvent e, String id) {
		Parent form = ((Parent)e.getSource()).getScene().getRoot();//?
		//event를 Parent로 받아서 
		return (TextField)form.lookup(id);//텍스트필드형으로 lookup 
	}
	@Override
	public int getIntToField(TextField txt) {
		return Integer.parseInt( txt.getText() );
		//String으로 받은 입력 층수들을 int형으로 변환하고 return
		
	}
	private String setFloor(int floor) {
		return floor<0?"지하 "+(floor*-1)+"층":floor+"층";
		//버튼의 층수를 Text세팅해줌
	}
	private void ButtonProc(ActionEvent e) {
		Map<Integer, String> map;
		ProcessButtonService iProcBtnServ = new ProcessButtonServiceImpl();
		//버튼이 눌리었다면 층 저장 다시 눌리면 제거
		iProcBtnServ.CheckButtonPressed(e);
		//현재 눌려 있는 층 가져오기
		iProcBtnServ.getActiveButton();
		//출력
		Set<Integer> set = map.keySet();
		for(Integer idx:set)
			System.out.println(map.get(idx));
		
	}
	/*
	 * @Override public List<String> getFloor(ActionEvent e) { int startFloor =
	 * getIntToField(getField(e, "#startFloorTxtFld")); int endFloor =
	 * getIntToField(getField(e, "#endFloorTxtFld")); List<String> lstFloor = new
	 * ArrayList<String>();
	 * 
	 * for(int i=startFloor;i<=endFloor;i++) { if(i==0) continue;
	 * lstFloor.add(setFloor(i)); }
	 * 
	 * return lstFloor; }
	 */

	/*
	 * @Override public void CreateBtn() { Stage btnStage = new Stage();
	 * 
	 * Button btn1 = new Button("1��"); Button btn2 = new Button("2��"); GridPane
	 * gridpane = new GridPane(); gridpane.add(btn1, 0, 0); gridpane.add(btn2, 0,
	 * 1);
	 * 
	 * btnStage.setScene(new Scene(gridpane)); btnStage.show(); }
	 */
	@Override
	public GridPane getBtnLayout(int sFloor, int eFloor) {
		//시작 층과 마지막 층을 int형으로 전달받음
		GridPane gridpane = new GridPane();
		//gridpane생성
		int rowIndex = 1;
		//음수는 표현 불가능하기 때문에 따로 변수 하나 지정
		
		
		gridpane.setPadding(new Insets(20));//버튼의 간격
		gridpane.setHgap(10);//GridPane 간격
		gridpane.setVgap(10);
		int idx=0;
		for(int i=eFloor;i>=sFloor;i--) {
			if(i==0)continue;//0층을 만난다면 continue (0층 제거)
			
			ToggleButton btn = new ToggleButton(setFloor(i));
			//setFloor =층 버튼의 Text를 설정받음, 새로운 버튼을 층마다 만듬
			btn.setPrefSize(80, 70);
			btn.setFont(new Font(20));//글자 크기
			
			gridpane.add(btn, idx, rowIndex++);//만든 버튼을 gridpane에 이어붙임 
			//좌표가 -일수 없기 때문에 따로 rowIndex를 사용
			if(rowIndex==6) {//rowIndex가 6이면 1로 초기화하고 idx값을 1올려줌 idx는 x축 rowIndex는 y축
				rowIndex=1; idx+=1;}
		}
		return gridpane;//완성한 gridpane을 반환
	}

}











