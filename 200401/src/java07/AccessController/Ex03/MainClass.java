package java07.AccessController.Ex03;

import java07.AccessController.FieldEx01;

/*
 * 다른 패키지에서 상속 받을 경우 public, protected 만 접근 가능
 * public : 모든 경우 허용
 * default : 같은 패키지 내에서 허용
 * protected : 같은 패키지 혹은 상속에서 허용
 * private : 모든 경우 거부
 */
class ChildClass extends FieldEx01{
	public ChildClass(){
	super.default_n = 1;
	super.protected_n = 1;
	super.public_n=1;
	super.private_n = 1;
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FieldEx01 fex = new FieldEx01();
		
		fex.default_n =1;
		fex.public_n =1;
		fex.protected_n =1;
		fex.private_n =1;

	}

}
