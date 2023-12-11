package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telefono = new Telefono("movi", "0999390119", 15);
		Contacto contacto1 = new Contacto("Paucar", telefono, 65.5);
		Telefono telefono2 = new Telefono("claro", "0932584110", 8);
		Contacto contacto2 = new Contacto("Vega", telefono2, 75.6);
		AdminContactos adminContactos = new AdminContactos();
		AdminTelefono adminTelefono = new AdminTelefono();

		adminTelefono.activarMensajeria(telefono);
		adminTelefono.activarMensajeria(telefono2);

		System.out.println("+-------------------------------+");
		System.out.println("|       ContactoMasPesado       |");
		System.out.println("+-------------------------------+");

		Contacto contactoMasPesado = adminContactos.buscarMasPesado(contacto1, contacto2);

		if (contactoMasPesado != null) {
			contactoMasPesado.imprimir();
		} else {
			System.out.println("Ambos contactos pesan igual");
		}

		if (adminContactos.compararOperadoras(contacto1, contacto2)) {
			System.out.println("+-------------------------------+");
			System.out.println("|       ContactosComparados     |");
			System.out.println("+-------------------------------+");
			contacto1.imprimir();
			contacto2.imprimir();
		}

	}

}