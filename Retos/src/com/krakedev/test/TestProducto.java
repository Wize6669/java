package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		Producto productoB;
		Producto productoC;

		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();

		String productoANombre = "Aspirinas";
		String productoADescripcion = "Las Aspirinas, un nombre que ha sido sinónimo de alivio y bienestar durante décadas, "
				+ "\n"
				+ "representan un hito en el mundo de los analgésicos y antiinflamatorios. Este icónico medicamento, "
				+ "\n"
				+ "desarrollado con precisión científica, se ha convertido en un aliado confiable para millones de"
				+ "\n" + " personas en todo el mundo.";
		double productoAPrecio = 0.80;

		productoA.setNombre(productoANombre);
		productoA.setDescripcion(productoADescripcion);
		productoA.setPrecio(productoAPrecio);

		System.out.println("Producto 1" + "\n" + "Nombre: " + productoA.getNombre() + "\n" + "Descripcion: "
				+ productoA.getDescripcion() + "\n" + "Precio: " + productoA.getPrecio());

		System.out.println("---------------------------------");

		String productoBNombre = "Suero oral";
		String productoBDescripcion = "El Suero Oral, una solución acuosa cuidadosamente formulada, representa un avance "
				+ "\n"
				+ "significativo en el cuidado de la salud, especialmente en situaciones que involucran la pérdida "
				+ "\n"
				+ "de líquidos y electrolitos. Diseñado para restablecer el equilibrio hídrico y mineral del cuerpo, "
				+ "\n" + "el Suero Oral se ha convertido en una herramienta esencial para combatir la deshidratación.";
		double productoBPrecio = 1.50;

		productoB.setNombre(productoBNombre);
		productoB.setDescripcion(productoBDescripcion);
		productoB.setPrecio(productoBPrecio);

		System.out.println("Producto 2" + "\n" + "Nombre: " + productoB.getNombre() + "\n" + "Descripcion: "
				+ productoB.getDescripcion() + "\n" + "Precio: " + productoB.getPrecio());
		System.out.println("---------------------------------");

		String productoCNombre = "Crema hidratante nivea facial";
		String productoCDescripcion = "La Crema Hidratante Facial Nivea es una obra maestra de cuidado de la piel, diseñada "
				+ "\n" + "para proporcionar una hidratación intensiva y duradera, revelando una piel suave, radiante y "
				+ "\n"
				+ "saludable. Formulada por expertos en cuidado dermatológico, esta crema ha sido un pilar confiable "
				+ "\n" + "en la rutina diaria de belleza de millones de personas en todo el mundo.";
		double productoCPrecio = 2.00;

		productoC.setNombre(productoCNombre);
		productoC.setDescripcion(productoCDescripcion);
		productoC.setPrecio(productoCPrecio);

		System.out.println("Producto 3" + "\n" + "Nombre: " + productoC.getNombre() + "\n" + "Descripcion: "
				+ productoC.getDescripcion() + "\n" + "Precio: " + productoC.getPrecio());

	}

}
