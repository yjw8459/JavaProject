package Ex07.ElevatorEx4.Service;

import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class BtnServiceImpl implements IBtnService {

	private TextField getField(ActionEvent e, String id) {
		Parent btn = (Parent)e.getSource();
		Parent form = btn.getScene().getRoot();
		
		return (TextField)form.lookup(id);
	}
	private int getIntToField(TextField txt) {
		String strNum = txt.getText();
		int num = Integer.parseInt(strNum);
		
		return num;
		//return Integer.parseInt( txt.getText() );
	}
	private String setFloor(int floor) {
		return floor<0?"ÁöÇÏ "+(floor*-1)+"Ãþ":floor+"Ãþ";
	}
	@Override
	public List<String> getFloor(ActionEvent e) {
		int startFloor = getIntToField(getField(e, "#startFloorTxtFld"));
		int endFloor = getIntToField(getField(e, "#endFloorTxtFld"));
		List<String> lstFloor = new ArrayList<String>();
		
		for(int i=startFloor;i<=endFloor;i++) {
			if(i==0)	continue;
			lstFloor.add(setFloor(i));
		}
		
		return lstFloor;
	}

}
