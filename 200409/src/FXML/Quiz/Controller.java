package FXML.Quiz;
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
id="fx", fx:id="fx2" 첫번 째 id는 css에서 읽어들이는 값 getid(); 메소드를 사용할 시 css id값이 나옴*/

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
		alert.setHeaderText("메시지");
		if(EmptyTest(pwTxt)==true)
		alert.setContentText("Password를 입력해야합니다.");
		//pwTxt.clear(); 하나의 입력이 없을 시 지워주는게 좋음
		if(EmptyTest(idTxt)==true)
				alert.setContentText("id를 입력해야합니다");
		//idTxt.clear();
		alert.show();
		
	}
	private boolean EmptyTest(TextField string) {
		String str = string.getText();
		/*if문 시 간소화 가능
		 * if(!str.isEmpty()) return;{ MsgBox("ID를 입력하세요");
		 * 값이 없을 시엔 리턴으로 이프문이 진행되지 않음
		 * 지우는 코드도 추가하는 것이 좋다
		 */
		boolean result = str.isEmpty();//idTxt값이 비었는지 확인
		//if(string.getText().isEmpty()) 이렇게도 표현 가능
		return result;
		
	}

}
