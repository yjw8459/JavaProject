package Java200327;

import java.util.Random;
import java.util.Scanner;

/*
 * 학원의 엘레베이터는 3개이다
 * 그런데 근처에있는 엘레베이터는 움직이지 않고
 * 가장 아래있는 엘레베이터가 움직인다.
 * 알고리즘이 안 좋은듯 하다.
 * 이를 해결해 보자
 * throws InterruptedException{Thread.sleep(500)} 써줘야함 
 * Thread.sleep(500) 미리세컨드 단위 괄호 안에 1000이 1초
 * 
 */
class Updown {
	static int Elv;
	static final int c = 15;//엘레베이터의 최대 층수
	Scanner in=new Scanner(System.in);
	
	public int rand() {
		
		Random r = new Random();
		Elv = r.nextInt((int)15)+1;
		
		return Elv;
	}
	
	static int UP(int button2){
		
		Elv = button2;
		
		return Elv;
	}
	static int DOWN(int button2) {
Elv = button2;
		
		return Elv;
		
		
	}
	static int NOW(int me,int Ele) {//현재 내가 있는 층과의 거리
		int b;
		b =Ele- me; // 수식 
		
		return b;
	}
	
	
	

}
class Elevator{
	
static boolean check(int me,int button2){//올바른 층 수 입력인지 검사하는 메소드
	int check;
	check=me-button2;
	if(check>0)return true;
	else return false;
		
	}
static boolean eqcheck(int a,int b,int c) {
	if(a==b) return false;
	if(b==c) return false;
	if(a==c) return false;
	else return true;

}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int button1,button2;
		int me = 1;
		int now;
		 //현재 엘레베이터 층 수를 저장
		int Ele1,Ele2,Ele3;
		Updown Elv1= new Updown();
		Updown Elv2= new Updown();
		Updown Elv3= new Updown();
		Updown move = new Updown();
		
		while(true) {
			Ele1=Elv1.rand();
			Ele2=Elv2.rand();
			Ele3=Elv3.rand();
			if(eqcheck(Ele1, Ele2, Ele3)==true)break;
			
		}	
		
		while(true) {
		int c1 = Elv1.NOW(me,Ele1); //가장 가까운 엘레베이터 비교를 위한 변수
		int c2 = Elv2.NOW(me,Ele2);
		int c3 = Elv3.NOW(me,Ele3);
		
		System.out.println("현재 "+me+"층입니다");
		System.out.println("1.올라가시겠습니까 \n 2.내려가시겠습니까");
		System.out.println("모델1:"+Ele1);
		System.out.println("모델2:"+Ele2);
		System.out.println("모델3:"+Ele3);
		button1=in.nextInt();
		switch(button1) {
		case 1://올라감 동작
			if((c1<c2)&&(c1<c3)) {
			System.out.println("모델1:  "+me+"층에 도착했습니다");
			move = Elv1;Ele1=move.Elv;
			
		}
		if((c2<c1)&&(c2<c3)) {
			System.out.println("모델2:  "+me+"층에 도착했습니다");
			move = Elv2;Ele1=move.Elv;
		}
		if((c3<c1)&&(c3<c2)) {
			System.out.println("모델3:  "+me+"층에 도착했습니다");
			move = Elv3;Ele3=move.Elv;
		} System.out.print("몇층에 가십니까?");
		button2 = in.nextInt();
		me = move.UP(button2);
		System.out.println(me+"층에 도착헀습니다");break;
		case 2://내려감 동작
			if((c1<c2)&&(c1<c3)) {
				System.out.println("모델1:  "+me+"층에 도착했습니다");
				move = Elv1;Ele1=move.Elv;
			}
			if((c2<c1)&&(c2<c3)) {
				System.out.println("모델2:  "+me+"층에 도착했습니다");
				move = Elv2;Ele2=move.Elv;
			}
			if((c3<c1)&&(c3<c2)) {
				System.out.println("모델3:  "+me+"층에 도착했습니다");
				move = Elv3; Ele3=move.Elv;
			} System.out.print("몇층에 가십니까?");
			button2 = in.nextInt();
			me = move.DOWN(button2);
			System.out.println(me+"층에 도착헀습니다");break;
		}
		
		
		
		}
		
		
		
	}

}
