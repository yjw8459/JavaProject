package Ex07.ElevatorEx1.Service;

import javafx.event.ActionEvent;

public class IBtnServiceImpl implements IBtnService {

	@Override
	public String getTextField(ActionEvent e, String id) {
		//발생된 이벤트는 버튼이 클릭 되었을 경우 이므로
		//getSource를 통해 얻어오는 event는 button이다
		return null;
	}

	@Override
	public void setTextField(ActionEvent e, String id, String txt) {
		

	}

}
