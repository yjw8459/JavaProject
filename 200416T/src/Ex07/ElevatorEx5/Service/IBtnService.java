package Ex07.ElevatorEx5.Service;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.scene.Parent;

public interface IBtnService {
	public List<String> getFloor(ActionEvent e);
	
	public void CreateBtn(ActionEvent e);
	
}
