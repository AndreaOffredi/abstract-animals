package org.lessons.java.animals;

public class Passerotto extends Animali implements Volare{

	@Override
	public void faiVerso() {
		System.out.println("- Come verso Cinguettio");
	}

	@Override
	public void mangia() {
		System.out.println("- Mangia semi");
	}

	@Override
	public void vola() {
		System.out.println("- Sto volando!");
	}

}
