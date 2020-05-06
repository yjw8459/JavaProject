package Ex07.ElevatorEx0.Service;

import java.io.IOException;

import Ex07.ElevatorEx0.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CommonServiceImpl implements CommonService{

	public void ShowWindow(Stage s,String form) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(form));
		Parent root= null;
		try {
			root = loader.load();
			s.setScene(new Scene(root));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Controller ctrler = loader.getController();
		ctrler.setForm(root);
		s.show();
		
		
	}
}
