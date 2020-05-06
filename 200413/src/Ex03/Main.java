package Ex03;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Membership.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		
		Controller ctrler = loader.getController();
		ctrler.setRoot(root);
		
		primaryStage.setTitle("Ex03");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
public static void main(String[] args) {
	launch(args);
}
}
