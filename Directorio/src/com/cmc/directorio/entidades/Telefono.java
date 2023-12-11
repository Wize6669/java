package com.cmc.directorio.entidades;

public class Telefono {
	private String operadora;
	private String numero;
	private int codigo;
	private boolean tieneWhatsapp;

	public Telefono(String operadora, String numero, int codigo) {
		super();
		this.operadora = operadora;
		this.numero = numero;
		this.codigo = codigo;
		this.tieneWhatsapp = false;
	}

	public String getNumero() {
		return numero;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setTieneWhatsapp(boolean tieneWhatsapp) {
		this.tieneWhatsapp = tieneWhatsapp;
	}

	public boolean isTieneWhatsapp() {
		return tieneWhatsapp;
	}

	public void imprimir() {
		System.out.println("+-------------------------------+");
		System.out.println("|          DatosTeléfono        |");
		System.out.println("+-------------------------------+");
		System.out.println("Operador: " + operadora);
		System.out.println("Número: " + numero);
		System.out.println("Codigo: " + codigo);
		if (tieneWhatsapp) {
			System.out.println("Tiene Whatsapp: SI ");
		} else {
			System.out.println("Tiene Whatsapp: NO ");
		}
		System.out.println("+-------------------------------+");
	}
}