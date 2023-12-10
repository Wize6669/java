package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("03476");

		cuenta1.setSaldo(675);

		Cuenta cuenta2 = new Cuenta("03476", "C", 98);

		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");

		System.out.println("--------Valores inciales--------");
		cuenta1.imprimirDetalle();
		cuenta2.imprimirDetalle();
		cuenta3.imprimirDetalle();

		System.out.println("--------Valores modificados--------");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		cuenta1.imprimirDetalle();
		cuenta2.imprimirDetalle();
		cuenta3.imprimirDetalle();

		System.out.println("--------Valores modificados II--------");
		Cuenta cuenta4 = new Cuenta("0987");
		cuenta4.setTipo("A");
		cuenta4.setSaldo(10);

		Cuenta cuenta5 = new Cuenta("0557", "A", 15);
		cuenta5.setTipo("C");
		cuenta5.setSaldo(10);

		Cuenta cuenta6 = new Cuenta("0666");
		cuenta6.setTipo("A");
		cuenta6.setSaldo(0);

		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
	}

}
