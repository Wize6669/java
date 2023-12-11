package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telefono = new Telefono("movi", "0978452615", 65);
		Contacto contacto = new Contacto("Velasques", telefono, 80.56);
		AdminContactos adminContactos = new AdminContactos();

		contacto.imprimir();

		adminContactos.activarUsuario(contacto);

		contacto.imprimir();

	}

}