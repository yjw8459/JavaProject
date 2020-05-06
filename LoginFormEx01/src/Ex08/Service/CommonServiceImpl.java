package Ex08.Service;

import java.io.IOException;
import java.util.Map;

import Ex06.Controller;
import Ex08.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CommonServiceImpl implements CommonService{
	@Override
	public void WindowClose(ActionEvent event) {
		Parent root = (Parent)event.getSource();
		Stage stage = (Stage) root.getScene().getWindow();
		stage.close();
	}

	@Override
	public void showWindow(Stage s, String formPath) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(formPath));
		Parent root = null;
		try {
			root = loader.load();
			s.setScene(new Scene(root));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Controller ctrler = loader.getController();
		ctrler.setRoot(root);
		
		s.show();
	}
	public void MembershipProc() {
		String []txtFldIdArr = {"#txtid", "#txtpw"};
		Map<String, TextField> txtFldMap = 
				membershipServ.getTextFieldInfo(root, txtFldIdArr);
		if(membershipServ.isEmpty(txtFldMap, txtFldIdArr)) {
			System.out.println("��� �־��");
			return ;
		}
		String pw = txtFldMap.get(txtFldIdArr[2]).getText();
		String pwOk = txtFldMap.get(txtFldIdArr[3]).getText();
		if(!membershipServ.comparePW(pw, pwOk)) {
			System.out.println("�н����尡 �ٸ��ϴ�.");
			return;
		}
				
		Member member = new Member();
		
		System.out.println(member.getName());
		System.out.println(member.getId());
		System.out.println(member.getPw());
	}
}
