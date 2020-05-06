package java09.Collection.Ex01;
//Treeset 정렬된 데이터들이 나옴

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex05 {

	public static void main(String[] args) {
		
		String[] words = {"java","jsp","html","css","spring"};
		TreeSet<String> hs = new TreeSet<String>();
		Iterator<String> itrt;
		Random random =  new Random();
		
		for(int i = 0; i<words.length;i++) {
			String word = words[random.nextInt(words.length)];
			System.out.println(word);
			hs.add(word);
		}
		System.out.println("=================================");
		//itrt = hs.iterator();
		itrt = hs.descendingIterator();//descendingIterator(); 내림차순
		while(itrt.hasNext())
		System.out.println(itrt.next());
		
		System.out.println(hs.size());

	}

}
