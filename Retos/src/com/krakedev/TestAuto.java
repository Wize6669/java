package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		Auto auto2;

		auto1 = new Auto();
		auto2 = new Auto();

		auto1.marca = "Chevrolet sail";
		auto1.anio = 2014;
		auto1.precio = 8000.00;

		System.out.println("Auto 1" + "\n" + "Marca: " + auto1.marca + "\n" + "Anio: " + auto1.anio + "\n" + "Precio: "
				+ auto1.precio);

		System.out.println("---------------------------------");
		auto2.marca = "Volkswagen gol";
		auto2.anio = 2018;
		auto2.precio = 6000.00;

		System.out.println("Auto 2" + "\n" + "Marca: " + auto2.marca + "\n" + "Anio: " + auto2.anio + "\n" + "Precio: "
				+ auto2.precio);
	}
}
