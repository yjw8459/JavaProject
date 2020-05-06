package java06.InheritanceEx01;

public class KakaoMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Talkbox talkbox = new Talkbox();
		Member member = new Member();
		Member recvMember;
		
		member.setId("내아이디");
		member.setPicture("내사진");
		talkbox.setMember(member);
		talkbox.setContents("좋은 아침");
		talkbox.setChatTime("아침시간");
		
		System.out.println(talkbox.getMember().getId());
		System.out.println(talkbox.getMember().getPicture());
		System.out.println(talkbox.getContents());
		System.out.println(talkbox.getChatTime());
		
		recvMember = talkbox.getMember();
		
		System.out.println(recvMember.getId());
		System.out.println(recvMember.getPicture());
		System.out.println(talkbox.getContents());
		System.out.println(talkbox.getChatTime());
	}
}






