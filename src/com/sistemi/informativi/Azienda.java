package com.sistemi.informativi;

//una classe astratta rappresenta un indice applicativo
public abstract class Azienda {

	/*
	 * ha senso utilizzare una classe astratta come indice indicativo nel caso
	 * in cui esistono dei metodi comuni a tutti i tipi che avranno sicuramente
	 * delle diverse implementazioni e altri che sono comuni ai figli ma
	 * hanno identiche implementazioni
	 */
	public abstract void assume();
	
	public abstract void produce();
	
	public void fattura() {
		System.out.println("fattura con iva al 22%");
	}
}
