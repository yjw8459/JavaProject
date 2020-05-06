package ButtonQuiz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

   public static void main(String[] args) {
      // TODO Auto-generated method stub   
      launch(args);
   }

   @Override
   public void start(Stage primaryStage) throws Exception {
      // TODO Auto-generated method stub
	   Containor containor = new Containor();
	  Component com = new Component();
	  //Event event = new Event(com);
	   HBox hbox = containor.size(10);
	   VBox vbox = containor.size();
	   
	   //List<Button> lstBtn = new ArrayList<Button>();
	  
     Button idBtn, pwBtn, loginBtn;
      Btn btn = new Btn();
        idBtn = btn.size("id", 120, 40);
        pwBtn= btn.size("pw", 120, 40);
        loginBtn= btn.effectSize("Login",60,90);
		/* 리스트로 표현
		 * lstBtn.add( btn.size("id", 120, 40)); lstBtn.add( btn.size("pw", 120, 40));
		 * lstBtn.add( btn.effectSize("Login",60,90));
		 */
        //event.setOnAction(loginBtn); 이벤트 클래스로도 표현 가능
        loginBtn.setOnAction(e->{
        	Alert alert = com.getAlert(
        			AlertType.INFORMATION,"경고","로그인 시도","아직은"
        					+ "로그인 할 수 없습니다.");
        			alert.show();
        });
      vbox.getChildren().add(idBtn);
      vbox.getChildren().add(pwBtn);
      hbox.getChildren().add(vbox);
      hbox.getChildren().add(loginBtn);
      primaryStage.setScene(new Scene(hbox));
      primaryStage.show();
   }

}