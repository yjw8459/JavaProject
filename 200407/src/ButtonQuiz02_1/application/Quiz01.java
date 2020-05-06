package application;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz01 extends Application{

	   public static void main(String[] args) {
	      // TODO Auto-generated method stub   
	      launch(args);
	   }

	   @Override
	   public void start(Stage primaryStage) throws Exception {
	      // TODO Auto-generated method stub
		   Component com = new Component();
		   Container con = new Container();
		   Event event = new Event(com);
		   VBox vbox = con.getVBox(10);
		   HBox hbox = con.getHbox(10, 10);
		   List<Button> lstBtn = new ArrayList<Button>();
		   	       
		   lstBtn.add( com.getButton("id", 120, 40) ); 
		   lstBtn.add( com.getButton("pw", 120, 40) );
		   lstBtn.add( com.getButton("Login", 60, 90) );

	       event.setOnAction(lstBtn.get(2));
	      
	       for(int i=0;i<2;i++)
	    	   vbox.getChildren().add(lstBtn.get(i));
	      
	      hbox.getChildren().add(vbox);
	      hbox.getChildren().add(lstBtn.get(2));
	      primaryStage.setScene(new Scene(hbox));
	      primaryStage.show();
	   }

	}