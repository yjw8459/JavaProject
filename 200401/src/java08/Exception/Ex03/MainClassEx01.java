package java08.Exception.Ex03;

public class MainClassEx01 {
	public static void main(String[] args) {
		Talkbox tb = new Talkbox();
		try {
			
		
		tb.getMember().setId("testID");
	}catch(Exception e) {
		Member member = new Member();
		tb.setMember(member);
		tb.getMember().setId("testID");
	}finally {
		
	
		System.out.println(tb.getMember().getId());
	}
	}

}
