package com.krakedev.test;

import com.krakedev.evaluacion.Contacto;
import com.krakedev.evaluacion.Direccion;

public class TestContacto2 {

	public static void main(String[] args) {
		Contacto c1 = new Contacto("1234567890", "Juan", "Pérez");
		Direccion d1 = new Direccion("Av. siempre Viva", "Calle 4");
		c1.setDireccion(d1);
		c1.imprimirDetalleV2();

	}

}
