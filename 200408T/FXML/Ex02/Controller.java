package FXML.Ex02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	@FXML private TextField inputTxtField;
	@FXML private TextField outputTxtField;
	@FXML private Button okBtn;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		okBtn.setOnAction(e->{
			handleBtnAction(e);
		});		
	}
	private void handleBtnAction(ActionEvent e) {
		outputTxtField.setText(inputTxtField.getText());
	}
}






