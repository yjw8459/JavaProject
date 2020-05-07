package Player;

import java.net.URL;
import java.util.ResourceBundle;

import Player.Service.ImageService;
import Player.Service.ImageServiceimpl;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.Media;

public class AboutController extends Controller implements Initializable{
	ImageService img = new ImageServiceimpl();
	MainController main = new MainController();
	@FXML Button like2Btn;
	Media media;
	boolean like;
	
	@FXML Label lbl1; //작사자 명
	@FXML Label lbl2; //작곡자 명
	@FXML Label lbl3; //편곡자 명 
	@FXML Label lbl4; //장르 명
	@FXML Label Title;
	@FXML Label Artist;
	
	
	Parent root;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	btnimg();
		
	}
	

	@Override
	public void setRoot(Parent root) {
		this.root = root;
		
	}
	public void like () {
		if(like==false) {
			img.btnImage(like2Btn, "/img/like2.png", 30, 30);
			
			like=true;
		}else {img.btnImage(like2Btn, "/img/like.png", 30, 30);
		
		like = false;
		} 

	}
	public void getMedia() {
		//미디어 데이터 반환
		media.getMetadata().forEach((s,o)->{
			switch (s) {
			case "title":
				Title.setText((String)o);
				//노래 이름 정보 받아서 About 라벨에 출력
				break;

			case "artist": Artist.setText((String)o);
			//아티스트 정보 받아서 About 라벨에 출력
				break;
			}
		});
	}
	public void btnimg() {
		if(like==true) img.btnImage(like2Btn, "/img/like2.png", 30, 30);
		else  img.btnImage(like2Btn, "/img/like.png", 30, 30);
		
	}
	public void setlike(boolean like) {
		this.like = like;
	}
	public void download() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText("다운로드 성공\n잔여 곡 :");
		alert.show();
		
	}
	public void addList() {
		//플레이리스트 추가 시 코드 구현 
		
	}
	public void setMedia(Media media) {
		this.media = media;
	}
}
