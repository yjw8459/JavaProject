package FXMLEX05;

import java.util.HashMap;

public class DB {
	private HashMap<String, String> loginTable;
	//Hash Map의 특징 첫째 키 값은 중복될 수 없음 
	//둘 째 value 값은 중복돼도 상관없음
	
	public DB() {
		// TODO Auto-generated constructor stub
		loginTable = new HashMap<String, String>();//Hashmap은 로그인 할 때 용이
		
		loginTable.put("yjw","yjw8459");//ArrayList의 자리값은 0,1,2...이고 ,key값을 지어줄 수 있음
		loginTable.put("cha","yjw8459");
		loginTable.put("wan","yjw8459");
	}
public String getPassword(String id) {
	return loginTable.get(id);
	
}
	
}


