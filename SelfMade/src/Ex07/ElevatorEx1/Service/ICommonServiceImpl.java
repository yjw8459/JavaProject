package Ex07.ElevatorEx1.Service;

import java.io.IOException;

import Ex07.ElevatorEx0.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//클래스 만드는 창에서 Interface 추가 가능
public class ICommonServiceImpl implements ICommonService{

	@Override
	public void showWindow(Stage s, String formPath, String title) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(formPath));
		Parent root=null;//null로 초기화 이유는 비어있어서 에러가 나오기 때문에

		try {
			root = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		//Controller ctrler = loader.getController();
		//ctrler.setForm(root); 이번 작업에선 쓰지않음
		
		s.setTitle(title);
		s.setScene(scene);
		s.show();
		
	}

	@Override
	public void showWindow(Stage s, String formPath) {
		showWindow(s, formPath, "");// 오버라이딩으로 상위 메소드에 Title은 빈 값 넣어줌
		
	}

}
