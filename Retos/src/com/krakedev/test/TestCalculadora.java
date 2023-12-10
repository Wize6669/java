package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calculadora;

		calculadora = new Calculadora();
		double resultadoSuma = calculadora.sumar(2, 3);
		double resultadoResta = calculadora.restar(2, 3);
		
		double resultadoMultiplicacion = calculadora.multiplicar(3, 6);
		double resultadoDivision = calculadora.dividir(8, 6);
		double resultadoPromediar = calculadora.promediar(10, 7, 10);

		System.out.println("Suma: " + resultadoSuma);
		System.out.println("Resta: " + resultadoResta);
		System.out.println("-----------------------------");
		System.out.println("Multiplicacion: " + resultadoMultiplicacion);
		System.out.println("Division: " + resultadoDivision);
		System.out.println("Promedio de 3 numeros: " + resultadoPromediar);
		calculadora.mostrarResultado();

	}

}
