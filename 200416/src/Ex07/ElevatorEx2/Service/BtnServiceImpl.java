package Ex07.ElevatorEx2.Service;

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

	@Override
	public String getTextField(ActionEvent e, String id) {
		TextField txtFld = getField(e, id);
		
		return txtFld.getText();
	}

	@Override
	public void setTextField(ActionEvent e, String id, String txt) {
		TextField txtFld = getField(e, id);
		txtFld.setText(txt);
	}
	public void outFloor(String txt1, String txt2) {
		//입력 층을 받아서 Integer로 변환
		
		int num1 = Integer.parseInt(txt1);
		int num2 = Integer.parseInt(txt2);
		
		for(;num1<num2+1;num1++)//저층부터 고층까지 반복 출력
			System.out.println(num1);
		
	}

}
