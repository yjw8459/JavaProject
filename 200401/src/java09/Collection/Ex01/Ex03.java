package java09.Collection.Ex01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 * hashset : hash 데이터를 이용하여 데이터를 저장
 * *hashdate
 * treeset : 데이터를 이진검색트리 구조로 저장 (이진검색트리로 검색하면 검색속도가 빠르다) 주로 검색에 사용되는 알고리즘 정렬된 데이터를 넣어줄 수 있음
 * 
 */

public class Ex03 {
public static void main(String[] args) {
	Set<String> hs = new HashSet<String>();
	Iterator<String> itrt;//??
	
	hs.add("test");
	hs.add("hello");
	/*
	for(String str : hs) //값을 그룹에서 하나씩 꺼내서 처리해라
		System.out.println(str);//따로 get()이 존재하지 않음 순서가 없기 때문에 순서대로 읽어들이지 않음
		*/
	itrt = hs.iterator();//위 for문 코드랑 개념은 같음
	while(itrt.hasNext())
		System.out.println(itrt.next());
	System.out.println("==============remove==============");
	hs.remove("test"); // remove로 test를 지움
	itrt=hs.iterator();
	while(itrt.hasNext())
		System.out.println(itrt.next());
	
	System.out.println(hs.size());
	hs.clear(); // clear를 하면 비워짐
	System.out.println(hs.size());
}
}
