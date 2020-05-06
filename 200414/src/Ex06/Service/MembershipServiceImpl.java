package Ex06.Service;


import java.util.ArrayList;
import java.util.List;

import Ex06.Member;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class MembershipServiceImpl implements MembershipService {
	final int NAME = 0;
	final int ID = 1;
	final int PW = 2;
	@Override
	public Member getMember(Parent membershipForm) {
		String[] txtIdArr = {"#txtName","#txtID","#txtPW"};
		Member member = new Member();
		List<TextField> lstTxtField = new ArrayList<TextField>();
		
		for(int i = 0; i<txtIdArr.length;i++)
			lstTxtField.add((TextField)membershipForm.lookup(txtIdArr[i]));
		
		/*
		 * TextField nameTxt = (TextField)membershipForm.lookup("#txtName"); //패스워드 필드는
		 * 텍스트 필드를 상속하기 떄문에 텍스트필드로 사용해도 무관 TextField pwTxt =
		 * (TextField)membershipForm.lookup("#txtPW");
		 */
		member.setName(lstTxtField.get(NAME).getText());
		member.setId(lstTxtField.get(ID).getText());
		member.setPw(lstTxtField.get(PW).getText());
		
		return member;
		
	}
	
}
