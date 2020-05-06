package Ex07.ElevatorEx5.Service;

import java.util.ArrayList;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

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
		return floor<0?"지하"+(floor*-1)+"층":floor+"층";
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
	@Override
	public void CreateBtn(ActionEvent e) {
		Stage btnStage = new Stage();
		int startFloor = getIntToField(getField(e, "#startFloorTxtFld"));
		int endFloor = getIntToField(getField(e, "#endFloorTxtFld"));
		
		for(int i = startFloor; i<=endFloor; i++) {
			
		}
		
		List<Button> lstbtn = new ArrayList<Button>();
		//for(int i = )
		Button btn1 = new Button("1층");
		Button btn2 = new Button("2층");
		GridPane gridpane = new GridPane();
		gridpane.add(btn1, 0, 0);
		gridpane.add(btn2, 0, 1);
		
		btnStage.setScene(new Scene(gridpane));
		btnStage.show();
	}

}











