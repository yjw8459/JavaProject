import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SelfMade extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VBox vbox = new VBox();
	TextField tF = new TextField();
	PasswordField pF = new PasswordField();
	RadioButton rB = new RadioButton();
	CheckBox cB = new CheckBox();
	CheckBox cB2 = new CheckBox();
	ToggleButton tB = new ToggleButton();
	
	pF.setPromptText("Password Input");
	cB.setStyle("-fx-base : darkred");//체크박스 색 변경
	tB.setStyle("-fx-base : beige"); //토글박스 색 변경
	vbox.getChildren().addAll(tF,pF,rB,cB,cB2,tB);
	
	primaryStage.setTitle("Ex01");
	primaryStage.setScene(new Scene(vbox,500,500));
	primaryStage.show();
	
	
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}