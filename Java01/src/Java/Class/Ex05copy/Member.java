package Java.Class.Ex05copy;
/* default 생성자
 * 클래스를 생성할 경우 자연스럽게 만들어 지는 생성자
 * "public 클래스명()"형식으로 만들어짐
 * 초기에는 생략되어 있음
 * 다른 생성자를 만들 경우 명시해주지 않으면 없는 것으로 인식됨
 * 
 * 생성자
 * 생성이란 무엇인가 만들어 진다는 것
 * 생성자란 new를 이용하여 인스턴스를 만들 떄 동작되는 메소드**
 * 생성자는 반환 자료형이 없으며 클래스명과 같은 이름을 사용함**
 * 
 * Overloading
 * 같은 이름으로 사용되는 메소드
 * 메소드의 구분은 매개변수의 종류 혹은 개수로 구분함
 * 이름 통
 * 
 * this
 * 클래스 자신을 의미함
 * 생성자를 표현한 경우 사용됨
 * 
 */
public class Member {
private String picture;
private String id;

public Member(String id, String picture) {
	this.id = id;
	this.picture = picture;
	
	
}

public String getPicture() {
	return picture;
}
public void setPicture(String picture) {
	this.picture = picture;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}

}
