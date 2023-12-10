package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado(4);

		System.out.println("Perimentro de c1:" + c1.calcularPerimetro());
		System.out.println("Area de c1:" + c1.calcularArea());

		System.out.println("-------------------------------");
		Cuadrado c2 = new Cuadrado(2);
		System.out.println("Perimentro de c2:" + c2.calcularPerimetro());
		System.out.println("Area de c2:" + c2.calcularArea());

		System.out.println("-------------------------------");
		Cuadrado c3 = new Cuadrado(8);
		System.out.println("Perimentro de c3:" + c3.calcularPerimetro());
		System.out.println("Area de c3:" + c3.calcularArea());

	}

}
