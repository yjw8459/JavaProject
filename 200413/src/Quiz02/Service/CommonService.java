package Quiz02.Service;

import javafx.event.ActionEvent;
import javafx.stage.Stage;

public interface CommonService {
	public void WindowClose(ActionEvent event);
	public void showwindow(Stage s, String formPath);//하나는 경로 하나는 stage값
	
}
