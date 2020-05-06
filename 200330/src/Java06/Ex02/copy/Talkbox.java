package Java06.Ex02.copy;
/*
 * Member class안에 id와 picture가 존재하기 때문에
 * 재활용을 위해 Talkbox class 내에 Member class를 넣었다.
 * 
 */

public class Talkbox extends Member{

private String contents;
private String chatTime;



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
