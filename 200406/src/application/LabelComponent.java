package application;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class LabelComponent {
	public Label getLabel(String txt, String img, String font, int fontSize, String color) {
		Label lbl = new Label(txt, new ImageView(img));
		
		lbl.setFont(new Font(font, fontSize));
		lbl.setTextFill(Color.web(color));
		
		return lbl;
	}
	public Label getLabel(String txt, String font, int fontSize, int rotate, int translateY) {
		Label lbl = new Label(txt);
		lbl.setFont(new Font(font, fontSize));
		lbl.setRotate(rotate);
		lbl.setTranslateY(translateY);
		
		return lbl;
	}
	public Label getLabel(String txt, boolean isWrapTxt) {
		Label lbl = new Label(txt);
		lbl.setWrapText(isWrapTxt);
		
		return lbl;
	}
	
}









