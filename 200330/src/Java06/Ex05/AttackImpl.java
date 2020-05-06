package Java06.Ex05;
/*
 * 하나의 interface로 다르게 구현된 구현체를 표현할 수도 있다.
 * 이는 보낸다는 의미의 send라는 이름의 메소드를 통일함으로써
 * 코드의 가독성을 높일 수 있다.
 * 
 */

public class AttackImpl implements Attack{

	@Override
	public String standoffAttack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String MelleAttack() {
		// TODO Auto-generated method stub
		return null;
	}

}
