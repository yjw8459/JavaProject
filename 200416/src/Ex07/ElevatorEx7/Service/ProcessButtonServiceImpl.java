package Ex07.ElevatorEx7.Service;

import java.util.TreeMap;

import javafx.event.ActionEvent;
import javafx.scene.control.ToggleButton;

public class ProcessButtonServiceImpl implements ProcessButtonService{
	
	public void CheckButtonPressed(ActionEvent e) {
		ToggleButton btn = (ToggleButton)e.getSource();
		
	if(btn.isSelected())
	activeBtnMap.put(Integer.valueOf(btn.getId()),btn.getText());
	else {
		activeBtnMap.remove(Integer.valueOf(btn.getId()));
	}
	public TreeMap<Integer, String> getActiveButton(){
		return(TreeMap<Integer, String>)activeBtnMap;
	}
	}

	@Override
	public void getActiveButton() {
		// TODO Auto-generated method stub
		
	}

}
