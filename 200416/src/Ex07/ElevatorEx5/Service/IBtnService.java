package Ex07.ElevatorEx5.Service;

import java.util.List;


import javafx.event.ActionEvent;

public interface IBtnService {
	public List<String> PrintFloor(ActionEvent e);
	public void CreateBtn();
}
