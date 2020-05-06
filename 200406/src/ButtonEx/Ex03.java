package ButtonEx;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Ex03 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
	Button btnid = new Button("id");
	btnid.setLayoutX(90);
	btnid.setLayoutY(90);
	btnid.setPrefSize(120, 50);
	
	Button btnpw = new Button("pw");
	btnpw.setLayoutX(90);
	btnpw.setLayoutY(160);
	btnpw.setPrefSize(120, 50);
	Button btnLogin = new Button("Login");
	btnLogin.setLayoutX(240);
	btnLogin.setLayoutY(90);
	btnLogin.setPrefSize(60, 120);
	pane.getChildren().addAll(btnid,btnpw,btnLogin);
	btnid.setOnAction(e->{
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("경고");
		alert.setHeaderText("로그인 시도");
		alert.setContentText("아직은 로그인 할 수 없습니다.");
		alert.show();
	});
	primaryStage.setScene(new Scene(pane));
	primaryStage.setTitle("");
	primaryStage.show();
	
	}
public static void main(String[] args) {
	launch(args);
}
}
