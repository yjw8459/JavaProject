package Java06.Ex01;
/*
 * Member class안에 id와 picture가 존재하기 때문에
 * 재활용을 위해 Talkbox class 내에 Member class를 넣었다.
 * 
 */

public class Talkbox {
/*private String id
private String picture;*/
	private Member member; // 멤버클래스에 있기 때문에 클래스를 불러옴
private String contents;
private String chatTime;
/*public String getId() {
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
}*/
public String getContents() {
	return contents;
}
public Member getMember() {
	return member;
}
public void setMember(Member member) {
	this.member = member;
}
public void setContents(String contents) {
	this.contents = contents;
}
public String getChatTime() {
	return chatTime;
}
public void setChatTime(String chatTime) {
	this.chatTime = chatTime;
}
}
