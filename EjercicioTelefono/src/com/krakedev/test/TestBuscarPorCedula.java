package com.krakedev.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.krakedev.evaluacion.Contacto;
import com.krakedev.evaluacion.Direccion;
import com.krakedev.evaluacion.Directorio;

public class TestBuscarPorCedula {

	public static void main(String[] args) {
		ArrayList<Contacto> contactos= new ArrayList<Contacto>();
		Contacto c1 = new Contacto("1234567890", "Juan", "Pérez");
		Direccion d1 = new Direccion("Av. siempre Viva", "Calle 4");
		c1.setDireccion(d1);
		contactos.add(c1);
		
		Contacto c2 = new Contacto("1234567891", "Pedro", "Diaz");
		Direccion d2 = new Direccion("Av. siempre Viva", "Calle 4");
		c1.setDireccion(d2);
		contactos.add(c2);
		
		
		Contacto c3 = new Contacto("1234567892", "Karina", "Diaz");
		Direccion d3 = new Direccion("Av. siempre Viva", "Calle 4");
		c1.setDireccion(d3);
		contactos.add(c3);
		
		Directorio directorio = new Directorio();
		directorio.setContactos(contactos);
		
		
		System.out.println("-------------------------------");
		System.out.println(directorio.buscarPorCedula("1234567890"));
		System.out.println("-------------------------------");
		SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formateador.format(new Date()));
		directorio.setFechaModificacion(new Date());
		System.out.println(directorio.getFechaModificacion());
	}

}
