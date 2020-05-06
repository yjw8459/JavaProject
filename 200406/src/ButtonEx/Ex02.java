package ButtonEx;



import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex02 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
	Button btn = new Button();
	
	Label lbl = new Label("values");
	lbl.setFont(new Font("Cambria", 32));
	
	btn.setId("test");
	btn.setOnAction(e->{
		lbl.textProperty().bind(
		new SimpleStringProperty(btn.getId())
		);
	});
	}
public static void main(String[] args) {
	launch(args);
}
}
