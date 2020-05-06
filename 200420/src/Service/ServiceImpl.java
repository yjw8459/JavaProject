package Service;

import java.io.IOException;

import SQLite.Controller;
import SQLite.DBEx01;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ServiceImpl implements Service{

	@Override
	public void showWindow(Stage s, String formPath) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(formPath));
		Parent root = null;
		try {
			root = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBEx01 ctrler = loader.getController();
		ctrler.setRoot(root);
		s.setTitle("Sign up");
		s.setScene(new Scene(root));
		s.show();
		
		
	}

}
