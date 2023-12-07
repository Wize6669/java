package com.krakedev;

public class Calculadora {
	public double sumar(double valor1, double valor2) {
		return valor1 + valor2;
	}

	public double restar(double valor1, double valor2) {
		return valor1 - valor2;
	}

	public double multiplicar(double valor1, double valor2) {
		return valor1 * valor2;
	}

	public double dividir(double valor1, double valor2) {
		if (valor2 == 0 || Double.isInfinite(valor2)) {
			throw new ArithmeticException("División por cero o infinito no permitida");
		}
		return valor1 / valor2;
	}

	public double promediar(double valor1, double valor2, double valor3) {
		double resultado = (valor1 + valor2 + valor3) / 3;
		return resultado;
	}

	public void mostrarResultado() {
		System.out.println("Ahorita no joven, Sali al almuerzo. Regreso en 15 minutos");
	}

}
