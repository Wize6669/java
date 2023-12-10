package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private double saldo;

	public Cuenta(String id) {
		this.id = id;
		this.tipo = "A";
	}

	public Cuenta(String id, String tipo, double saldo) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public String getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void imprimirDetalle() {
		System.out.println("******************");
		System.out.println("CUENTA");
		System.out.println("******************");
		System.out.println("Numero de Cuenta: " + id);
		System.out.println("Tipo: " + tipo);
		System.out.println("Saldo: USD " + saldo);
		System.out.println("******************");
	}
	
	public void imprimirConMiEstilo() {
		String reset = "\u001B[0m";
        String yellowBold = "\u001B[1;33m";
        String cyanBold = "\u001B[1;36m";
        
        System.out.println(yellowBold + "--------------------" + reset);
        System.out.println(yellowBold + "CUENTA" + reset);
        System.out.println(yellowBold + "--------------------" + reset);
        System.out.println("Numero de Cuenta: " + cyanBold + id + reset);
        System.out.println("Tipo: " + cyanBold + tipo + reset);
        System.out.println("Saldo: USD " + cyanBold + saldo + reset);
        System.out.println(yellowBold + "--------------------" + reset);
	}
	
	

}
