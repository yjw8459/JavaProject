package Ex14.Service;

import java.util.List;

import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;

public class MembershipServiceImpl implements MembershipService {
	@Override
	public boolean comparePW(String pw, String pwOk) {
		/*
		 * if(!pw.contentEquals(pwOk)) return true; return false;
		 */
		return pw.contentEquals(pwOk);
	}

	@Override
	public void AddComboBox(Parent form, List<String> items) 
	//새로 생성된 Stage와 ComboBox를 초기화하는데 쓰일 배열을 전달받음
	{
		ComboBox<String> 	cmbAge = (ComboBox<String>)form.lookup("#cmbAge");
		//ComboBox의 항목은 String이며 콤보박스의 값을 반환받아서 cmbAge에 저장
		
		if(cmbAge!=null) {//cmbAge의 값이 null이 아니라면(사용하지 않았다면 null임)
			
			for(String item : items)
				cmbAge.getItems().add(item);//?
			//cmbAge의 항목을 반환받아서 String형 item을 더해라?
			
		}
	}

	@Override
	public boolean isComboBox(Parent membershipForm) {
		ComboBox<String> 	cmbAge = (ComboBox<String>)membershipForm.lookup("#cmbAge");
		//콤보박스의 값을 반환받음
		if(cmbAge==null) return false;//콤보박스가 사용되지 않았다면? 비었다면? false를 반환
		else if(cmbAge.getValue()==null) {//cmbAge의 value가 null이라면
			cmbAge.requestFocus();//cmbAge에 포커스
			return false;//false를 반환
		}
		return true;//해당사항 없다면 true를 반환
	}

	@Override
	public String getComboBoxString(Parent membershipForm) {
		ComboBox<String> 	cmbAge = (ComboBox<String>)membershipForm.lookup("#cmbAge");
		//ComboBox의 값을 반환받음
		if(cmbAge==null) return "";//콤보박스가 사용되지 않았다면 빈값 반환
		return cmbAge.getValue().toString();//아니라면 콤보박스의 value를 스트링형으로 반환
	}

	@Override
	public boolean getGender(Parent membershipForm) {
		//성별은 두가지 중 하나이기 때문에 boolean도 괜찮음
		final boolean MAN = true; // 고정값 남자는 true
		final boolean WOMAN = false; //여자는 false
		RadioButton rdoMan = (RadioButton)membershipForm.lookup("#rdoMan");
		//라디오버튼의 값을 받음
		if(rdoMan.isSelected())	return MAN;//라디오버튼 Man이 선택됐다면 MAN(true반환)
		return WOMAN;//아니라면 WOMAN(false) 반환
		//return rdoMan.isSelected();
	}

	@Override
	public int GetHobby(Parent membershipForm) {
		int hobby = 0;
		//비트 수로 더하면 분류할 필요없이 분류가능
		if(((CheckBox)membershipForm.lookup("#chkMusic")).isSelected())	hobby+=1;
		if(((CheckBox)membershipForm.lookup("#chkSport")).isSelected())	hobby+=2;
		if(((CheckBox)membershipForm.lookup("#chkMovie")).isSelected())	hobby+=4;
		//선택돼있다면 비트 수로 분류
		return hobby;
	}

}











