package com.krakedev.demo;

public class Producto {
	private int codigo;
	private String nombre;
	private String descripcion;
	private double peso;

	public Producto(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void imprimirDetalleProducto() {
		System.out.println("----------------");
		System.out.println("Producto");
		System.out.println("----------------");
		System.out.println("Codigo: " + codigo + "\n" + "Nombre del producto: " + nombre + "\n" + "Descripcion: "
				+ descripcion + "\n" + "Peso: " + peso);
	}

}
