package com.sistemi.informativi;

public class DocenteMicrosoft implements Docente {

	@Override
	public void spiegaLinguaggio() {
		System.out.println("spiega C#");
	}

	@Override
	public void spiegaFramework() {
		System.out.println("spiega .NET");
	}

	@Override
	public void spiegaArchitettura() {
		System.out.println("spiega l'architettura IIS");
	}

}
