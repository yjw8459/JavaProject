package ContainerEx;

import javafx.scene.layout.Pane;
//컨테이너 클래스
public class Container {
	public Pane getPane(String color, int width, int height, int x, int y) {
		Pane canvas = new Pane();
		
		
		canvas.setStyle("-fx-background-color:"+color+";");//입력받아 출력 가능
		canvas.setPrefSize(width, height);
		canvas.setLayoutX(x);
		canvas.setLayoutY(y);
		return canvas;
	}

}
