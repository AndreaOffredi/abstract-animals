package org.lessons.java.animals;

public class Main {

	//ESERCIZIO 2 METODO FAIVOLARE
	public static void faiVolare(Volare animale) {
		animale.vola();
	}
	
	//ESERCIZIO 2 METODO FAINUOTARE
	public static void faiNuotare(Nuotare animale) {
		animale.nuota();
	}
	
	public static void main(String[] args) {
		
		Cane cane = new Cane();
		Aquila aquila = new Aquila();
		Delfino delfino = new Delfino();
		Passerotto passerotto = new Passerotto();
		
		System.out.println("Il cane...");
		cane.dormi();
		cane.faiVerso();
		cane.mangia();
		faiNuotare(cane); //implemento il metodo static faiNuotare
		
		System.out.println("Il delfino...");
		delfino.dormi();
		delfino.faiVerso();
		delfino.mangia();
		faiNuotare(delfino);
		
		System.out.println("Il passerotto...");
		passerotto.dormi();
		passerotto.faiVerso();
		passerotto.mangia();
		faiVolare(passerotto); //implemento il metodo static faiVolare
		
		System.out.println("L'aquila...");
		aquila.dormi();
		aquila.faiVerso();
		aquila.mangia();
		faiVolare(aquila);
	}
}
