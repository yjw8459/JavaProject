package FXML.Ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	@FXML private Button btn;
	@FXML private TextField txtField;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		/*
		 * btn.setOnAction(new EventHandler<ActionEvent>() {
		 * 
		 * @Override public void handle(ActionEvent event) { handleBtnAction(event); }
		 * });
		 */
		btn.setOnAction(e->handleBtnAction(e));
	}
	public void handleBtnAction(ActionEvent event) {
		System.out.println(txtField.getText());
	}

}









