package com.sistemi.informativi;

public class StudenteLavoratore extends Studente{

	//metodo aggiunto
	public void lavora() {
		System.out.println("lavora");
	}
	
	//sovrascritto il metodo del padre
	@Override
	public void mangia() {
		System.out.println("mangia a mensa");
	}
}
