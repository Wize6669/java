package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telefono = new Telefono("movi", "0999390119", 12);
		Contacto contacto = new Contacto("Paucar", telefono, 60.53);

		contacto.imprimir();

	}

}