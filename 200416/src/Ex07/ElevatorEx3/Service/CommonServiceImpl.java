package Ex07.ElevatorEx3.Service;

import java.io.IOException;



import Ex07.ElevatorEx3.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CommonServiceImpl implements ICommonService {
	//새로운 Form생성 및 닫기관련 인터페이스

	@Override
	public void showWindow(Stage s, String formPath, String title) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(formPath));
		Parent root=null;
		try {
			root = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		//Controller ctrler = loader.getController();
		//ctrler.setForm(root);
		
		s.setTitle(title);
		s.setScene(scene);
		s.show();
	}

	@Override
	public void showWindow(Stage s, String formPath) {
		showWindow(s, formPath, "");
	}

}
