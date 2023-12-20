package com.krakedev.test;

import java.util.ArrayList;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Naipe;

public class TestNaipe {
	 
	public static void main(String[] args) {
		Naipe naipe = new Naipe();
		ArrayList<Carta> cartasBarajadas = naipe.barajar();

		for (Carta carta : cartasBarajadas) {
		    carta.mostrarInformacionV2();
		}
	}
 
}