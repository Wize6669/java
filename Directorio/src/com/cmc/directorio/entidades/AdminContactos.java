package com.cmc.directorio.entidades;

public class AdminContactos {

	public Contacto buscarMasPesado(Contacto c1, Contacto c2) {
		if (c1.getPeso() > c2.getPeso()) {
			return c1;
		} else if (c1.getPeso() < c2.getPeso()) {
			return c2;
		} else {
			return null;
		}
	}

	public boolean compararOperadoras(Contacto c1, Contacto c2) {
		if (c1.getTelefono().getOperadora() == c2.getTelefono().getOperadora()) {
			return true;
		} else {
			return false;
		}
	}

	public void activarUsuario(Contacto c1) {
		AdminTelefono adminTelefono = new AdminTelefono();
		adminTelefono.activarMensajeria(c1.getTelefono());
		if (c1.getTelefono().isTieneWhatsapp()) {
			c1.setActivo(true);
		}
	}
}