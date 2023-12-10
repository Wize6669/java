package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	public Item(String nombre) {
		this.nombre = nombre;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public void imprimir() {

		System.out.println("+--------------------------------+");
		System.out.println("           PRODUCTO               ");
		System.out.println("+--------------------------------+");
		System.out.println("Nombre del producto: " + this.nombre);
		System.out.println("Productos actuales: " + this.productosActuales);
		System.out.println("Productos vendidos: " + this.productosVendidos);
		System.out.println("Productos devueltos: " + this.productosDevueltos);

	}

	public void vender(int productosVendidos) {

		this.productosActuales -= productosVendidos;
		this.productosVendidos += productosVendidos;

	}

	public void devolver(int productosDevueltos) {

		this.productosActuales += productosDevueltos;
		this.productosVendidos -= productosDevueltos;
		this.productosDevueltos += productosDevueltos;
	}

}