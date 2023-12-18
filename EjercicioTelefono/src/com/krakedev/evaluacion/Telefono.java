package com.krakedev.evaluacion;

public class Telefono {
	private String numero, tipo, estado;

	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		if(numero != null && tipo != null && (tipo.equals("Movil") || tipo.equals("Convencional"))) {
			if((tipo.equals("Movil") && numero.length() == 10) || (tipo.equals("Convencional") && numero.length() == 7)) {
				this.estado = "C";
			}
		} else {
			this.estado = "E";
		}
	}

	public String getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEstado() {
		return estado;
	}
	
	public void imprimirDetalle () {
		System.out.println("Número: " + this.numero + "\n" + "Tipo: " + this.tipo + "\n" + "Estado: " + this.estado);
	}
}
