package Ex08.Ex01HighControll.answer.exam02_mediaview.Ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class RootController implements Initializable {
	@FXML private MediaView mediaView;
	@FXML private ImageView imageView;
	@FXML private Button btnPlay;
	@FXML private Button btnPause;
	@FXML private Button btnStop;
	
	private boolean endOfMedia;
	private MediaPlayer mediaPlayer;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//�̵�� ��ü ����
		Media media = new Media(getClass().getResource("../media/video.m4v").toString());
		//Media media = new Media(getClass().getResource("media/audio.wav").toString());
		
		//�̵�� �÷��̾� ���� �� �̵�� �信 ����
		mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);
	
		//�ش� ���°� �Ǹ� ������ Runnable ����
		mediaPlayer.setOnReady(new Runnable() {
			@Override
			public void run() {
				btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
				if(mediaPlayer.isAutoPlay()) {mediaView.setVisible(false);}
			}
		});
		mediaPlayer.setOnPlaying(()->{
			btnPlay.setDisable(true); btnPause.setDisable(false); btnStop.setDisable(false);
		});
		mediaPlayer.setOnPaused(()->{
			btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(false);
		});
		mediaPlayer.setOnEndOfMedia(()->{
			endOfMedia = true;
			btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
		});
		mediaPlayer.setOnStopped(()->{
			mediaPlayer.seek(mediaPlayer.getStartTime());
			btnPlay.setDisable(false); btnPause.setDisable(true); btnStop.setDisable(true);
		});
	}
	public void play(ActionEvent event){
		if(endOfMedia) { 
			mediaPlayer.stop(); 
			mediaPlayer.seek(mediaPlayer.getStartTime());
		}
		mediaPlayer.play();
		endOfMedia = false;
	}
	public void pause(){
		mediaPlayer.pause();
	}
	public void stop(){
		mediaPlayer.stop();
	}
}
