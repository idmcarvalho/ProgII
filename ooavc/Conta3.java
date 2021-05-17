package ooavc;

//testado em TestaConta5
public class Conta3 {
	private static int contadorContas = 0;
	private int id;
	private TitularConta titular;
	private double saldo;
	private double limite;
	
	public Conta3(int id, String nome, double saldo, double limite) {
		super();
		this.id = id;
		this.titular = new TitularConta();
		this.titular.setNome(nome);
		this.saldo = saldo;
		this.limite = limite;
		contadorContas++;
	}
	
	public static int getContador() {
		return Conta3.contadorContas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public TitularConta getTitular() {
		return titular;
	}

	public void setTitular(TitularConta titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public boolean Saque(double valor) {
		if (valor > this.saldo + this.limite) {
			return false;
		}
		else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	public double Deposito(double valor) {
		return saldo + valor;
	}
	
	public String Tostring() {
		return "ID: " + this.id 
				+ "\nNome: " + this.titular
				+ "\nSaldo: " + this.saldo
				+ "\nLimite: " + this.limite;
	}
}
		
	