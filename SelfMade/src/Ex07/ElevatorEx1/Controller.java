package Ex07.ElevatorEx1;

import java.net.URL;


import java.util.ResourceBundle;

import Ex07.ElevatorEx0.Service.CommonService;//인터페이스 import
import Ex07.ElevatorEx0.Service.CommonServiceImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Controller implements Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	public void CreateBtn(){
		TextField txtFld =  (TextField)form.lookup("#inputTxtFld");
		//입력창에 넣은 값 저장
		String txt = txtFld.getText();
		TextField txtFldout = (TextField)form.lookup("#outputTxtFld");
		int txt2 = Integer.parseInt(txt)*10;
		txtFldout.setText(Integer.toString(txt2));
		System.out.println(Integer.parseInt(txt)*10);
		//comserv.ShowWindow(s, form);
	}
	
}
