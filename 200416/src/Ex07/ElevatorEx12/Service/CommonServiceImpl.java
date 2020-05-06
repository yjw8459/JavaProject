package Ex07.ElevatorEx12.Service;
//새 윈도우를 열고 닫는 윈도우 관련 인터페이스
import java.io.IOException;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CommonServiceImpl implements ICommonService {

	@Override
	public void showWindow(Stage s, String formPath, String title) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(formPath));
		//loader -> root - > Scene -> Stage
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
