import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
//그룹화 중요
public class Ex04 extends Application{

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Image image = new Image(
				getClass().getResourceAsStream(
						"img/search.png"));//이미지 패키지 이름과 파일명
		Label lbl1 = new Label("Search", new ImageView(image));
	//Label name = new Label("Search", new ImageView("/img/search.png"));
		//코드 간소화 가능
		lbl1.setFont(new Font("Arial",25));//글꼴과 크기
		
		lbl1.setTextFill(Color.web("#0076a3"));//글자 색
		Label lbl2 = new Label("Values");
		lbl2.setRotate(90);
		lbl2.setTranslateY(50);
		Label lbl3 = new Label("A label that needs to be Wrapped");
		lbl3.setWrapText(true);
		lbl3.setPadding(new Insets(40,0,0,0));
		//마우스를 올렸을 시 동작
		lbl1.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				lbl1.setScaleX(1.5);
				lbl1.setScaleY(1.5);
				
			}
		});
//		lbl1.setOnMouseEntered(e->{//난다식
//			난다식으로 코드 간소화 가능
//		});
		lbl2.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				lbl2.setScaleX(1.5);
				lbl2.setScaleY(1.5);
				
			}
		});
		lbl3.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				lbl3.setScaleX(1.5);
				lbl3.setScaleY(1.5);
				
			}
		});
		lbl1.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				lbl1.setScaleX(1);
				lbl1.setScaleY(1);
			}
		});
		lbl2.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				lbl2.setScaleX(1);
				lbl2.setScaleY(1);
			}
		});
		lbl3.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				lbl3.setScaleX(1);
				lbl3.setScaleY(1);
			}
		});
		HBox hbox = new HBox();
		hbox.getChildren().addAll(lbl1,lbl2,lbl3);
		primaryStage.setScene(new Scene(hbox));
		primaryStage.setTitle("chabin");
		primaryStage.show();
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
