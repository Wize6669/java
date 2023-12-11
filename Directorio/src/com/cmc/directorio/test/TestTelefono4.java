package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono t1 = new Telefono("claro", "0999390119", 63);
		Telefono t2 = new Telefono("movi", "0991455678", 2);
		Telefono t3 = new Telefono("movi", "0985265755", 12);
		Telefono t4 = new Telefono("claro", "0955269810", 15);
		AdminTelefono adminTelefono = new AdminTelefono();

		for (Telefono elemento : adminTelefono.contarClaro(t1, t2, t3, t4)) {
			elemento.imprimir();
		}
	}

}