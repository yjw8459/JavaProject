package application;

import java.util.ArrayList;

import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/*
 * 그룹화 중요
*/

public class Quiz extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		LabelEvent lblEvent = new LabelEvent(); //이벤트 클래스
		LabelComponent lblCom = new LabelComponent();//라벨 각각의 디자인
		List<Label> lstLabel = new ArrayList<Label>();//라벨들을 묶음
		LabelContainer lblContainer = new LabelContainer();//묶은 라벨들을 묶음
		List<HBox> lstHBox = new ArrayList<HBox>();
		lstHBox.add( lblContainer.getHBox(10) );
		
		
		lstLabel.add( lblCom.getLabel("Search", "/img/search.png", "Arial", 25, "#0076a3")); 
		lstLabel.add( lblCom.getLabel("values", "Arial", 35, 270, 60) );
		lstLabel.add( lblCom.getLabel("A label that needs to be wrapped", true) );
		
		lstHBox.add( lblContainer.getHBox(40, 100, 100, lstLabel.get(2)) ); 
		
		/*
		for(Label lbl : lstLabel) {
			lblEvent.setLabelEvent(lbl, 1.5);
			hbox.getChildren().add(lbl);
		}
		*/
		for(int i=0;i<lstLabel.size()-1;i++) {
			lblEvent.setLabelEvent(lstLabel.get(i), 1.5);
			lstHBox.get(0).getChildren().add(lstLabel.get(i));
		}
		lblEvent.setLabelEvent(lstLabel.get(2), 1.5);
		lstHBox.get(0).getChildren().add(lstHBox.get(1));
		
		
		primaryStage.setScene(new Scene(lstHBox.get(0), 400, 170));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}









