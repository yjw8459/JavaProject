package java07.AccessController;
/*
 * 같은 패키지 내에서는 private을 제외한 모든 경우 접근 가능
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
