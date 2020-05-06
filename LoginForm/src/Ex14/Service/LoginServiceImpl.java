package Ex14.Service;
//풀스택 프론트엔드 백엔드 
// 스프링 자바스크립트 == MVC  db java 
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginServiceImpl implements LoginService{
	@Override
	public void LoginProc(Parent root) {
		TextField idTxt = (TextField)root.lookup("#txtid");//idTxt
		TextField pwTxt = (TextField)root.lookup("#txtpw");//pwTxt
		System.out.println("ID "+idTxt.getText()+
				", PW "+pwTxt.getText()+
				"�� �ԷµǾ����ϴ�.");	
		//자바, SQL, C, And, im, cad, rasberry, iot 
	}
		@Override
	public Parent OpenMembershipForm() {
		CommonService comServ = new CommonServiceImpl();
		Stage membershipForm = new Stage();
		Parent form =  comServ.showWindow(membershipForm, "../Membership.fxml");
		
		return form;
		}
}








