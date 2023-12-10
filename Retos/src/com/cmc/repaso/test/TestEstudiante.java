package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("William");
		
		e1.calificar(7);
		e1.imprimirResultado();

	}

}
