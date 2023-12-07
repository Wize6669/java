package com.krakedev;

public class Cuadrado {
	double lado;
	
	public double calcularArea() {
		return Math.pow(lado, 2);
	}
	
	public double calcularPerimetro() {
		return 4*lado;
	}
}
