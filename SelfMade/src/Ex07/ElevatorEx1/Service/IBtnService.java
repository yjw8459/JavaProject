package Ex07.ElevatorEx1.Service;

import javafx.event.ActionEvent;

public interface IBtnService {
	public String getTextField(ActionEvent e, String id);
	public void setTextField(ActionEvent e, String id,String txt);//입력에다 값을 입력하고 get으로 출력
}
