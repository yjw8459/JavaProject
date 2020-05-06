package JavaQuizPokemonGo.java06.InheritanceEx06.Ex01;

public class Char {
	String[] pokeability;
	int[] pokedata;
	
	public Char(int n) {
		// TODO Auto-generated constructor stub
		pokeability = new String[n];
		pokedata = new int[n];
	}

	public String[] getPokeability() {
		return pokeability;
	}



	public int[] getPokedata() {
		return pokedata;
	}
	public void poke(String ability,int data, int idx) {
		if(pokeability.length>idx) {
			pokeability[idx]=ability;
			pokedata[idx]=data;
			
			
		}
		
	}



}
