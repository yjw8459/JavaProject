package ButtonQuiz;

import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Containor {
	public HBox size(int n) {
		HBox hbox = new HBox(n);
		  hbox.setPadding(new Insets(n));
	        hbox.setSpacing(n);  //첫째 줄 선언부에 괄호안에 넣어주어도 됌    
		
		return hbox;
	}
	public VBox size() {
		
		
		return new VBox();
	}

}
