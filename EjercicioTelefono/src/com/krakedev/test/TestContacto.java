package com.krakedev.test;

import com.krakedev.evaluacion.Contacto;
import com.krakedev.evaluacion.Direccion;

public class TestContacto {

	public static void main(String[] args) {
		Contacto c1 = new Contacto("1234567890", "Juan", "Pérez");
		Direccion d1 = new Direccion("Av. siempre Viva", "Calle 4");
		c1.setDireccion(d1);
		c1.imprimirDetalle();
		
		System.out.println("");
		c1.setCedula("9876543210");
		c1.setNombre("Ana");
		c1.setApellido("Gómez");
		d1.setCallePrincipal("Cdl del ejercito");
		d1.setCalleSecundaria("Pasaje 2B");
		c1.imprimirDetalleAct();
	}
}
