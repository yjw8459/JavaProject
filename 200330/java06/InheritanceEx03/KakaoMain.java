package java06.InheritanceEx03;

public class KakaoMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Talkbox talkbox = new Talkbox("�����̵�", "������", "���� ��ħ", "��ħ�ð�");

		/*
		 * talkbox.setId("�����̵�"); talkbox.setPicture("������");
		 */
		talkbox.setContents("���� ��ħ");
		talkbox.setChatTime("��ħ�ð�");
		
		System.out.println(talkbox.getId());
		System.out.println(talkbox.getPicture());
		System.out.println(talkbox.getContents());
		System.out.println(talkbox.getChatTime());
	}
}






