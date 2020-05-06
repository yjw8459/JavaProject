package java09.Collection.Ex01;
/*
 * map은 set + List구조
 * map(key, value)형식으로 사용되며 key는 set
 * value는 list 특징을 갖음
 */

import java.util.HashMap;
import java.util.Set;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<Integer,String> hm = new HashMap<Integer, String>();
	Set<Integer> ks;
	
	hm.put(0, "test");
	hm.put(1, "hello");
	hm.put(10, "infiscap");
	hm.put(20, "infiscap");
	hm.put(10, "fee"); // 키 값을 변경
	
	
	hm.remove(0);
	hm.remove(1, "hello"); //인덱스 값 1에 hello가 있으면 지워라
	hm.remove(10, "infi");
	ks = hm.keySet();
	for(Integer key : ks)
	System.out.println(key+":"+hm.get(key));//key 값과 내용 출력

	}

}
