package ooavc;

public class Caixa extends Conta {
	int senha;
	
	public boolean verifica(int senha) {
		return false;
	}
	
	double getBonus() {
		return 0;
	}
	
}


