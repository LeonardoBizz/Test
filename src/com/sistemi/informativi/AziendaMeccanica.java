package com.sistemi.informativi;

public class AziendaMeccanica extends Azienda {

	@Override
	public void assume() {
		System.out.println("assume operai/ingenieri meccanici");
	}
	
	@Override
	public void produce() {
		System.out.println("produce pezzi meccanici");
	}

}
