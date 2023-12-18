package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula, nombre, apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos= new ArrayList<Telefono>();
	
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public void imprimirDetalle () {
		System.out.println("Información del Contacto \n" + "Cédula: " + this.cedula + "\n" + "Nombre: " + this.nombre + "\n" + "Apellido: " + this.apellido + "\n" + 
				"Dirección: \n" + "Calle Principal: " +this.direccion.getCallePrincipal() + "\n" + "Calle Secundaria: " + this.direccion.getCalleSecundaria() 
	);
	}
	
	public void imprimirDetalleAct () {
		System.out.println("Información del Contacto (actualizada) \n" + "Cédula: " + this.cedula + "\n" + "Nombre: " + this.nombre + "\n" + "Apellido: " + this.apellido + "\n" + 
				"Dirección: \n" + "Calle Principal: " +this.direccion.getCallePrincipal() + "\n" + "Calle Secundaria: " + this.direccion.getCalleSecundaria() 
	);
	}
	
	public void imprimirDetalleV2 () {
		System.out.println("***" + this.nombre + " " + this.apellido + "***" +"\n" + 
				"Dirección: " + this.direccion.getCallePrincipal() + " y " + this.direccion.getCalleSecundaria() 
	);
	}
	
	public void mostrarTelefonos () {
		System.out.println("Teléfono con estado 'C':");
		for (Telefono telefono : telefonos) {
			telefono.imprimirDetalle();
		}
	}
	
	public void mostrarIncorrectos () {
		int incorrectos = 0;
		for (Telefono telefono : telefonos) {
			if(telefono.getEstado().equals("E")) {
				incorrectos = incorrectos + 1;
			}
		}
		System.out.println("Incorrectos: " + incorrectos);
	}
	
}
