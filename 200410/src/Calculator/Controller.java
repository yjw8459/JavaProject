package Calculator;

//string을 int로 바꾸는 함수  Integer.parseInt(String);

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller implements Initializable{
	@FXML private Button num1;
	@FXML private Button num2;
	@FXML private Button num3;
	@FXML private Button num4;
	@FXML private Button num5;
	@FXML private Button num6;
	@FXML private Button num7;
	@FXML private Button num8;
	@FXML private Button num9;
	@FXML private Button num0;
	@FXML private Button add;
	@FXML private Button sub;
	@FXML private Button mul;
	@FXML private Button div;
	@FXML private Button Clear;
	@FXML private Button total;
	@FXML private Label result;
	String txt;
	int Number1;
	int Number2;
	int index=0;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		num1.setOnAction(e->{
			Input(num1.getText());
			
		});
		num2.setOnAction(e->{
			Input(num2.getText());
		});
		num3.setOnAction(e->{
			Input(num3.getText());
		});
		num4.setOnAction(e->{
			Input(num4.getText());
		});
		num5.setOnAction(e->{
			Input(num5.getText());
		});
		num6.setOnAction(e->{
			Input(num6.getText());
		});
		num7.setOnAction(e->{
			Input(num7.getText());
		});
		num8.setOnAction(e->{
			Input(num8.getText());
		});
		num9.setOnAction(e->{
			Input(num9.getText());
		});
		num0.setOnAction(e->{
			Input(num0.getText());
		});
		add.setOnAction(e->{
			Number1 = Integer.parseInt(result.getText());
			
			Input(add.getText());
			Add();
			index+=1;
		});
		sub.setOnAction(e->{
			Number1 = Integer.parseInt(result.getText());
			
			Input(sub.getText());
			Add();
			index+=2;
		});
		mul.setOnAction(e->{
			Number1 = Integer.parseInt(result.getText());
			
			Input(mul.getText());
			Add();
			index+=3;
		});
		div.setOnAction(e->{
			Number1 = Integer.parseInt(result.getText());
			
			Input(div.getText());
			Add();
			index+=4;
		});
		Clear.setOnAction(e->{
			Clear();
		});
		total.setOnAction(e->{
			Number2 = Integer.parseInt(txt);
			
			if(index==1)
				result.setText(Integer.toString(Number1+Number2));  
			if(index==2)
				result.setText(Integer.toString(Number1-Number2));  
			if(index==3)
				result.setText(Integer.toString(Number1*Number2));  
			if(index==4)
				result.setText(Integer.toString(Number1/Number2));  
		});
		
		
		
	}
	public void Input(String num) {
		result.setText(result.getText()+num);
		txt+=num;
	}
	public void Add() {
		txt = new String();
	}
public void Sub() {
		
	}

public void Mul() {
	
}

public void Div() {
	
}
public void Clear() {
	this.txt = new String();
	result.setText(txt);
}




}
