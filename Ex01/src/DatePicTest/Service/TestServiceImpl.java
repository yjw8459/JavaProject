package DatePicTest.Service;

import java.io.IOException;

import DatePicTest.Controller;
import DatePicTest.Phone;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class TestServiceImpl implements TestService {

	@Override
	public void getDatePckr(Parent form) {
		// TODO Auto-generated method stub
		DatePicker datePckr = (DatePicker)form.lookup("#datePckr");
		TextField datePckrTxtFld = (TextField)form.lookup("#datePckrTxtFld");
		String date = datePckr.getValue().toString();
		datePckrTxtFld.setText(date);
	}

	@Override
	public String getTableView(Parent form) {
		TableView<Phone> tblView = (TableView<Phone>)form.lookup("#tableView");
		
		Phone phone = tblView.getSelectionModel().getSelectedItem();
		return phone.getSmartPhone();
	}

	@Override
	public void openWindow(Parent form) {
		Stage membershipStage = new Stage();
		
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("../tableView.fxml"));
		
		Parent membershipForm = null;
		try {
			membershipForm = loader.load();
			membershipStage.setScene(new Scene(membershipForm));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Controller ctrler = loader.getController();
		ctrler.setForm(membershipForm);
		
		membershipStage.showAndWait();
		//membershipStage.show();
		
		TextField popupTxtFld = (TextField)form.lookup("#popupTxtFld");
		popupTxtFld.setText(ctrler.getTableViewData());
	}

}
