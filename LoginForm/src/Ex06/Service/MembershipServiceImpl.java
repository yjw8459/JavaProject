package Ex06.Service;

import java.util.ArrayList;

import java.util.List;

import Ex06.Member;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class MembershipServiceImpl implements MembershipService {//인터페이스 멤버십서비스의 구현체
	final int NAME = 0; //리스트의 자리값을 위한 고정변수
	final int ID = 1;
	final int PW = 2;
	
	private Member getMember(Parent membershipForm) {
		//Controller에서 보내준 MembershipForm을 MemberProc을 거쳐서 전달받음
		String [] txtIdArr = {"#txtName", "#txtID", "#txtPw"};
		//String 배열에 MembershipForm TextField 이름, 아이디, 패스워드 저장
		Member member = new Member(); //멤버 클래스 생성
		List<TextField> lstTxtField = new ArrayList<TextField>(); 
		//TextField를 담을 ArrayList생성
		
		for(int i=0;i<txtIdArr.length;i++)//String배열 길이만큼 반복
			lstTxtField.add((TextField)membershipForm.lookup(txtIdArr[i]));
		//String형 배열을 TextField에 담아주기 때문에 (TextField)로 형변환
		//리스트에 이름, 아이디, 패스워드를 저장

		//0,1,2대신 고정변수를 사용함
		member.setName(lstTxtField.get(NAME).getText());//이름 텍스트필드 반환 후 세팅
		member.setId(lstTxtField.get(ID).getText());
		member.setPw(lstTxtField.get(PW).getText());
		
		return member;//멤버클래스에 저장 후 반환
	}
	@Override
	public void MembershipProc(Parent membershipForm) {
		//현재 Form을 받음 
		Member member = getMember(membershipForm);
		//Member클래스를 getMember를 통해 데이터 저장
		
		System.out.println(member.getName());//저장된 값을 보기위해
		System.out.println(member.getId());
		System.out.println(member.getPw());
	}
}
