package FXML.Quiz02;
//Quiz id, password입력
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/*Form에서의 fx:id="fx" =fx에서 식별하기 위한 것
id="fx", fx:id="fx2" 첫번 째 id는 css에서 읽어들이는 값 getid(); 메소드를 사용할 시 css id값이 나옴
positionCaret(10) 마지막을 10으로 지정*/

public class Controller implements Initializable{
	@FXML private TextField idTxt;
	
	@FXML private TextField pwTxt;
	@FXML private Button okBtn;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		okBtn.setOnAction(e->{
			MsgBox(e);
		});
		
	}
	private void MsgBox(ActionEvent e) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("로그인 실패");
		if(idTxt.getText().length()>11) {
			alert.setContentText("id는 10자를 넘을 수 없습니다.");
		}
		alert.show();
		
	}
	private boolean EmptyTest(TextField string) {
		String str = string.getText();
		
		boolean result = str.isEmpty();
		return result;
		
	}

}
