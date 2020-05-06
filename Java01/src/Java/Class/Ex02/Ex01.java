package Java.Class.Ex02;

import Java.Class.Ex01.Member;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member();
		member.setId("infiscap");
		member.setPicture("사진없어요");
		
		System.out.println(member.getId());
		System.out.println(member.getPicture());
	}

}
