package application;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TableViewEx01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane ap = new AnchorPane();
		
		TableView<Person> table = new TableView<Person>();
		
		TableColumn<Person, String> firstNameCol = new TableColumn<Person, String>("FirstName");
		firstNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
		TableColumn<Person, String> lastNameCol = new TableColumn<Person, String>("LastName");
		lastNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
		
		table.getColumns().setAll(firstNameCol, lastNameCol);
		
		ObservableList<Person> phoneLst = FXCollections.observableArrayList(
				new Person(new SimpleStringProperty("cho"),new SimpleStringProperty("Younki")),
				new Person(new SimpleStringProperty("cho"),new SimpleStringProperty("Younki"))
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











