package ButtonQuiz02;

import javafx.scene.control.Button;

public class ImageButton {
	/*
	 * public ImageButton(String str, int width, int height) { Button btn = new
	 * Button(str); btn.setPrefWidth(width); btn.setPrefHeight(height); // TODO
	 * Auto-generated constructor stub
	 * 
	 * }
	 */
public Button Btn(String str, int width, int height) {
	
	Button btn = new Button(str);
	btn.setPrefWidth(width);
	btn.setPrefHeight(height);
	return btn;
	
}
}
