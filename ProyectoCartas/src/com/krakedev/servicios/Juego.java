package com.krakedev.servicios;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Naipe;

import java.util.ArrayList;

public class Juego {
	private Naipe naipe = new Naipe();
	private ArrayList<ArrayList<Carta>> cartasJugadores = new ArrayList<ArrayList<Carta>>();
	ArrayList<Carta> naipeBarajado = new ArrayList<Carta>();
	
	public Juego(ArrayList<Integer> idsJugadores) {
		naipeBarajado = naipe.barajar();
		for(int i = 0; i < idsJugadores.size(); i++) {
			cartasJugadores.add(new ArrayList<Carta>());
		}
	}
	
	public Juego() {
	naipeBarajado = naipe.barajar();
	}
	
	public void imprimirTamaño() {
		int i = 1;
		for(ArrayList<Carta> cartas : cartasJugadores) {
			System.out.println("El número de cartas que tiene el jugador " + i + " es " +cartas.size());
			i++;
		}
	}
	
	public void imprimirCartasJugadores() {
		int i = 1;
		for(ArrayList<Carta> cartas : cartasJugadores) {
			System.out.println("\n Jugador " + i);
			for(Carta carta : cartas) {
				System.out.println(" " + carta.getNumero().getNumeroCarta() + "-" + carta.getPalo());
			}
			i++;
		}
	}
	
	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}
	
	public void entregarCartas (int cartasPorJugador) {
		for(int i=0 ; i < cartasPorJugador; i++) {
			for(int j=0; j < cartasJugadores.size(); j++) {
				if(naipeBarajado.size() > 0) {
					cartasJugadores.get(j).add(naipeBarajado.remove(0));
				}
			}
		}
	}
	
    public int devolverTotal(int jugadorId) {
        if (jugadorId < 1 || jugadorId > cartasJugadores.size()) {
            System.out.println("Error: ID de jugador no válido");
            return -1;
        }

        int total = 0;
        ArrayList<Carta> cartasJugador = cartasJugadores.get(jugadorId - 1);

        for (Carta carta : cartasJugador) {
            total += carta.getNumero().getValor();
        }

        return total;
    }
    
    public int determinarGanador() {
        if (cartasJugadores.isEmpty()) {
            System.out.println("Error: No hay jugadores");
            return -1;
        }

        int idGanador = 1;
        int sumaGanador = devolverTotal(idGanador);

        for (int i = 2; i <= cartasJugadores.size(); i++) {
            int sumaActual = devolverTotal(i);

            if (sumaActual >= sumaGanador) {
                idGanador = i;
                sumaGanador = sumaActual;
            }
        }

        return idGanador;
    }

}

