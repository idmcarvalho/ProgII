package ooavc;

public class Conta {

	protected int id;
	protected String titular;
	protected double saldo;
	protected double limite;

	public Conta() {

	}

	public Conta(int id, String titular, double saldo, double limite) {
		this.id = id;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
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

	public void correcao(double taxa) {
		this.saldo += this.saldo * 1.2;
	}

	public boolean Saque(double valor) {
		if (valor > this.saldo + this.limite) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	public double Deposito(double valor) {
		return saldo + valor;
	}

	public String Tostring() {
		return "ID: " + this.id + "\nNome: " + this.titular + "\nSaldo: " + this.saldo + "\nLimite: " + this.limite;
	}
}
