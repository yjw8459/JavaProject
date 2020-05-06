package ButtonQuiz;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Component {

	
	   public Alert getAlert(Alert.AlertType alertType, String title, 
				String header, String content) {
	         Alert alert = new Alert(AlertType.INFORMATION);
	          alert.setTitle(title);
	          alert.setHeaderText(header);
	          alert.setContentText(content);
	          
	   return alert;

}
}
