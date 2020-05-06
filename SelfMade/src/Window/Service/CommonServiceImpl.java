package Window.Service;

import java.io.IOException;



import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CommonServiceImpl implements ICommonService{
	//InterFace 연결 잘 할것!
	
	@Override
	public void showWindow(Stage s,String Form) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(Form));
		Parent root = null;
		
		try {
			root = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		s.setTitle("Elevator");
		s.setScene(scene);
		s.show();
		

	}

	/*
	 * @Override public void windowClose(ActionEvent e) { Parent root =
	 * (Parent)e.getSource(); Stage stage = (Stage)root.getScene().getWindow();
	 * stage.close();
	 * 
	 * }
	 */
	

}
