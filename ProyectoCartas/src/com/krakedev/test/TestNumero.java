package com.krakedev.test;

import com.krakedev.entidades.Numero;

public class TestNumero {

	public static void main(String[] args) {
		Numero n1 = new Numero("A", 11);
		n1.mostrarInformacion();
		
		Numero n2 = new Numero("Q", 10);
		n2.mostrarInformacion();
		
		Numero n3 = new Numero("4", 4);
		n3.mostrarInformacion();
		
	}

}
