package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {
	public static void main(String[] args) {
		Producto p1 = new Producto("Escoba", 10);
		System.out.println(p1.calcularPrecioPromo(10));
	}
}
