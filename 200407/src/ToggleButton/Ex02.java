package ToggleButton;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex02 extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
	HBox hbox = new HBox();
	VBox vbox = new VBox();
	
	final ToggleGroup group = new ToggleGroup();//토글 그룹
	
	ToggleButton tb1 = new ToggleButton("Miror");
	tb1.setToggleGroup(group);
	tb1.setSelected(true);
	ToggleButton tb2 = new ToggleButton("Major");
	tb2.setToggleGroup(group);
	ToggleButton tb3 = new ToggleButton("Critical");
	tb3.setToggleGroup(group);
	
	tb1.setUserData(Color.LIGHTBLUE);
	tb2.setUserData(Color.SALMON);
	tb3.setUserData(Color.LIGHTGREEN);
	
	final Rectangle rect = new Rectangle(155,50,Color.LIGHTGREEN);
	
	group.selectedToggleProperty().addListener(
			new ChangeListener<Toggle>() { 	//토글 버튼이 눌렸을 때 동작
				public void changed(ObservableValue<? extends Toggle> observable, 
						Toggle oldValue, Toggle newValue) {
					if(newValue == null) //토글버튼의 변화가 없다면
						rect.setFill(Color.WHITE);
					else //눌렀을 때 UserData에 있는 색을 불러옴
					rect.setFill((Color) group.getSelectedToggle().getUserData());
				};
			});
	tb1.setStyle("-fx-base : lightgreen"); //버튼 색깔
	tb2.setStyle("-fx-base : lightblue");
	tb3.setStyle("-fx-base : lightsalmon");
	hbox.getChildren().addAll(tb1,tb2,tb3);
	//hbox.setPrefSize(300, 200);
	
	vbox.getChildren().addAll(hbox, rect);
	
	primaryStage.setTitle("Ex01");
	primaryStage.setScene(new Scene(vbox,200,200));
	primaryStage.show();
	}
public static void main(String[] args) {
	launch(args);
}
}
