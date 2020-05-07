package Player;

import java.net.URL;

import java.util.ResourceBundle;

import Player.Service.CommonServiceImpl;
import Player.Service.ICommonService;
import Player.Service.ImageService;
import Player.Service.ImageServiceimpl;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.stage.Stage;

public class MainController extends Controller implements Initializable{
	Parent root;
	Media media;
	//static boolean like;
	
	ICommonService comServ = new CommonServiceImpl();
	ImageService imgbtn = new ImageServiceimpl();
	@FXML Button setBtn;
	@FXML  Button likeBtn;
	@FXML Button aboutBtn;
	@FXML Label songId;
	boolean like=false;
	@FXML Label artist;
	@FXML ImageView album;
	@FXML TextArea Lyrics;
	
	//boolean like = false;
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		imgbtn();
		
	}
	public void MediaProc() { //메타 데이터를 얻어서 처리 메소드
		//미디어 데이터 처리 했고 좋아요 데이터 받고 환경설정이랑 앨범정보 폼 만들고 기능 구현 
		media.getMetadata().forEach((s, o)-> {
			//익명 변수 형태가 정해져 있지 않음 타입만 명시해주는
			//Metadata = 음악에 있는 여러 정보들을 받을 때 사용 (부가정보)
		switch(s) {
		case "title" : songId.setText((String)o); break;
		case "artist" : artist.setText((String)o); break;
		case "image" :  album.setImage((Image)o); break;
		//case "lylics" : Lyrics.setText((String)o);break;
			
			
		}
		});
	}
	
	public void settings() {
		Stage s = new Stage(); // 
		comServ.showWindow(s, "../Settings.fxml");
		
	}
	public void like() {
		if(like==true) {
		imgbtn.btnImage(likeBtn, "/img/like.png",40,40);
		like = false;
		
		}
		else {
			imgbtn.btnImage(likeBtn, "/img/like2.png",40,40);
			like = true;
			
		}
	}
	public void imgbtn() {
		imgbtn.btnImage(setBtn, "/img/settings.png",20,20);
		imgbtn.btnImage(likeBtn, "/img/like.png",40,40);//??
		
		imgbtn.btnImage(aboutBtn, "/img/dots.png",20,20);
		
	}
	public void about() {
		Stage s = new Stage();
		comServ.showWindow(s, "../About.fxml");
		
		
	}

	@Override
	public void setRoot(Parent root) {
		this.root = root;
		
	}
public void setMedia(Media media) {
	this.media = media;
	//아티스트 명, 노래제목,  앨범 표지 
}

}
