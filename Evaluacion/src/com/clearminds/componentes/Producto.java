package com.clearminds.componentes;

public class Producto {

	private String nombre;
	private String codigo;
	private double precio;

	public Producto(String codigo, String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void incrementarPrecio(int porcentajeIncremento) {
		this.precio += precio * (porcentajeIncremento / 100);
	}

	public void disminuirPrecio(double cantidadDescuento) {
		this.precio -= cantidadDescuento;
	}

}