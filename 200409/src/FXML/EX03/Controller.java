package FXML.EX03;

import java.net.URL;
import java.util.ResourceBundle;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller implements Initializable{
	@FXML private Label lbl;
	@FXML private Button btn1;
	@FXML private Button btn2;
@Override
public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub
	btn2.setOnAction(e->Button1Disable(e));
	
}
private void Button1Disable(ActionEvent e) {
	lbl.setText("Button2 Disable");
	btn1.setDisable(false);
	btn2.setDisable(true);
	
}
}
