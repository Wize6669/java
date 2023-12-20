package com.krakedev.test;


import java.util.ArrayList;
import java.util.List;

import com.krakedev.servicios.Juego;

public class TestGanador {

	public static void main(String[] args) {
        ArrayList<Integer> idsJugadores = new ArrayList<>(List.of(1, 2, 3));
        Juego juego = new Juego(idsJugadores);

        juego.entregarCartas(5);

        for (Integer jugadorId : idsJugadores) {
            int total = juego.devolverTotal(jugadorId);
            System.out.println("Total de jugador " + jugadorId + ": " + total);
        }

        int ganador = juego.determinarGanador();
        System.out.println("El ganador es: Jugador " + ganador);
    }
}

