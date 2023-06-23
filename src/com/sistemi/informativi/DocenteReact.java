package com.sistemi.informativi;

public class DocenteReact implements Docente {

	@Override
	public void spiegaLinguaggio() {
		System.out.println("spiega JavaScript");
	}

	@Override
	public void spiegaFramework() {
		System.out.println("spiega JSX");
	}

	@Override
	public void spiegaArchitettura() {
		System.out.println("spiega l'architettura Virtual DOM");
	}

}
