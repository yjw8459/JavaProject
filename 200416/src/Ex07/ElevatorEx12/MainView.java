package Ex07.ElevatorEx12;

/*ICommonService = 새 Form을 열고 닫는 윈도우 관련 인터페이스
IProcessButtonService = 데이터 저장 및 반환하는 데이터관련 인터페이스
IButtonService = 버튼 생성 및 액션 관리 인터페이스*/



import java.io.IOException;


import Ex07.ElevatorEx12.Service.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainView extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		ICommonService comServ = new CommonServiceImpl();
		comServ.showWindow(primaryStage, "../CreatrElevatorForm.fxml", "Elevator");
		/*
		FXMLLoader loader = new FXMLLoader(getClass().getResource("CreatrElevatorForm.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		Controller ctrler = loader.getController();
		ctrler.setForm(root);
		
		primaryStage.setTitle("Elevator");
		primaryStage.setScene(scene);
		primaryStage.show();
		*/
	}

	public static void main(String[] args) {
		launch(args);
	}
}
