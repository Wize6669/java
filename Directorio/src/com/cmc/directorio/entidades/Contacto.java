package com.cmc.directorio.entidades;

public class Contacto {
	private String apellido;
	private boolean activo;
	private Telefono telefono;
	private double peso;

	public Contacto(String apellido, Telefono telefono, double peso) {
		this.apellido = apellido;
		this.telefono = telefono;
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public void imprimir() {
		System.out.println("+-------------------------------+");
		System.out.println("|          DatosContacto        |");
		System.out.println("+-------------------------------+");
		System.out.println("Apellido: " + apellido);
		System.out.println("Peso: " + peso);
		if (activo) {
			System.out.println("Contacto Activo: SI ");
		} else {
			System.out.println("Contacto Activo: NO ");
		}
		System.out.println("Operadora: " + telefono.getOperadora());
		System.out.println("Número: " + telefono.getNumero());
		System.out.println("+-------------------------------+");
	}

}