package com.krakedev.evaluacion;

import java.util.Date;
import java.util.ArrayList;

public class Directorio {
	private ArrayList<Contacto> contactos = new ArrayList<Contacto>();
	private Date fechaModificacion;
	
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public boolean agregarContactos (Contacto contacto) {
		boolean flag=false;
		contactos.add(contacto);
		flag=true;
		return flag;
	}
	
	public Contacto buscarPorCedula (String cedula) {
		Contacto c = null;
		for (Contacto contacto : contactos) {
			if(contacto.getCedula().equals(cedula)) {
				return c = contacto;
			}
		}
		return c;
	}
	
}
