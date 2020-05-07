package Player;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class SettingsController extends Controller implements Initializable{
	Parent root;
	//음질 설정에 있는 radioButton 3개
	@FXML RadioButton sound1; //음질 설정 1번 AAC 128K
	@FXML RadioButton sound2; //음질 설정 2번 AAC 320K
	@FXML RadioButton sound3; //음질 설정 3번 MP3 320K
	
	//다운로드 설정에 있는 radioButton 2개
	@FXML RadioButton down1; //다운로드 음질 설정 1번
	@FXML RadioButton down2; //다운로드 음질 설정 2번
	
	//재생목록 설정 Radiobutton 
	//1,2,3번 그룹,	4,5번 그룹, 6,7번 그룹
	//재생 목록 곡 담기 설정
	@FXML RadioButton set1; //재생중인 곡 바로 뒤
	@FXML RadioButton set2; //맨 처음
	@FXML RadioButton set3; //맨 끝
	//중복 곡 담기 설정
	@FXML RadioButton set4; //삭제하고 담기
	@FXML RadioButton set5; //포함하고 담기
	//기존 재생 목록 삭제 설정
	@FXML RadioButton set6; //재생목록 유지
	@FXML RadioButton set7; //재생목록 삭제
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		groupbtn();
		
	}

	@Override
	public void setRoot(Parent root) {
		this.root = root;
		
	}
	public void delCache() {
		//환경설정 캐시관리에서 삭제 버튼 눌렀을 시 동작
	}
	public void groupbtn() {
		//라디오버튼 토클버튼
		ToggleGroup soundTg = new ToggleGroup();
		sound1.setToggleGroup(soundTg);
		sound2.setToggleGroup(soundTg);
		sound3.setToggleGroup(soundTg);
		ToggleGroup downTg = new ToggleGroup();
		down1.setToggleGroup(downTg);
		down2.setToggleGroup(downTg);
		ToggleGroup setTg1 = new ToggleGroup();
		set1.setToggleGroup(setTg1);
		set2.setToggleGroup(setTg1);
		set3.setToggleGroup(setTg1);
		ToggleGroup setTg2 = new ToggleGroup();
		set4.setToggleGroup(setTg2);
		set5.setToggleGroup(setTg2);
		ToggleGroup setTg3 = new ToggleGroup();
		set6.setToggleGroup(setTg3);
		set7.setToggleGroup(setTg3);
		
	}

}