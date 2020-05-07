package Player;

import java.net.URL;


import java.util.ResourceBundle;

import Player.Service.*;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import javafx.stage.Stage;

public class SubController extends Controller implements Initializable{
	ImageService imgServ = new ImageServiceimpl();
	Parent root;
	@FXML ProgressBar soundBar;
	@FXML ProgressBar excessBar;
	@FXML Button playBtn;
	@FXML Button nextBtn;
	@FXML Button backBtn;
	@FXML Button shuffleBtn;
	@FXML Button muteBtn;
	boolean mute = false;
	int i = 0;
	boolean play=false;
	
	int min;
	int sec;
	@FXML Button repeatBtn;
	boolean repeat = false;
	@FXML Label sTime;
	@FXML Label eTime;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnimg();//버튼 이미지 입히기
		soundBar.setProgress(0.4);
	}
	public void play() throws InterruptedException {// 플레이 버튼 구현
		if(play==false) {
			imgServ.btnImage(playBtn, "/img/pause.png",30,30);
			play = true;
		}else {
			imgServ.btnImage(playBtn, "/img/play.png",30,30);
			play=false;
		}
		
		 new Thread(()-> { //따로 노는 스레드 생성 독립적으로 스레드와 별개의 스레드를 만들어서 사용 
			//람다식 표현 Thread Expressions
			 
			for(i = 0; i<100;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				excessBar.setProgress(i*0.01);
				
				Platform.runLater(new Runnable() {
					
					@Override
					public void run() {
						
						startTime();
						endTime();
						}
				});
				
			} 
			 
			 }).start();
	}
		public void repeat() {
			if(repeat==true) {
				repeat=false;
			}else {
				repeat=true;
			}
			
		}
	public void excess(){
		
	}
	public void mute() {
		soundBar.setProgress(0); //다시 이전으로 프로그래스 바 돌리는 방법 구현해야함
		
		if(mute==false) {
			imgServ.btnImage(muteBtn, "/img/mute.png",30,30);
			mute=true;//소리가 켜져있다면 음소거 모드 
		}else {
			imgServ.btnImage(muteBtn, "/img/sound.png",30,30);
			mute = false;//음소거 모드라면 소리를 최대로 올림
			soundBar.setProgress(1);
		}
		
	}
	public void btnimg() {
		
		imgServ.btnImage(playBtn, "/img/play.png",30,30);
		imgServ.btnImage(nextBtn, "/img/next.png",30,30);
		imgServ.btnImage(backBtn, "/img/next.png",30,30);
		backBtn.setRotate(180);
		imgServ.btnImage(repeatBtn, "/img/repeat.png",30,30);
		imgServ.btnImage(muteBtn, "/img/sound.png",30,30);
		imgServ.btnImage(shuffleBtn, "/img/shuffle.png",30,30);
		soundBar.setStyle("-fx-accent: lightgreen;-fx-background-color: ffffff; -fx-padding: 0;");//프로그래스 바 색 변경
		excessBar.setStyle("-fx-accent: violet;");
		
		
		
	}
	public void startTime() {//
		min = i / 60;
		sec = i % 60;
		if(i<10) sTime.setText(min + ":" + "0"+ sec);
		else sTime.setText(min + ":" + sec);

	}
	public void endTime() {//
		eTime.setText(Integer.toString(2-min)+":"+Integer.toString(60-sec));
		
	}
	public void Main() {
		ICommonService comServ = new CommonServiceImpl();
		Stage mForm = new Stage();
		comServ.showWindow(mForm, "../PlayerMain.fxml");
	}
	@Override
	public void setRoot(Parent root) {
		this.root = root;
		
	}

}
