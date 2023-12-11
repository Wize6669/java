package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Producto> productosMenores = new ArrayList<Producto>();
		double limite = 0.8;
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("B1"));
		maquina.agregarCelda(new Celda("B2"));
		maquina.agregarCelda(new Celda("C1"));
		maquina.agregarCelda(new Celda("C2"));

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "A1", 7);
		Producto producto2 = new Producto("D456", "Doritos", 0.70);
		maquina.cargarProducto(producto2, "A2", 3);
		Producto producto3 = new Producto("HE04", "Leche", 1);
		maquina.cargarProducto(producto3, "B1", 4);
		Producto producto4 = new Producto("F476", "Ruffles", 0.9);
		maquina.cargarProducto(producto4, "B2", 6);
		Producto producto5 = new Producto("SW07", "Cheetos", 0.50);
		maquina.cargarProducto(producto5, "C1", 8);
		Producto producto6 = new Producto("GR25", "Cocoa", 1.25);
		maquina.cargarProducto(producto6, "C2", 7);

		productosMenores = maquina.buscarMenores(limite);

		System.out.println("Productos menores:" + productosMenores.size());
		for (Producto elemento : productosMenores) {
			System.out.println("+----------------------------------+");
			System.out.println("|          DatosProducto           |");
			System.out.println("+----------------------------------+");
			if (elemento != null) {
				System.out.println("Nombre del producto: " + elemento.getNombre());
				System.out.println("Precio del producto: " + elemento.getPrecio());
			} else {
				System.out.println("No hay productore con precio menor que: " + limite);
			}
		}
	}

}