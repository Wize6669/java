package com.krakedev.test;

import com.krakedev.evaluacion.Direccion;

public class TestDireccion {

	public static void main(String[] args) {
		Direccion d1 = new Direccion("Calle A", "Calle B");
		d1.imprimirDetalle();
		d1.setCallePrincipal("Nueva Calle");
		d1.setCalleSecundaria("Otra Calle");
		d1.imprimirDetalleActualizado();

	}

}
