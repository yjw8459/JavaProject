package application;

import javafx.scene.control.Label;

public class LabelEvent {
	public void setLabelEvent(Label lbl, double scaleUp) {
		lbl.setOnMouseEntered(e->{
			lbl.setScaleX(scaleUp);
			lbl.setScaleY(scaleUp);
		});
		lbl.setOnMouseExited(e->{
			lbl.setScaleX(1);
			lbl.setScaleY(1);
		});
	}
}
