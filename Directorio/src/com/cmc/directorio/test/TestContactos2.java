package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Telefono telefono = new Telefono("movi", "0958417522", 15);
		Contacto contacto1 = new Contacto("Chnchin", telefono, 75.5);
		Telefono telefono2 = new Telefono("movi", "0932584110", 8);
		Contacto contacto2 = new Contacto("Vega", telefono2, 85.6);
		AdminContactos adminContactos = new AdminContactos();
		AdminTelefono adminTelefono = new AdminTelefono();

		adminTelefono.activarMensajeria(telefono);
		adminTelefono.activarMensajeria(telefono2);

		System.out.println("+-------------------------------+");
		System.out.println("|       ContactoMasPesado       |");
		System.out.println("+-------------------------------+");
		adminContactos.buscarMasPesado(contacto1, contacto2).imprimir();

		if (adminContactos.compararOperadoras(contacto1, contacto2)) {
			System.out.println("+-------------------------------+");
			System.out.println("|       ContactosComparados     |");
			System.out.println("+-------------------------------+");
			contacto1.imprimir();
			contacto2.imprimir();
		}

	}

}