package Ex14.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import Ex12.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CommonServiceImpl implements CommonService{
	@Override
	public void WindowClose(ActionEvent event) {//취소 버튼을 누르면 Form을 닫음 
		
		Parent root = (Parent)event.getSource();
		Stage stage = (Stage) root.getScene().getWindow();
		stage.close();
	}

	@Override
	public Parent showWindow(Stage s, String formPath) {//새 Form 생성
		FXMLLoader loader = new FXMLLoader(getClass().getResource(formPath));
		Parent root = null;
		try {
			root = loader.load();
			s.setScene(new Scene(root));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Controller ctrler = loader.getController();
		ctrler.setRoot(root);
		
		s.show();
		
		return root;//??
	}
	
	@Override
	public Map<String, TextField> getTextFieldInfo(Parent membershipForm, String[] txtFldIdArr) {
		//해쉬 맵을 반환하는 메소드
		Map<String, TextField> txtFldMap = new HashMap<String, TextField>();
		//String형 자리값과 Value는 텍스트필드
		for(String txtFldId : txtFldIdArr)//txtFldArr을 txtFldId로 간주하고  
			{
			TextField txtFld = (TextField)membershipForm.lookup(txtFldId);
			//전달 받는 값 txtFldArr은 버튼의 ID를 가지고 있기 때문에 lookup으로 값을 반환받음
			txtFldMap.put(txtFldId, txtFld);
			//자리값으로 텍스트필드 아이디, Value로 작성한 아이디를 맵에 저장
		}
		return txtFldMap;//해쉬 맵 반환
	}

	@Override
	public boolean isEmpty(Map<String, TextField> txtFldMap, String[] txtFldIdArr) {
		//이름, 아이디, 패스워드가 비어있는지 확인. 비어있다면 비어있는 텍스트 필드에 포커스
		for(String txtFldId : txtFldIdArr) {
			TextField txtFld = txtFldMap.get(txtFldId);
			
			if(txtFld.getText().isEmpty()) {
				txtFld.requestFocus();
				return true;//비어있다면 true반환
			}
		}
		return false;//비어있지 않다면 false반환
	}

	@Override
	public void ErrorMsg(String title, String headerStr, String ContentTxt) {
		//각 타이틀들을 세팅할 문자열을 받아서 에러메세지 처리 
		//오버라이딩
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(title);
		alert.setHeaderText(headerStr);
		alert.setContentText(ContentTxt);
		alert.showAndWait();
	}

	@Override
	public void ErrorMsg(String headerStr, String ContentTxt) {
		// TODO Auto-generated method stub
		ErrorMsg("error", headerStr, ContentTxt);
	}

	@Override
	public void ErrorMsg(String ContentTxt) {
		// TODO Auto-generated method stub
		ErrorMsg("error", "error Header", ContentTxt);
	}
}
