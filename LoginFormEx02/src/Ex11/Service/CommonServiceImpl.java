package Ex11.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import Ex07.Controller;
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
	public void WindowClose(ActionEvent event) { //취소 버튼으로 윈도우를 닫음
		Parent root = (Parent)event.getSource();
		Stage stage = (Stage) root.getScene().getWindow();
		stage.close();
	}

	@Override
	public Parent showWindow(Stage s, String formPath) {//새 창을 띄움 main에서 primaryStage와 fxml파일명을 String으로 받음
		FXMLLoader loader = new FXMLLoader(getClass().getResource(formPath));
		Parent root = null;
		try {
			root = loader.load();
			s.setScene(new Scene(root));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Controller ctrler = loader.getController();//컨트롤러와 이어줌
		ctrler.setRoot(root);//컨트롤러에 root를 전달해줌과 동시에 root는 로그인 컨트롤과 멤버쉽컨트롤로 이어짐
		
		s.show();
		return root;
	}
	
	@Override
	public Map<String, TextField> getTextFieldInfo(Parent membershipForm, String[] txtFldIdArr) {
		Map<String, TextField> txtFldMap = new HashMap<String, TextField>();
		//해쉬맵 자리값 String, Value는 TextField형
		
		for(String txtFldId : txtFldIdArr) {
			TextField txtFld = (TextField)membershipForm.lookup(txtFldId);
			txtFldMap.put(txtFldId, txtFld);
		}
		return txtFldMap;
	}

	@Override
	public boolean isEmpty(Map<String, TextField> txtFldMap, String[] txtFldIdArr) {
		for(String txtFldId : txtFldIdArr) {
			TextField txtFld = txtFldMap.get(txtFldId);
			
			if(txtFld.getText().isEmpty()) {
				txtFld.requestFocus();
				return true;
			}
		}
		return false;
	}

	@Override
	public void ErrorMsg(String title, String headerStr, String ContentTxt) {
		// TODO Auto-generated method stub
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
