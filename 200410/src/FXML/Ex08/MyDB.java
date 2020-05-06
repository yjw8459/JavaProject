package FXML.Ex08;

import java.util.HashMap;

public class MyDB {
	private HashMap<String, String> loginTable;//hash map loginTable 선언
	//hashmap = ("key", "value")로 이루어 짐 key= 자리값   ex) 배열에서 0,1,2번째 값이 hashmap은 jin,din,admin이 자리값이다
	//다른 형태의 자리값을 가질 수 있는 클래스. 배열과 같은 형태인데 자리값만 다름 
	//이해 힘들면 다시 물어볼 것
	public MyDB() {//클래스 myDB의 생성자 .. 생성자는 void, int처럼 반환값이 없음 나머진 다르지않음
		//생성자는 클래스를 호출하는 순간 제일 먼저 호출됌
		//ex ) 변수 초기화를 num=0; 이렇게한다면 생성자는 클래스를 초기화해줌 어렵게 생각하지 말것
		loginTable = new HashMap<String, String>();
		//선언된 loginTable에 hashmap 인스턴스 생성
		
		loginTable.put("jin", "jin1234");//loginTable에 값을 넣어줌 name.put()으로 넣어줌
		loginTable.put("din", "din1234");
		loginTable.put("admin", "admin1234");
	}
	public String getPassword(String id){//호출돼서 인자 전달을 받으면 id랑 같은 해당 자리값이 있는지 
		//확인하고 있다면 value값(jin1234,din1234,admin1234) 중 해당 자리 값의 value를 반환
		return loginTable.get(id);
	}
}
