package Ex11.Service;

import java.util.List;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;

public class MembershipServiceImpl implements MembershipService {
	@Override
	public boolean comparePW(String pw, String pwOk) {
		/*
		 * if(!pw.contentEquals(pwOk))//Password 두개가 일치하지 않다면 return true;
		 */
		return pw.contentEquals(pwOk);
	}

	@Override
	public void AddComboBox(Parent form, List<String> items) {
		ComboBox<String> cmbAge = (ComboBox<String>)form.lookup("#cmbAge");
		//cmbAge는 fxml의 콤보박스 id와 동일 //콤보박스로 형변환
		if(cmbAge!=null) {
			for(String item : items)
				cmbAge.getItems().add(item);
		}
	}

	@Override
	public boolean isComboBox(Parent membershipForm) {
		ComboBox<String> cmbAge = (ComboBox<String>)membershipForm.lookup("#cmbAge");
		//cmbAge는 fxml의 콤보박스 id와 동일 //콤보박스로 형변환
		if(cmbAge!=null) return false;
		else if(cmbAge.getValue()==null) {//사용하지 않았다면 value는 null임
			cmbAge.requestFocus();
		return false;
		}
		return true;
	}

	@Override
	public String getComboBoxString(Parent membershipForm) {
		ComboBox<String> cmbAge = (ComboBox<String>)membershipForm.lookup("#cmbAge");
		//cmbAge는 fxml의 콤보박스 id와 동일 //콤보박스로 형변환
		if(cmbAge!=null) return "";
		return cmbAge.getValue().toString();
	}
}
