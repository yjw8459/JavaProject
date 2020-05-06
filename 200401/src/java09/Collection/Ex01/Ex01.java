package java09.Collection.Ex01;

import java.util.*;//java.util의 모든 걸 사용하겠다 

public class Ex01 {
public static void main(String[] args) {
	//ArrayList<String> lst = new ArrayList<String>();
	List<String> lst = new ArrayList<String>(); //인스턴스 생성
	
	lst.add("test");
	lst.add("hello");
	lst.add(2,"five");//2번째에 five를 넣어라  // 빼고하면 순서대로 
	lst.add(2,"two");
	lst.add(2,"three");
	lst.add(3,"three");
	lst.add(5,"five");//순서 이해하기
	
	for(int i=0;i<lst.size();i++)
	System.out.println(lst.get(i));
	
	System.out.println(lst.indexOf("two")); // "two"가 가지는 인덱스 값 반환
	System.out.println(lst.indexOf("three")); // "three"가 가지는 인덱스 값 반환
	System.out.println("remove");
	lst.remove(2); //인덱스 값 순서에 있는 것을 지움
	for(int i=0;i<lst.size();i++)
		System.out.println(lst.get(i));
	
	if(lst.isEmpty()) System.out.println("clear"); //lst.isEmpty() =  lst가 비어있는지 확인
	else lst.clear(); // lst를  비워라
	
	System.out.println("lst.size : "+lst.size());
	if(lst.isEmpty()) System.out.println("clear"); //lst.isEmpty() =  lst가 비어있는지 확인
	
	
	
}
}
