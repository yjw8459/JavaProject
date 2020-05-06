package java06.InheritanceEx03;

public class Talkbox extends Member{
	private String contents;
	private String chatTime;

	public Talkbox(String id, String picture, String contents, String chatTime) {
		/*
		 * ����� ���� ���̹Ƿ� this�� �ƴ� super�� �̿��ؾ� ��.
		this.id = id;
		this.picture = picture;
		*/
		/*
		 * �θ�Ŭ������ �ڿ��� ������ ������ private �ڿ��� ������ �� ����.
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
