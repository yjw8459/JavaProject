package FXMLEX04;

import java.util.HashMap;

public class DB {
	HashMap<String, String> map = new HashMap<String, String>();
	public DB() {
		// TODO Auto-generated constructor stub
		map.put("yoo", "jongwon");//생성자 부분
		map.put("kim", "chabin");
		

	}
	public String getPassword(String id) {
		return map.get(id);
		
	}
}
