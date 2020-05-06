package Java06.Ex03;

public class KakaoMain {
	public static void main(String[] args) {
		Talkbox talkbox = new Talkbox();
		Member member = new Member();
		Member recvMember;
		
		/*member.setId("내아이디:");
		member.setPicture("내사진");
		talkbox.setMember(member);*/
		talkbox.setContents("좋은아침");
		talkbox.setChatTime("아침시간");
		
		recvMember = talkbox.getMember();
		
		System.out.println(recvMember.getId());
		System.out.println(recvMember.getPicture());//String은 초기값 NULL
		System.out.println(talkbox.getContents());
		System.out.println(talkbox.getChatTime());
		
	}

}
