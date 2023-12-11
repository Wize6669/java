package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1 = new Celda("A1");
	private Celda celda2 = new Celda("A2");
	private Celda celda3 = new Celda("A3");
	private Celda celda4 = new Celda("A4");
	private double saldo;

	public void configurarMaquina(String c1, String c2, String c3, String c4) {
		this.celda1.setCodigo(c1);
		this.celda2.setCodigo(c2);
		this.celda3.setCodigo(c3);
		this.celda4.setCodigo(c4);
	}

	public void mostrarConfiguracion() {
		Celda[] celdas = { celda1, celda2, celda3, celda4 };
		for (Celda elemento : celdas) {
			imprimir(elemento);
		}

		System.out.println("+-------------------------------+");
		System.out.println("|          DatosSaldo           |");
		System.out.println("+-------------------------------+");
		System.out.println("SALDO: " + saldo);

	}

	public void imprimir(Celda celda) {
		System.out.println("+-------------------------------+");
		System.out.println("|          DatosCelda           |");
		System.out.println("+-------------------------------+");
		System.out.println("Codigo: " + celda.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		Celda[] celdas = { celda1, celda2, celda3, celda4 };
		for (Celda elemento : celdas) {
			if (elemento.getCodigo().equals(codigo)) {
				return elemento;
			}
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigo, int stock) {
		Celda celdaRecuperada = buscarCelda(codigo);
		ingresarProducto(celdaRecuperada, producto, stock);
	}

	public void ingresarProducto(Celda celdaRecuperada, Producto producto, int stock) {
		celdaRecuperada.setProducto(producto);
		celdaRecuperada.setStock(stock);
	}

	public void mostrarProductos() {
		Celda[] celdas = { celda1, celda2, celda3, celda4 };
		for (Celda elemento : celdas) {
			System.out.println("+-------------------------------+");
			System.out.println("|          DatosCelda           |");
			System.out.println("+-------------------------------+");
			System.out.println("SALDO: " + saldo);
			System.out.println("Codigo: " + elemento.getCodigo());
			System.out.println("Stock: " + elemento.getStock());
			if (elemento.getProducto() != null) {
				System.out.println("Nombre del producto: " + elemento.getProducto().getNombre());
				System.out.println("Precio del producto: " + elemento.getProducto().getPrecio());
				System.out.println("Codigo del producto: " + elemento.getProducto().getCodigo());
			} else {
				System.out.println("La celda no contiene productos");
			}
		}
	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			return celdaRecuperada.getProducto();
		}
		return null;

	}

	public double consultarPrecio(String codigoCelda) {
		return buscarProductoEnCelda(codigoCelda).getPrecio();
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		Celda[] celdas = { celda1, celda2, celda3, celda4 };
		for (Celda elemento : celdas) {
			Producto producto = elemento.getProducto();
			if (producto != null) {
				if (producto.getCodigo().equals(codigoProducto)) {
					return elemento;
				}
			}
		}
		return null;
	}

	public void incrementarProductos(String codigoProducto, int incrementarStock) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(celdaEncontrada.getStock() + incrementarStock);
	}

	public void vender(String codigoCelda) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		this.saldo += celdaEncontrada.getProducto().getPrecio();

		mostrarProductos();
	}

	public double venderConCambio(String codigoCelda, double ingresoDinero) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		double cambio = ingresoDinero - this.saldo;

		return cambio;
	}
}