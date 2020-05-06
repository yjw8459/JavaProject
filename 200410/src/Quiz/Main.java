package Quiz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*주제 : 극장
내용 : 로그인 및 회원가입
화면구성
코드
*/
public class Main extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
	Parent root = FXMLLoader.load(getClass().getResource());
	
	primaryStage.setScene(new Scene(root));
	primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

}
