package com.krakedev.test;

import com.krakedev.evaluacion.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("1234567890", "Movil");
		t1.imprimirDetalle();
		System.out.println("");
		
		Telefono t2 = new Telefono("9876543210", "Movil");
		t2.imprimirDetalle();
		System.out.println("");
		
		Telefono t3 = new Telefono("9876543", "Convencional");
		t3.imprimirDetalle();
		System.out.println("");
		
		Telefono t4 = new Telefono("12345", "Fijo");
		t4.imprimirDetalle();
		System.out.println("");
		
		Telefono t5 = new Telefono(null, "Movil");
		t5.imprimirDetalle();
		System.out.println("");
	}

}
