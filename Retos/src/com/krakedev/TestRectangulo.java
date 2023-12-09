package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r;
		r = new Rectangulo();

		r.setAltura(8);
		r.setBase(10);

		System.out.println("El area del rectangulo es: " + r.calcularArea());
		System.out.println("El perimetro del rectangulo es: " + r.calcularPerimetro());

	}

}
