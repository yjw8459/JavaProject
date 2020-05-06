package Ex14;

import javafx.scene.Parent;
//abstract = 인터페이스와 연결되어 상속받지 못하는 클래스에 상속할 수 있음
public abstract class Controller {//메인에서 showwindow를 거쳐 컨트롤러에 오고 abstract하는 
	//LoginController와 MembershipController가 Parent root를 전달받는다
	public abstract void setRoot(Parent root);
}
