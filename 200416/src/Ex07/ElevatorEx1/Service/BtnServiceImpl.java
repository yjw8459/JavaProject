package Ex07.ElevatorEx1.Service;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class BtnServiceImpl implements IBtnService {

	@Override
	public String getTextField(ActionEvent e, String id) {
		//발생된 이벤트는 버튼이 클릭 되었을 경우 이므로
				//getSource를 통해 얻어오는 event는 button이다
		Parent root = (Parent)e.getSource();//형변환의 이유는 가져오는 무언가를 같은 형태로 맞춰주기 위해
		System.out.println(root);
		//TextField txtFld =  (TextField)form.lookup("#inputTxtFld");
		//System.out.println(txtFld.getText());
		return null;
	}

	@Override
	public void setTextField(ActionEvent e, String id, String txt) {
		// TODO Auto-generated method stub

	}

}
