package java07.AccessController.Ex02;

import java07.AccessController.FieldEx01;

/*
 *  * 다른 패키지에서 사용되는 경우 public만 접근 가능
*/
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
