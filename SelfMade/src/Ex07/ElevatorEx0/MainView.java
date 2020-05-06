package Ex07.ElevatorEx0;

import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainView extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("CreatrElevatorForm.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		Controller ctrler = loader.getController();
		ctrler.setForm(root);
		
		primaryStage.setTitle("Elevator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
