package SQLProject;

import SQLProject.Service.Service;
import SQLProject.Service.ServiceImpl;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		Service serv = new ServiceImpl();
		serv.showWindow(primaryStage, "../Login.fxml");
		
	}

	public static void main(String[] args) {
		System.out.println("dddd");
		launch(args);
	}
}
