package Ex07.ElevatorEx0;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	private Parent form;
	
	public void setForm(Parent form) {
		this.form = form;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	public void CreateBtn(){
		TextField txtFld =  (TextField)form.lookup("#inputTxtFld");
		System.out.println(txtFld.getText());
	}
}
