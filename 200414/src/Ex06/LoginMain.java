package Ex06;

import java.io.IOException;

import Ex06.Service.CommonService;
import Ex06.Service.CommonServiceImpl;
import javafx.application.Application;
import javafx.stage.Stage;

public class LoginMain extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {	
		CommonService comServ = new CommonServiceImpl();
		comServ.showWindow(primaryStage, "../Login.fxml");	//Stage와 String으로 인자 날려줌
	}

	public static void main(String[] args) {
		launch(args);
	}
}