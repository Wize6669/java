package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto(101, "Resman de papel bon");
		p1.setDescripcion("El papel bon es de buena calidad");
		p1.setPeso(10.0);

		p1.imprimirDetalleProducto();
		
		System.out.println("-------------");
		p1.setPeso(8.0);
		p1.imprimirDetalleProducto();
	}

}
