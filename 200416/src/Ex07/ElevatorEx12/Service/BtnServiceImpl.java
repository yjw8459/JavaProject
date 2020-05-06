package Ex07.ElevatorEx12.Service;
//버튼 액션 생성관련 인터페이스
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
		Parent form = ((Parent)e.getSource()).getScene().getRoot();
		//event를 Parent로 받아서
		return (TextField)form.lookup(id);//텍스트필드형으로 lookup
	}
	@Override
	public int getIntToField(TextField txt) {
		return Integer.parseInt( txt.getText() );
		//String으로 받은 입력 층수들을 int형으로 변환하고 return
	}
	private String setFloor(int floor) {
		return floor<0?"지하"+(floor*-1)+"층":floor+"층";
		//버튼의 층수를 Text세팅해줌
	}
	private void ButtonProc(ActionEvent e) {
		Map<Integer, String> map;
		IProcessButtonService procBtnServ = new ProcessButtonServiceImpl();
		//인터페이스와 구현체 생성(맵이 바로 생성됌
		//CheckButtonPressed로 이벤트 전달 버튼이 눌리었다면 층 저장 다시 눌리면 제거
		procBtnServ.CheckButtonPressed(e);
		//현재 눌려 있는 층 가져오기
		map = procBtnServ.getActiveButton();//getActiveButton은 Map을 반환하는 메소드
		//출력
		Set<Integer> set = map.keySet();//Set = 인덱스가 없음 keySet= map의 키값으로 세팅
		//Value를 Set Integet로 받은 이유는 set가 Integer형 이기때문에 Integer idx로 값을 하나씩 꺼내옴
		for(Integer idx : set)
			System.out.println(map.get(idx));
	}
	@Override
	public GridPane getBtnLayout(int sFloor, int eFloor) {
		GridPane gridpane = new GridPane();//GridPane생성
		int posIdx=0;//좌표를 다룰 posIdx 생성
		gridpane.setPadding(new Insets(20));//패딩과 GridPane의 간격을 맞춰줄 Hgap,Vgap
		gridpane.setHgap(10);
		gridpane.setVgap(10);
		
		for(int i=eFloor;i>=sFloor;i--) {
			if(i==0)continue;//0층을 만나면 continue
			ToggleButton btn = new ToggleButton(setFloor(i));
			//ToggleButton을 생성하고setFloor에서 ButtonText를 생성받음
			btn.setFont(new Font(20));//Button 글자 크기 조정
			btn.setPrefSize(80, 70); //Button 크기 조정
			btn.setId(String.valueOf(i));//Button의 아이디:int형을 String형으로 변환하여 숫자로 설정
			btn.setOnAction(e->ButtonProc(e));//Button이 눌리면 ButtonProc으로 event전달
			gridpane.add(btn, posIdx/6, posIdx%6);
			// 나누기연산은0...1... %연산은 1,2,3....1,2,3...
			posIdx++;
		}
		return gridpane;
	}

}











