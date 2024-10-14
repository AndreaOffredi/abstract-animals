package org.lessons.java.animals;

public class Delfino extends Animali implements Nuotare{

	@Override
	public void faiVerso() {
		System.out.println("- Come verso frigge");
	}

	@Override
	public void mangia() {
		System.out.println("- Mangia pesci");
	}

	@Override
	public void nuota() {
		System.out.println("- Sto nuotando!");
	}

}
