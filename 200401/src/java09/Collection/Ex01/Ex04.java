package java09.Collection.Ex01;
//Hashset

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {
		
		String[] words = {"java","jsp","html","css","spring"};
		Set<String> hs = new HashSet<String>();
		Iterator<String> itrt;
		Random random =  new Random();
		
		for(int i = 0; i<words.length;i++) {
			String word = words[random.nextInt(words.length)];
			System.out.println(word);
			hs.add(word);
		}
		System.out.println("=================================");
		itrt = hs.iterator();
		while(itrt.hasNext())
		System.out.println(itrt.next());
		
		System.out.println(hs.size());

	}

}
