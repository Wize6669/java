package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private ArrayList<Celda> celdas = new ArrayList<Celda>();
	private double saldo;

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}

	public void mostrarConfiguracion() {
		int i = 1;
		for (Celda elemento : celdas) {
			System.out.println("Código de la celda " + i + " es: " + elemento.getCodigo());
			i++;
		}
	}

	public Celda buscarCelda(String codigoCelda) {
		for (Celda elemento : celdas) {
			if (elemento.getCodigo().equals(codigoCelda)) {
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

		for (Celda elemento : celdas) {
			System.out.println("+----------------------------------+");
			System.out.println("|          DatosProducto           |");
			System.out.println("+----------------------------------+");
			System.out.println("COdigo de la celda: " + elemento.getCodigo());
			System.out.println("Stock de la celda: " + elemento.getStock());
			if (elemento.getProducto() != null) {
				System.out.println("Nombre del producto: " + elemento.getProducto().getNombre());
				System.out.println("Precio del producto: " + elemento.getProducto().getPrecio());
			} else {
				System.out.println("Sin productos asignados");
			}
		}

		System.out.println("Stock de la celda: " + saldo);
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
		this.saldo += celdaEncontrada.getProducto().getPrecio();
		double cambio = ingresoDinero - this.saldo;

		return cambio;
	}

	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> productosMenores = new ArrayList<Producto>();
		for (Celda elemento : celdas) {
			if (elemento.getProducto().getPrecio() <= limite) {
				productosMenores.add(elemento.getProducto());
			}
		}
		return productosMenores;
	}

}