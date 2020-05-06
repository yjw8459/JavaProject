package java06.InheritanceEx02;

public class KakaoMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Talkbox talkbox = new Talkbox();

		talkbox.setId("내아이디");
		talkbox.setPicture("내사진");
		talkbox.setContents("좋은 아침");
		talkbox.setChatTime("아침시간");
		
		System.out.println(talkbox.getId());
		System.out.println(talkbox.getPicture());
		System.out.println(talkbox.getContents());
		System.out.println(talkbox.getChatTime());
	}
}






