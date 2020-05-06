package TextArea;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TableViewEx extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		AnchorPane ap = new AnchorPane();		
		TableView<Person> table = new TableView<Person>();
		
		TableColumn<Person, String> firstNameCol = 
				new TableColumn<Person, String>("FirstName");
		firstNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
		TableColumn<Person, String> lastNameCol = 
				new TableColumn<Person, String>("LastName");
		firstNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
		
		table.getColumns().setAll(firstNameCol,lastNameCol);
		ObservableList<Person> phoneLst = FXCollections.observableArrayList(
				new Person(new SimpleStringProperty("yoo"),
						new SimpleStringProperty("jongwon")),
				new Person(new SimpleStringProperty("kim"), new SimpleStringProperty("chabin"))
				);
		
		table.setItems(phoneLst);
				
		
		ap.getChildren().add(table);		
		ap.setPrefSize(300, 200);
	
	primaryStage.setScene(new Scene(ap));
	primaryStage.show();
	}
public static void main(String[] args) {
	launch(args);
}
}
