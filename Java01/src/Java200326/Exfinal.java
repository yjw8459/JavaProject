package Java200326;


import java.util.Random;
import java.util.Scanner;

import com.jin.mail.JinsMail;

public class Exfinal {
	
	
	static final String Line="=====================================";
	static String [] name,ids,pws,gmail;
	static int idx;
	static void mail(){
		JinsMail mail = new JinsMail();
		mail.setId("ryu01410@gmail.com");
		mail.setPw("phantom3@");
		mail.setSndUsr("", "ryu01410@gmail.com");
		String mailnum = mailnum();
		mail.SendMail(gmail[idx],"인증", mailnum);
	}
	static String mailnum() {
		int digit = 10000;
		Random r = new Random();
		return r.next(digit);
		
	}
	
	static void login(Scanner in) {
		String logid,logpws;
	while(true) {
		System.out.println("아이디 입력 :");
		logid=in.next();
		System.out.println("패스워드 입력 :");
		logpws=in.next();
		if(logincheck(logid,logpws)==true) {
			System.out.println("로그인되었습니다.");
			break;
		}else System.out.println("다시 입력해주세요");
		
	}
	}
	private static boolean logincheck(String logid,String logpws) {
		int i;
		for(i=0;i<name.length;i++) {//equals =문자열이 같냐 비교문 **중요
			if(logpws.equals(pws[i])==true&&logid.equals(ids[i])==true) {
				
				return true;
			}
	} return false;
		
		
	}
	
	/*static void membership(Scanner in) {
		System.out.print("이름을 입력해주세요:");
		name[idx]=in.next();
		System.out.print("아이디를 입력해주세요:");
		ids[idx]=in.next();
		System.out.print("패스워드 입력해주세요:");
		pws[idx]=in.next();
		idx++;
		System.out.println(name[idx-1]+"님 회원가입을 정상적으로 완료했습니다.");
		
	}*/
	//회원가입을 하고 등록되어 있는 모든 회원 정보를 출력하시오
	
	/*static void infor() {
		/*String memberInfo=new String();
		
		memberInfo.format("%s\n",Line);*/
		/*System.out.println(Line);
		for(int i=0;i<idx;i++) {
			
			System.out.println("이름:"+name[i]+"  ID:"+ids[i]+"  PW:"+pws[i]);
			//내가 만든 회원정보 출력
	}
		System.out.println(Line);
	}*/
	
static void displayMember() {
	String memberInfo="";
	
	memberInfo=String.format("%s\n",Line);
	memberInfo+=String.format("%10s%15s%15s%25s\n","이름","아이디","패스워드","이메일");
	memberInfo+=String.format("%s\n",Line);
for(int i=0; i<idx;i++) {
	memberInfo+=String.format("%10s%15s%15s%35s\n",name[i],ids[i],pws[i],mail[i]);
}
memberInfo+=String.format("%s\n",Line);
System.out.println(memberInfo);
}
static void init(int size) { //데이터 저장 메소
	Scanner in = new Scanner(System.in);//클래스(ex.Scanner)를 이용할 수 있게해주는 new같은 형식 = 인스턴스 
		name = new String[size];
		ids = new String[size];
		pws = new String[size];
		gmail = new String[size];
		 		idx =0;	
	}
	static String getmenu(String newLine) { //메뉴 메소
		
		String menuStr =("==========================="+newLine);
	menuStr+=("1.회원가입"+newLine);
	menuStr+=("2.로그인"+newLine);
	menuStr+=("3.회원정보"+newLine);
	menuStr+=("4.종료"+newLine);
	menuStr+=("=========================="+newLine);
	menuStr+=("위의 메뉴를 선택하세요.");	
	return (menuStr);
	}

	public static void main(String[] args) {
		int a;
	String name, id, pw,mail;
	init(100);
		Scanner in = new Scanner(System.in);
		//System.out.println();
		while(true) {
		String menu = getmenu("\n");
		System.out.println(menu);
		a = in.nextInt();
	
		switch(a) {   //메뉴 선택
		case 1: 
			System.out.println("1.회원가입을 선택하였습니다.");
		
		System.out.println("이름을 입력하세요.");
		name=in.next();
		System.out.println("ID를 입력하세요.");
		id=in.next();
		System.out.println("PW를 입력하세요.");
		pw=in.next();
		System.out.println("e-mail을 입력하세요.");
		mail=in.next();
		membership(name,id,pw,mail);
		break;
		case 2:
			System.out.println("2.로그인을 선택하였습니다.");login(in);
		break;
		case 3:
			System.out.println("3.회원 정보 출력 :");displayMember();break;
		case 4:
			System.out.println("4.프로그램을 종료합니다.");
		System.exit(0);break;
		}
		}
	}

	private static void membership(String n, String id, String pw,String ma) {
		// TODO Auto-generated method stub
		name[idx]=n;
		ids[idx]=id;
		pws[idx]=pw;
		gmail[idx]=ma;
		
		idx++;
		
	}

}