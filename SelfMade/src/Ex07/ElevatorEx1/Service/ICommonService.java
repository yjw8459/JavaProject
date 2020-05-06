package Ex07.ElevatorEx1.Service;

import javafx.stage.Stage;

public interface ICommonService {
	public void showWindow(Stage s, String formPath, String title);
	//스테이지와 fxml경로, Title
	public void showWindow(Stage s, String formPath);
	//Title이 없는
}
