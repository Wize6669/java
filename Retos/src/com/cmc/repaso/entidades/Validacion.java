package com.cmc.repaso.entidades;

public class Validacion {
	public boolean validadorMonto(double monto) {
		if( monto > 0) {
			return true;
		}
		return false;
	}
}
