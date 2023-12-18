package com.krakedev.evaluacion;

public class Direccion {
	private String callePrincipal, calleSecundaria;

	public Direccion(String callePrincipal, String calleSecundaria) {
		this.callePrincipal = callePrincipal;
		this.calleSecundaria = calleSecundaria;
	}

	public String getCallePrincipal() {
		return callePrincipal;
	}

	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}

	public String getCalleSecundaria() {
		return calleSecundaria;
	}

	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}
	
	public void imprimirDetalle () {
		System.out.println("Calle Principal: " + this.callePrincipal + "\n" + "Calle Secundaria: " + this.calleSecundaria);
	}
	
	public void imprimirDetalleActualizado () {
		System.out.println("Calle Principal (actualizada): " + this.callePrincipal + "\n" + "Calle Secundaria(actualizada): " + this.calleSecundaria);
	}

	@Override
	public String toString() {
		return "Direccion [callePrincipal=" + callePrincipal + ", calleSecundaria=" + calleSecundaria + "]";
	}

}
