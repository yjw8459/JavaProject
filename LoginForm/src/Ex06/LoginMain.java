package Ex06;

import java.io.IOException;

import Ex06.Service.CommonService;
import Ex06.Service.CommonServiceImpl;
import javafx.application.Application;
import javafx.stage.Stage;

public class LoginMain extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {	
		CommonService comServ = new CommonServiceImpl();//com 인터페이스로 구현체 접근
		comServ.showWindow(primaryStage, "../Login.fxml");	
		//com 인터페이스 구현체 showWindow에 스테이지와 String으로 fxml을 넘겨줌
	}

	public static void main(String[] args) {
		launch(args);
	}
}
