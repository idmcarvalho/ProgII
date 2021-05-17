package ooavc;

public class ContaCorrente extends Conta {

	public void correcao(double taxa) {
		this.saldo += this.saldo * 1.2;
	}

}
