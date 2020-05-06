package Elevator2;

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


class Elv{
	private int Elv; // 현재 엘레베이터 층 수 저장
	//클래스 안에 스태틱 선언을 하면 유일한 전역변수
	public Elv () {//생성자는 클래스가 호출됨과 동시에 동작 
		   //즉 랜덤한 초기값으로 초기화
		Random r = new Random();
		Elv = r.nextInt((int)15)+1;
}
	public int come(int me){
		Elv = me;
		return Elv;
		
	}
	public void UP(){
		Elv++;
		
	}
	public void DOWN() {
		Elv--;
	}
	
	
	public int getElv() {
		// 클래스의 Elv가 가지고 있는 값을 반환
		return Elv;
	}
}

class ElevatorA extends Elv{
	static int me=1;
	static boolean eqtest(int a, int b, int c){//중복검사
		if(a==b) return false;
		if(b==c) return false;
		if(a==c) return false;
		else return true;
		
	}//Math.min(Math.min(a ,b),c)==a) == 가장 작은
	
	
	 static int[] updowncheck(int[] peo,Scanner in, int button1) {
		for(int i=0;i<peo.length;) {
			System.out.println("층을 눌러주세요 :");
			peo[i]=in.nextInt();
			if(button1==1) {
				if(peo[i]<me)System.out.println("올라갑니다 다시 눌러주세요.");}
				if(button1==2) {
					if(peo[i]>me)System.out.println("내려갑니다 다시 눌러주세요.");}
				else i++;
		}

		
		return peo;
		
	}
	
	static Elv CloseElv(Elv a, Elv b, Elv c){//가장 가까운 층 검사
		
		int min = Math.min(Math.min(a.getElv(), b.getElv()),c.getElv());
		if(min==a.getElv())return a;
		if(min==b.getElv())return b;
		if(min==c.getElv())return c;
		else return null;
	
}
	
	public static void main(String[] args) throws InterruptedException{
		Scanner in = new Scanner(System.in);
		int button1;
		
		int idx;
		int j=0;
		
		Elv Elv1 = new Elv();
		Elv Elv2 = new Elv();
		Elv Elv3 = new Elv();
		while(true) {
	
		if(eqtest(Elv1.getElv(),Elv2.getElv(),Elv3.getElv())==true)break;
		}
		System.out.println("모델1 : "+Elv1.getElv()+"\n모델2 : "+Elv2.getElv()
		+"\n모델3 : "+Elv3.getElv());
		
		System.out.print("1.올라감\n2.내려감\n동작 선택 : ");
		button1 = in.nextInt();
	System.out.println("탑승 인원은 몇 명입니까:");
	idx = in.nextInt(); //탑승 인원 수 입력
	int[] peo = new int[idx]; //탑승 인원 수 만큼의 배열 크기 지정
	
	updowncheck(peo,in,button1);
	
	Elv Elv=CloseElv(Elv1,Elv2,Elv3);
	
//int k=0;
	System.out.println(Elv.getElv() +
			"층에 있던 Elevator가 움직입니다"); 
	Thread.sleep(3000);
	System.out.println(me+"층에 도착했습니다");
	Thread.sleep(1000);
	Elv.come(me);
	
	
	int[] building;
	building = new int[15];
	for(int i=0; i<peo.length;i++) {
		building[peo[i]] = 1;
	}
	for(int i=2;j<idx;i++) {
		Thread.sleep(1000);
		Elv.UP();
		if(building[i]==1) {
			System.out.println(Elv.getElv()+"층에 도착했습니다.");
			
			j++;
			
		}else {
			System.out.println(Elv.getElv());
		}	
	}	
	}
}
