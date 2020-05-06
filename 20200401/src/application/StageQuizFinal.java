package application;


import java.awt.Dimension;
import java.awt.Toolkit;


import javafx.stage.Stage;

public class StageQuizFinal {
	private int frameWidth, frameHeight;//얼마나 큰 크기로 윈도우를 만들 것인지
	private int screenWidth, screenHeight;//화면에서의 이동거리
	private Stage stage; // 받아서 보여줌
	public StageQuizFinal(Stage stage, int frameWidth, int frameHeight) {
		// TODO Auto-generated constructor stub
		this.stage = stage;
		this.frameWidth = frameWidth;
		this.frameHeight = frameHeight;
	}
	private void setScreenSize() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.screenWidth = screenSize.width;
		this.screenHeight = screenSize.height;
	}
	public void ShowFrame(int cnt) throws InterruptedException {
		setScreenSize();
		int posX, posY;
		int showN=300;
		posX = (screenWidth/2 - frameWidth/2)/cnt;
		posY = (screenHeight/2 - frameHeight/2)/cnt;
		for(int i = 0; i<cnt;i++) {
		
		stage.setX(posX*i);
		stage.setY(posY*i);
		stage.hide();
		showN = showN-(i*2);
		if(showN<0) showN=1;
		Thread.sleep(showN);
		stage.show();
		}
	}
	
}
