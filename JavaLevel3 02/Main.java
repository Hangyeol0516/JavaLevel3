package main;

public class PokemonMain {
	
	public static void main(String[] args) {
	
		PokemonUp p1 = new PokemonUp();
		Pokemon p2 = new Pokemon();
		
		p1.능력치();
		p2.능력치();
		
		p2.몸통박치기(p1);
		
		p1.능력치();
		p2.능력치();
		
		p1.몸통박치기(p2);
	
		p1.능력치();
		p2.능력치();
		
	}
	
}
