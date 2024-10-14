package org.lessons.java.animals;

public abstract class Animali {
	
	//void dormi() (mostra a video “Zzz”) 
	public void dormi() {
		System.out.println("- Quando dorme fa: ZzZzZz");
	}
	
	//mostra a video il verso fatto dall'animale specifico
	public abstract void faiVerso();
	
	//mostra a video quello che mangia : erba, carne, ...?
	public abstract void mangia();
}
