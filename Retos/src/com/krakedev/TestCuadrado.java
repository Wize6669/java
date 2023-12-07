package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado();
		c1.lado = 4;
		System.out.println("Perimentro de c1:" + c1.calcularPerimetro());
		System.out.println("Area de c1:" + c1.calcularArea());

		System.out.println("-------------------------------");
		Cuadrado c2 = new Cuadrado();
		c2.lado = 2;
		System.out.println("Perimentro de c2:" + c2.calcularPerimetro());
		System.out.println("Area de c2:" + c2.calcularArea());

		System.out.println("-------------------------------");
		Cuadrado c3 = new Cuadrado();
		c3.lado = 8;
		System.out.println("Perimentro de c3:" + c3.calcularPerimetro());
		System.out.println("Area de c3:" + c3.calcularArea());

	}

}
