package Ex07.ElevatorEx0;

import java.net.URL;

import java.util.ResourceBundle;

import Ex07.ElevatorEx0.Service.CommonService;
import Ex07.ElevatorEx0.Service.CommonServiceImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	private Parent form;
	private CommonService comserv;
	public void setForm(Parent form) {
		this.form = form;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		comserv = new CommonServiceImpl();
	}
	
	public void CreateBtn(){
		TextField txtFld =  (TextField)form.lookup("#inputTxtFld");
		//입력창에 넣은 값 저장
		String txt = txtFld.getText();
		TextField txtFldout = (TextField)form.lookup("#outputTxtFld");
		int txt2 = Integer.parseInt(txt)*10;
		txtFldout.setText(Integer.toString(txt2));
		System.out.println(Integer.parseInt(txt)*10);
	}
}
