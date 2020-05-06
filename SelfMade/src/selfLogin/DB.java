package selfLogin;

import java.util.Map;

public class DB {
	private Map<String, String> map;
	public void setMap(String id, String pw) {
		map.put(id, pw);
	}
	public String getMap(String id) {
		return map.get(id);
		
	}
	public DB() {
		
	}
}
