package Java06.Ex03;
//shift+alt + s
//r->alt+a ->r

public class Member {//멤버클래스
private String id;
private String picture;
public Member(String id,String picture) {
	this.id=id;
	this.picture=picture;
}
public Member(String picture) {
	
	this("infiscap",picture);
	}
public Member() {
	
	this("infiscap","No picture");
	}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPicture() {
	return picture;
}
public void setPicture(String picture) {
	this.picture = picture;
}


}
