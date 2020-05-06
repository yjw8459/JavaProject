package application;

import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Container {
	public HBox getHbox(int spacing, int padding) {
		 HBox hbox = new HBox(spacing);
		 hbox.setPadding(new Insets(padding));
		 //hbox.setSpacing(10);  
		 
		 return hbox;
	}
	public VBox getVBox(int spacing) {
		 //VBox vbox = new VBox(spacing);
		 //return vbox;
		 return new VBox(spacing);
	}
}






