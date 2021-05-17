package ooavc;

import ooavc.Conta;
import ooavc.ContaPoupanca;

public class TestaConta {
	public static void main(String[] args) {
		ContaPoupanca c1 = new ContaPoupanca();

		c1.id = 033;
		c1.setTitular("Erick");
		c1.setSaldo(2900);
		c1.setLimite(1000);

		if (c1.Saque(5000) == true) {
			System.out.println("Saque efetuado. Seu novo saldo e: " + c1.getSaldo());
		} else {
			System.out.println("Saque não autorizado");
		}

		System.out.println(c1.Tostring());
	}
}
