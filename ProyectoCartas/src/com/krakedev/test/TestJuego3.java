package com.krakedev.test;

import com.krakedev.servicios.Juego;

import java.util.ArrayList;

public class TestJuego3 {
	public static void main(String[] args) {
		ArrayList<Integer> idsJugadores = new ArrayList<Integer>();
		idsJugadores.add(1);
        idsJugadores.add(2);
        idsJugadores.add(3);
		Juego juego = new Juego(idsJugadores);
		juego.entregarCartas(5);
		juego.imprimirCartasJugadores();
		System.out.println("");
		System.out.println("-----------------------");
		System.out.println("Total ");
		for (int i=1; i<=idsJugadores.size(); i++) {
			System.out.println("Jugador " + i + ": " +juego.devolverTotal(i));
		}
	}
}