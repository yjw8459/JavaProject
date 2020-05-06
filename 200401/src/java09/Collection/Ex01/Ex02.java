package java09.Collection.Ex01;

import java.util.*;

public class Ex02 {
public static void main(String[] args) {
	String[] words= {"꿈","나무","어린이","좋아","쉬는날"};
	
	
	List<String> lst = new ArrayList<String>();
	//List<String> lst = new LinkedList<String>();
	Random random = new Random();
	
	for(int i = 0; i<words.length;i++) {
		//lst.add(words[random.nextInt(words.length))]); // 이 한줄로 됌. 밑 코드는 풀어쓴 것
		int idx = random.nextInt(words.length);
		String word = words[idx];
		lst.add(word);
		System.out.println("=====================================");
		System.out.println("words.length : "+words.length);
		System.out.println("idx : "+idx);
		System.out.println("words[idx]"+words[idx]);
		System.out.println("word : "+word);
	}
	for(int i=0;i<lst.size();i++)
		System.out.println(lst.get(i)+" ");//get(idx) = idx값에 있는 것을 반환
	
	System.out.println("==============sorted ================");
	lst.sort(null); // lst.sort(정렬 관련된 코드, 또는 클래스 ) null은 오름차순
	for(int i = 0; i<lst.size();i++)
		System.out.println(lst.get(i)+" ");
}
}
