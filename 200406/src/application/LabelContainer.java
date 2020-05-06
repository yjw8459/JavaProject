package application;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class LabelContainer {
	public HBox getHBox(int spacing) {
		return new HBox(spacing);
	}
	public HBox getHBox(int top, int width, int height, Label lbl) {
		HBox hbox = new HBox(); 
		hbox.setPadding(new Insets(top, 0, 0, 0));
		hbox.setPrefSize(width, height);
		hbox.getChildren().add(lbl);
		
		return hbox;
	}
	
}




