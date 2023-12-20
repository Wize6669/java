package com.krakedev.test;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Numero;
import com.krakedev.entidades.Palo;

public class TestCarta {

	public static void main(String[] args) {
		Numero n1 = new Numero("A", 11);
		Palo palo = new Palo();
		Carta c1 = new Carta(n1, palo.getTrebol());
		
		c1.mostrarInformacion();
		
	}

}
