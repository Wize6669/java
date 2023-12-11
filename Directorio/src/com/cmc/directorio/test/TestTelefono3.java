package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono t1 = new Telefono("claro", "0999390119", 63);
		Telefono t2 = new Telefono("movi", "0991455678", 2);
		Telefono t3 = new Telefono("movi", "0985265755", 12);
		AdminTelefono adminTelefono = new AdminTelefono();

		for (Telefono elemento : adminTelefono.contarMovi(t1, t2, t3)) {
			elemento.imprimir();
		}
	}

}