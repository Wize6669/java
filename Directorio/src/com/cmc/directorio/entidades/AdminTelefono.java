package com.cmc.directorio.entidades;

import java.util.ArrayList;

public class AdminTelefono {

	public void activarMensajeria(Telefono telefono) {
		telefono.setTieneWhatsapp(verificarMovi(telefono));

	}

	public ArrayList<Telefono> contarMovi(Telefono t1, Telefono t2, Telefono t3) {
		Telefono[] arregloTelefono = { t1, t2, t3 };
		ArrayList<Telefono> arregloTelefonoMovi = new ArrayList<Telefono>();

		for (Telefono elemento : arregloTelefono) {
			if (verificarMovi(elemento)) {
				activarMensajeria(elemento);
				arregloTelefonoMovi.add(elemento);
			}
		}

		return arregloTelefonoMovi;
	}

	public ArrayList<Telefono> contarClaro(Telefono t1, Telefono t2, Telefono t3, Telefono t4) {
		Telefono[] arregloTelefono = { t1, t2, t3, t4 };
		ArrayList<Telefono> arregloTelefonoClaro = new ArrayList<Telefono>();

		for (Telefono elemento : arregloTelefono) {
			if (verificarClaro(elemento)) {
				activarMensajeria(elemento);
				arregloTelefonoClaro.add(elemento);
			}
		}

		return arregloTelefonoClaro;
	}

	public boolean verificarMovi(Telefono t1) {
		if (t1.getOperadora().equals("movi")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verificarClaro(Telefono t1) {
		if (t1.getOperadora().equals("claro")) {
			return true;
		} else {
			return false;
		}
	}

}