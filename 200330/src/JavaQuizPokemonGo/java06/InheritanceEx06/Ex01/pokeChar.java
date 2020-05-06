package JavaQuizPokemonGo.java06.InheritanceEx06.Ex01;

import java.util.Random;

public class pokeChar extends Char{
	
	public pokeChar(String ability1,String ability2,String ability3,String ability4) {
		// TODO Auto-generated constructor stub
		super(4);
		String[] allability= {ability1,ability2,ability3,ability4};
		
		int[] allabilitydata=new int[allability.length];
		for(int i=0;i<allability.length;i++) {
			Random r = new Random();
			allabilitydata[i]= (int)r.nextInt(120)+75;
		}
		
	}
	String name;
	String data;
	

}
