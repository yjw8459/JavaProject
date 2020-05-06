package Window;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Controller implements Initializable{
	Parent root;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	public void CreateBtn() {
		Stage stage = new Stage();
		GridPane gridpane = new GridPane();
		ToggleButton tb1 = new ToggleButton("1층");
		ToggleButton tb2 = new ToggleButton("2층");
		gridpane.getChildren().addAll(tb1,tb2);
		stage.setScene(new Scene(gridpane));
		stage.show();
		
	}
	public void setForm(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
		
	}
	

}
