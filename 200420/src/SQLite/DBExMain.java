package SQLite;

import Service.Service;
import Service.ServiceImpl;
import javafx.application.Application;
import javafx.stage.Stage;

public class DBExMain extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		Service serv = new ServiceImpl();
		serv.showWindow(primaryStage, "Login.fxml");
		
	}
	
	public static void main(String[] args) {
		System.out.println("ddd");
	}
}
