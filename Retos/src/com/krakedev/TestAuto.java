package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		Auto auto2;

		auto1 = new Auto();
		auto2 = new Auto();

		auto1.setMarca("Chevrolet sail");
		auto1.setAnio(2014);
		auto1.setPrecio(8000.00);

		System.out.println("Auto 1" + "\n" + "Marca: " + auto1.getMarca() + "\n" + "Anio: " + auto1.getAnio() + "\n"
				+ "Precio: " + auto1.getPrecio());

		System.out.println("---------------------------------");
		auto2.setMarca("Volkswagen gol");
		auto2.setAnio(2018);
		auto2.setPrecio(4000.00);

		System.out.println("Auto 2" + "\n" + "Marca: " + auto2.getMarca() + "\n" + "Anio: " + auto2.getAnio() + "\n"
				+ "Precio: " + auto2.getPrecio());

	}
}
