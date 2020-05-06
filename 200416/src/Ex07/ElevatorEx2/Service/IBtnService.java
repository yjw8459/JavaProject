package Ex07.ElevatorEx2.Service;

import javafx.event.ActionEvent;

public interface IBtnService {
	public String getTextField(ActionEvent e, String id);
	public void setTextField(ActionEvent e, String id, String txt);
	public void outFloor(String txt1,String txt2);
}
