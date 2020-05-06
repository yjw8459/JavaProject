package ButuonQuiz;

import javax.swing.Box;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Characters {
	public ImageView getRogue() {
		Image image = new Image(
				getClass().getResourceAsStream(
						"/img/Rogue.png"));
		return new ImageView(image);
		
	}
	public ImageView getWar() {
		Image image = new Image(
				getClass().getResourceAsStream(
						"/img/warrior.png"));
		return new ImageView(image);
		
	}
	public ImageView getMagi() {
		Image image = new Image(
				getClass().getResourceAsStream(
						"/img/magi.png"));
		return new ImageView(image);
		
	}

}
