package Ex06;

public class Member {
	private String name;//데이터를 담을 클래스 변수 선언
	private String id;
	private String pw;
	private boolean gender;
	private int age;
	private int hobby;
	public String getName() {//Getter&Setter를 이용해 변수 값 저장 및 반환
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHobby() {
		return hobby;
	}
	public void setHobby(int hobby) {
		this.hobby = hobby;
	}
}
