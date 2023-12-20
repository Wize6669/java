package com.krakedev.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles = new ArrayList<Numero>();
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	
	public Naipe() {
		Palo palo = new Palo();
		String[] palos = {palo.getCorazonNegro(), palo.getCorazonRojo(), palo.getDiamante(), palo.getTrebol()};
	
		for(int i = 1; i <= 13; i++) {
			if( i == 1) {
				numerosPosibles.add(new Numero("A", 11));
			}
			else if(i == 11) {
				numerosPosibles.add(new Numero("J", 10));
			}else if(i == 12) {
				numerosPosibles.add(new Numero("Q", 10));
			}else if(i == 13) {
				numerosPosibles.add(new Numero("K", 10));
			}else {
				numerosPosibles.add(new Numero(Integer.toString(i), i));
			}
		}
		
		for (Numero numero : numerosPosibles) {
			for(String paloAux : palos) {
				cartas.add(new Carta(numero, paloAux));
			}
		}
	}
	
	public ArrayList<Numero> getNumerosPosibles() {
		return numerosPosibles;
	}

	public void setNumerosPosibles(ArrayList<Numero> numerosPosibles) {
		this.numerosPosibles = numerosPosibles;
	}



	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	public void mostrarInformacion() {
		System.out.println("Tallaño cartas: " + cartas.size());
	}
	
public ArrayList<Carta> barajar(){
		
		ArrayList<Carta> auxiliar = new ArrayList<Carta>();
		
		for(int i = 1; i <= 100; i++) {
			int posicion = Random.obtenerPosicion();
			Carta carta = cartas.get(posicion);
			if(carta.getEstado().equals("N")) {
				auxiliar.add(carta);
				carta.setEstado("C");
			}
		}
		
		return auxiliar;
	}
}
 
