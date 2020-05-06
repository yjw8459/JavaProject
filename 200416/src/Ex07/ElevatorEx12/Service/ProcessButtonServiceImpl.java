package Ex07.ElevatorEx12.Service;
//Map에 데이터를 저장하고, 반환하는 인터페이스(데이터 관련 인터페이스)

import java.util.Map;

import java.util.TreeMap;

import javafx.event.ActionEvent;
import javafx.scene.control.ToggleButton;

public class ProcessButtonServiceImpl implements IProcessButtonService {
	Map<Integer, String> activeBtnMap;//맵 선언
	public ProcessButtonServiceImpl() {
		//생성자 생성과 즉시 맵 생성
		activeBtnMap = new TreeMap<Integer, String>();//트리맵 생성
	}
	@Override
	public void CheckButtonPressed(ActionEvent e) {
		ToggleButton btn = (ToggleButton)e.getSource();//버튼이 눌렸을 때 버튼에서 전달 이벤트의 출처 
		//getSource로 출처를 밝힘
		
		if(btn.isSelected())
			activeBtnMap.put(Integer.valueOf(btn.getId()), btn.getText());
		//String을 integer로 받아서 1층이면 1, 지하1층이면 -1로 받음 맵에 저장
		else
			activeBtnMap.remove(Integer.valueOf(btn.getId()));
		//눌려있지 않다면 Map의 Id값을 찾아서 지움
	}

	@Override
	public TreeMap<Integer, String> getActiveButton() {	
		return (TreeMap<Integer, String>)activeBtnMap;
		//Map을 반환하는 메소드
	}

}
