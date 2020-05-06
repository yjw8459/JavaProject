package Ex06.Service;

import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginServiceImpl implements LoginService{
	@Override
	public void LoginProc(Parent root) {
		TextField idTxt = (TextField)root.lookup("#txtid");//idTxt
		//idTextField의 값을 받음 LoginForm을 받아서 lookup을 통해 
		TextField pwTxt = (TextField)root.lookup("#txtpw");//pwTxt
		System.out.println("ID "+idTxt.getText()+
				", PW "+pwTxt.getText()+
				"을 입력했습니다");	
	}
		@Override
	public void OpenMembershipForm() { //회원가입 버튼을 누를 시
			//MembershipForm으로 넘어감
		CommonService comServ = new CommonServiceImpl();
		//ShowWindow를 위한 com인터페이스와 구현체 생성
		Stage membershipForm = new Stage();
		//membershipForm에 새로운 스테이지 생성
		comServ.showWindow(membershipForm, "../Membership.fxml");
		//ShowWindow로 새로만든 스테이지와 String으로 MembershipForm 파일명을 전달
		/*
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../Membership.fxml"));
		try {
			membershipForm.setScene(new Scene(loader.load()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		membershipForm.show();
		*/
	}
	
	
	
	
	
}








