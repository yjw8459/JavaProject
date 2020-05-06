package Java200326;
import java.util.Random;
import java.util.Scanner;
/*
 * 이메일 인증 **
 */


import com.jin.mail.JinsMail;

public class ex01 {
	static final String ID = "ryu01410@gmail.com";
	static final String PW = "phantom3@";
	static final String check = "인증번호입니다!";
	
	
	static String random(int n) {//랜덤인증번호 생성
		String formatStr = "%0"+n+"d";
		return String.format(formatStr, new Random().nextInt((int)Math.pow(10, n)));//구문 이해 필요
	}
	
		static void mailsend(String Mail,String r){
			JinsMail mail = new JinsMail();
			mail.setId(ID);
			mail.setPw(PW);
			mail.setSndUsr("천둥벌거숭이", ID);
			mail.SendMail(Mail,check, r);
		}
		static boolean mailcheck(String r, String certiNum) {
			if(r.equals(certiNum)==true) {
				return true;
				
			}
			return false;
			
		}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("인증 받으실 이메일을 입력하세요:");
		String Mail =in.next();
		String r = random(4);
		
		mailsend(Mail,r);
		System.out.println("인증번호를 발송했습니다.");
	for(int i=0;i<3;i++) {
		System.out.println("인증번호를 입력하세요");
		String certiNum = in.next();
		if(mailcheck(r,certiNum)==true) {
			System.out.println("인증됐습니다.");
			break;
	}else System.out.println("인증 실패 다시 입력");
		
	}
	}

}
