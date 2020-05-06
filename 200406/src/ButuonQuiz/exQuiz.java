package ButuonQuiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class exQuiz extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox hBox = new HBox();
		VBox vBox = new VBox();
		Image image = new Image(
				getClass().getResourceAsStream("/img/L2Char.png"));
		Characters jobs = new Characters();
		Btn btn = new Btn();		
		Button warbtn = btn.getBtn("", jobs.getWar(),80,80);//최소 값 80
		Button rogbtn = btn.getBtn("", jobs.getRogue(),80,80);
		Button magibtn = btn.getBtn("", jobs.getMagi(),80,80);
		//Btn rogbtn = new Btn();//반환 하는게Button클래스이기 때문에 Button으로 받아야함
		//rogbtn.getBtn("", jobs.getRogue());//담아줘야함
		
		
		
		//Button rogbtn = new Button("",jobs.getRogue());
		//Button magibtn = new Button("",jobs.getMagi());
		hBox.getChildren().addAll(warbtn,rogbtn,magibtn);
		hBox.setPrefSize(30, 30);
		hBox.setLayoutX(20);
		hBox.setLayoutY(50);
		hBox.setPadding(new Insets(0,0,0,0));// 간격
		//hBox.getChildren().addAll(btn.getBtn("", jobs.getWar()));
		
		
		Label lbl = new Label("",new ImageView(image));
		Pane pane = new Pane();
		
		pane.getChildren().addAll(lbl,hBox);
		primaryStage.setScene(new Scene(pane));
		primaryStage.setTitle("RPG");
		primaryStage.show();
		
	}
public static void main(String[] args) {
	launch(args);
}
}
