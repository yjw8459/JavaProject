package java06.InheritanceEx01;

public class KakaoMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Talkbox talkbox = new Talkbox();
		Member member = new Member();
		Member recvMember;
		
		member.setId("�����̵�");
		member.setPicture("������");
		talkbox.setMember(member);
		talkbox.setContents("���� ��ħ");
		talkbox.setChatTime("��ħ�ð�");
		
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






