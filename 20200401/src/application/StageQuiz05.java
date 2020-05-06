package application;

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.stage.Stage;
/*
 * x의 경우 0 2 1로 똑같이 동작됨
 * i가 0,1, 2일 경우 x는 0,2,1로 변경됨으로
 * x= 3-i와 같이 표현될 수 있음
 * 위에 식에 i를 대입하면 3, 2, 1로 나오게 되며
 * 0,2,1로 나오게 하려면 3으로 나누어 나머지를 구하면 됨
 * i의 경우 0,1,2이 후3,4,5,가 나오게 되며
 * i 역시 3으로 나누어 나머지를 표현하면 0,1,2패턴으로 고정됨
 * 따라서
 * (3-(i%3))%3으로 연산하면 x의 패턴이 유지됨
 * y의 경우는 크게 0 2 1의 패턴이므로
 * 0,1,2눈 0,
 * 
 */
public class StageQuiz05 {
	private final int TOP_LEFT=0;
	private final int TOP_CENTER=1;
	private final int TOP_RIGHT=2;
	private final int MIDDLE_LEFT=3;
	private final int MIDDLE_CENTER=4;
	private final int MIDDLE_RIGHT=5;
	private final int BOTTOM_LEFT=6;
	private final int BOTTOM_CENTER=7;
	private final int BOTTOM_RIGHT=8;
	private Dimension frameSize; //윈도우 창 크기
	private Stage stage;
	public StageQuiz05(Stage stage, int frameWidth, int frameHeight) {
		// TODO Auto-generated constructor stub
		frameSize = new Dimension(frameWidth, frameHeight);
		this.stage = stage;
	}
	public Dimension getScreenSize() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		return tk.getScreenSize();
				
	}
	private void setLocation(int pos) {
		Dimension screenSize = getScreenSize(); //전체 스크린 사이즈
		
		switch(pos) {
		case TOP_LEFT: 
			stage.setX(0);
			stage.setY(0); 
			break;
		case TOP_CENTER: 
			stage.setX((screenSize.width - frameSize.width)/2);//width/2는 x축으로 정중앙
			stage.setY(0); 
			break;
		case TOP_RIGHT: 
			stage.setX((screenSize.width - frameSize.width));
		stage.setY(0); 
		break;
		case MIDDLE_LEFT: 
			stage.setX(0);
			stage.setY((screenSize.height - frameSize.height)/2);//Y축으로 정중앙
			break;
		case MIDDLE_CENTER: 
			stage.setX((screenSize.width - frameSize.width)/2);
			stage.setY((screenSize.height - frameSize.height)/2); 
			break;
		case MIDDLE_RIGHT: 
			stage.setX((screenSize.width - frameSize.width));
			stage.setY((screenSize.height - frameSize.height)/2);
			break;
		case BOTTOM_LEFT: 
			stage.setX(0);
			stage.setY(screenSize.height - frameSize.height); //전체 스크린 사이즈 중 프레임 사이즈를 빼고 위치
			break;
		case BOTTOM_CENTER: 
			stage.setX((screenSize.width - frameSize.width)/2);
			stage.setY((screenSize.height - frameSize.height)); 
			break;
		case BOTTOM_RIGHT: 
			stage.setX((screenSize.width - frameSize.width));
			stage.setY(screenSize.height - frameSize.height); 
			break;
		}
		
	}
	public void showWindow() throws InterruptedException {
		for(int pos = TOP_LEFT;pos<=BOTTOM_RIGHT;pos++) {
			setLocation(pos);
			stage.show();
			Thread.sleep(500);
			stage.hide();
			
		}
	}
}
