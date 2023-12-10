package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item = new Item("Margarina");
		Item item1 = new Item("Ricacao");

		item.setProductosActuales(20);
		item1.setProductosActuales(20);

		System.out.println("+--------------------------------+");
		System.out.println("|    Productos Iniciales         |");
		System.out.println("+--------------------------------+");
		item.imprimir();
		item1.imprimir();
		System.out.println("");

		item.vender(10);
		item1.vender(5);

		System.out.println("+--------------------------------+");
		System.out.println("|    Productos Vendidos          |");
		System.out.println("+--------------------------------+");
		item.imprimir();
		item1.imprimir();
		System.out.println("");

		item.devolver(5);
		item1.devolver(3);

		System.out.println("+--------------------------------+");
		System.out.println("|    Productos Devueltos         |");
		System.out.println("+--------------------------------+");
		item.imprimir();
		item1.imprimir();
		System.out.println("");

	}

}