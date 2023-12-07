package com.krakedev;

public class Rectangulo {
	public double base;
	public double altura;
	
	public double calcularArea() {
		return base*altura;
	}  
	
	public double calcularPerimetro() {
		return (2*base)+(2*altura);
	}  

}
