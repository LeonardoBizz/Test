package com.sistemi.informativi;

public class AziendaInformatica extends Azienda {

	@Override
	public void assume() {
		System.out.println("assume sviluppatori/sistemisti");
	}
	
	@Override
	public void produce() {
		System.out.println("produce software/hardware");
	}

}
