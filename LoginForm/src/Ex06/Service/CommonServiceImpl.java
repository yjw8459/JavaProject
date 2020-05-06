package Ex06.Service;

import java.io.IOException;

import Ex06.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CommonServiceImpl implements CommonService{
	@Override
	public void WindowClose(ActionEvent event) {//현재 윈도우를 닫는 작업 수행
		//event를 받는 이유?
		Parent root = (Parent)event.getSource();//(Parent)형변환하고
		//event의 소스를 root에 담음 //형변환하는 이유?
		Stage stage = (Stage) root.getScene().getWindow();
		//새로운 stage 생성하고 root의 윈도우를 담음
		stage.close();//스테이지 닫음
	}

	@Override
	public void showWindow(Stage s, String formPath) {//Stage와 String으로 fxml파일명을 받음
		FXMLLoader loader = new FXMLLoader(getClass().getResource(formPath));
		//Login.fxml을 loader로 받음
		Parent root = null;//Parent root생성
		try {
			root = loader.load();//root에 loader의 LoginForm을 로드받음
			s.setScene(new Scene(root));
			//Start로부터 받은 스테이지 s의 신을 root(LoginForm)로 세팅
		} catch (IOException e) { //예외처리
			e.printStackTrace();
		}
		
		Controller ctrler = loader.getController();
		//Controller 클래스와 LoginForm 컨트롤러 연결
		ctrler.setRoot(root);
		//Controller의 root를 연결
		
		s.show();//스테이지를 보여줌
	}
}
