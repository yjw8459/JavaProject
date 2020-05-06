package DatePicTest;

import java.net.URL;
import java.util.ResourceBundle;

import DatePicTest.Service.TestService;
import DatePicTest.Service.TestServiceImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class Controller implements Initializable{
	private Parent form;
	private TestService testServ;
	String tableViewData;
	public String getTableViewData(){
		return tableViewData;
	}
	public void btnClick(){
		tableViewData = testServ.getTableView(form);
	
		Stage stage = (Stage)form.getScene().getWindow();
		stage.close();
	}
	public void setForm(Parent form) {
		this.form = form;
	}
	public void getDatePckr(){
		testServ.getDatePckr(form);
	}
	public void openWindow(){
		testServ.openWindow(form);
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		testServ = new TestServiceImpl();
	}
}
