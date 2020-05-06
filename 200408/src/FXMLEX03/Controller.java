package FXMLEX03;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Controller implements Initializable{
	private Button btn;
	private TextField txtField1;
	private TextField txtField2;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		btn.setOnAction(e->handleBtnAction(e));
		
	}
	public void handleBtnAction(ActionEvent event) {
		System.out.println(txtField1.getText());
	}

	}
