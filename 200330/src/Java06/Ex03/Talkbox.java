package Java06.Ex03;
/*
 * Member class안에 id와 picture가 존재하기 때문에
 * 재활용을 위해 Talkbox class 내에 Member class를 넣었다.
 * 
 */

public class Talkbox extends Member{
/*private String id
private String picture;*/
	
private String contents;
private String chatTime;

public Talkbox(String id, String picture, String content, String chatTime) {
	// TODO Auto-generated constructor stub
	/*this.id=id;
	this.picture = picture;상속을 받은 것이므로 this가 아닌 super를 이용해야함
	
	부모 클래스의 자원을 가져다 쓰더라도 private 자원을 접근할 수 없음
	super.id=id;
	super.picture=picture;
	
	*/
	super(id, picture);
	super.setId(id);
	
	this.contents = content;
	this.chatTime = chatTime;
	
}
public String getContents() {
	return contents;
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
