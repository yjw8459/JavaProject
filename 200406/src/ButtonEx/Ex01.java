package ButtonEx;









import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex01 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
	Pane canvas = new Pane();
	Button btn = new Button("test");
	btn.setPrefSize(120, 40);//버튼 크기 조정
	btn.setLayoutX(90);
	btn.setLayoutY(80);
	btn.setGraphic(new ImageView("/img/SmileReRe.png"));
	btn.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub
			Alert alert = new Alert(AlertType.CONFIRMATION);//CONFIRMATION = 아이콘 종류
			alert.setTitle("경고");
			alert.setHeaderText("버튼 이벤트");
			alert.setContentText("버튼을 클릭했습니다");
			alert.show();
			
		}
	});
	/*
	 * DropShadow shadow = new DropShadow();
	 * btn.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>()
	 * {
	 * 
	 * @Override public void handle(MouseEvent event) { // TODO Auto-generated
	 * method stub
	 * 
	 * } });
	 */
	btn.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
	
	
	
	canvas.getChildren().add(btn);
	canvas.setPrefSize(300,200);
	
	primaryStage.setTitle("Button");
	primaryStage.setScene(new Scene(canvas));
	primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
