package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		Producto productoB;
		Producto productoC;

		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();

		productoA.nombre = "Aspirinas";
		productoA.descripcion = "Las Aspirinas, un nombre que ha sido sinónimo de alivio y bienestar durante décadas, "+ "\n"
				+ "representan un hito en el mundo de los analgésicos y antiinflamatorios. Este icónico medicamento, "+ "\n"
				+ "desarrollado con precisión científica, se ha convertido en un aliado confiable para millones de"+ "\n"
				+ " personas en todo el mundo.";
		productoA.precio = 0.80;

		System.out.println("Producto 1" + "\n" + "Nombre: " + productoA.nombre + "\n" + "Descripcion: "
				+ productoA.descripcion + "\n" + "Precio: " + productoA.precio);

		System.out.println("---------------------------------");

		productoB.nombre = "Suero oral";
		productoB.descripcion = "El Suero Oral, una solución acuosa cuidadosamente formulada, representa un avance "+ "\n"
				+ "significativo en el cuidado de la salud, especialmente en situaciones que involucran la pérdida "+ "\n"
				+ "de líquidos y electrolitos. Diseñado para restablecer el equilibrio hídrico y mineral del cuerpo, "+ "\n"
				+ "el Suero Oral se ha convertido en una herramienta esencial para combatir la deshidratación.";
		productoB.precio = 1.50;

		System.out.println("Producto 2" + "\n" + "Nombre: " + productoB.nombre + "\n" + "Descripcion: "
				+ productoB.descripcion + "\n" + "Precio: " + productoB.precio);

		System.out.println("---------------------------------");

		productoC.nombre = "Crema hidratante nivea facial";
		productoC.descripcion = "La Crema Hidratante Facial Nivea es una obra maestra de cuidado de la piel, diseñada "+ "\n"
				+ "para proporcionar una hidratación intensiva y duradera, revelando una piel suave, radiante y "+ "\n"
				+ "saludable. Formulada por expertos en cuidado dermatológico, esta crema ha sido un pilar confiable "+ "\n"
				+ "en la rutina diaria de belleza de millones de personas en todo el mundo.";
		productoC.precio = 2.00;

		System.out.println("Producto 3" + "\n" + "Nombre: " + productoC.nombre + "\n" + "Descripcion: "
				+ productoC.descripcion + "\n" + "Precio: " + productoC.precio);

	}

}
