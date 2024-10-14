package org.lessons.java.animals;

public class Aquila extends Animali implements Volare{

	@Override
	public void faiVerso() {
		System.out.println("- Come verso grido");	
	}

	@Override
	public void mangia() {
		System.out.println("- Mangia piccoli animali");	
	}

	@Override
	public void vola() {
		System.out.println("- Sto volando!");
	}

}
