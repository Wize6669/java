package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {
	public static void main(String[] args) {
		Celda celda = new Celda("A1");
		// Clase: Producto, línea 19
		System.out.println(celda.getProducto().getNombre());
		System.out.println("CELDA:" + celda.getProducto());
		// Clase: Producto, línea 19
		System.out.println("Nombre Producto:" + celda.getProducto().getNombre());
		// Clase: Producto, línea 31
		System.out.println("Precio Producto:" + celda.getProducto().getPrecio());
		// Clase: Producto, línea 43
		System.out.println("C�digo Producto:" + celda.getProducto().getCodigo());
		System.out.println("STOCK:" + celda.getStock());
		System.out.println("*************************************");
	}
}