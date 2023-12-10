package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion v1 = new Validacion();
		
		System.out.println(v1.validadorMonto(1));
		System.out.println(v1.validadorMonto(-1));
	}

}
