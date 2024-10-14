package org.lessons.java.animals;

public class Main {

	public static void main(String[] args) {
		
		Animali cane = new Cane();
		Animali aquila = new Aquila();
		Animali delfino = new Delfino();
		Animali passerotto = new Passerotto();
		
		System.out.println("Il cane...");
		cane.dormi();
		cane.faiVerso();
		cane.mangia();
		
		System.out.println("Il delfino...");
		delfino.dormi();
		delfino.faiVerso();
		delfino.mangia();
		
		System.out.println("Il passerotto...");
		passerotto.dormi();
		passerotto.faiVerso();
		passerotto.mangia();
		
		System.out.println("L'aquila...");
		aquila.dormi();
		aquila.faiVerso();
		aquila.mangia();
	}
}
