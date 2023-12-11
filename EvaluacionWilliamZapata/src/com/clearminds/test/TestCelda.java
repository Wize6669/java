package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {
	public static void main(String[] args) {
		Celda celda=new Celda("A1");
		//Clase Producto línea 19, producto es null y no se puede obtener su nombre
		System.out.println(celda.getProducto().getNombre());//EN ESTA LINEA ES EL ERROR
		//".getProducto" esta null, por esta razon da NullPointerException
		
		System.out.println("CELDA:"+celda.getProducto());
		////Clase Producto línea 19, ".getProducto" esta null y no se puede obtener su nombre
		System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
		//Clase Producto línea 35, ".getProducto" esta null y no se puede obtener su precio
		System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
		//Clase Producto línea 51, ".getProducto" esta null y no se puede obtener su codigo
		System.out.println("Codigo Producto:"+celda.getProducto().getCodigo());
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");
	}
}