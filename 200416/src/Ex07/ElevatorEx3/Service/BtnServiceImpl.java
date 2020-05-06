package Ex07.ElevatorEx3.Service;

import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;


import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class BtnServiceImpl implements IBtnService {
	private TextField getField(ActionEvent e, String id) {
		//발생된 이벤트는 버튼이 클릭 되었을 경우 이므로
		//getSource를 통해 얻어오는 event는 button이다
		Parent btn = (Parent)e.getSource();
		Parent form = btn.getScene().getRoot();//형변환의 이유는 가져오는 무언가를 같은 형태로 맞춰주기 위해
		
		TextField txtFld = (TextField)form.lookup(id);
		
		return (TextField)form.lookup(id);
		
	}
	private int getIntToField(TextField txt) {
		String strNum = txt.getText();
		int num = Integer.parseInt(strNum);
		
		return num;
		//return Integer.parseInt(txt.getText());
		
	}
	
	/*
	 * private String setUnderFloor(int floor) { 
	 * return floor<0?"지하"+(floor*-1)+"층":floor+"층"; //true일 경우 :를 기준으로 왼쪽 실행 false일 경우 오른쪽
	 * 실행 }
	 */	@Override
	public List<String> PrintFloor(ActionEvent e) {
		List<String> lstElv = new ArrayList<String>();
				
		int startFloor = getIntToField(getField(e,"#inputTxtFld"));//String을 int로 바꿔주는 메소드 이용
		int endFloor = getIntToField(getField(e,"#outputTxtFld"));
		//시작 층, 끝 층 얻어오기
		for(int i = startFloor; i <=endFloor;i++) {//시작과 끝 설정
			if(i<0) {//i가 0	보다 작다면 j에 i를 담고 j를 절대값으로 만들어서 리스트
				int j = i;
				j*=-1;
				lstElv.add(String.valueOf("B"+j+"층"));//j+"층" 자동 형 변환가능
			}
			else if(i==0) { i++;lstElv.add(String.valueOf(i)+"층");}//i == 0이라면 i를 하나 더해서 리스트
			//continue를 사용해도 됌
			else lstElv.add(String.valueOf(i)+"층");//i가 0이상이라면 리스트에 담음
		}
			return lstElv;//값을 담은 리스트를 반환 
			
	}

}
