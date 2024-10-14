package org.lessons.java.animals;

public class Cane extends Animali implements Nuotare {

	@Override
	public void faiVerso() {
		System.out.println("- Come verso abbaia");
	}

	@Override
	public void mangia() {
		System.out.println("- Mangia crocchette");
	}

	@Override
	public void nuota() {
		System.out.println("- Sto Nuotando!");
	}

}
