package java06.InheritanceEx03;

public class Talkbox extends Member{
	private String contents;
	private String chatTime;

	public Talkbox(String id, String picture, String contents, String chatTime) {
		/*
		 * 상속을 받은 것이므로 this가 아닌 super를 이용해야 함.
		this.id = id;
		this.picture = picture;
		*/
		/*
		 * 부모클래스의 자원을 가져다 쓰더라도 private 자원을 접근할 수 없음.
		super.id = id;
		super.picture = picture;
		*/
		super(picture);
		super.setId(id);
		
		this.contents = contents;
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
