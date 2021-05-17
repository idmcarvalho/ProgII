package ooavc;

public abstract class FuncionarioEspecial extends Funcionario {

	public boolean verifica(int senha) {
		return false;
	}

	double getBonus() {
		return 0;
	}

}
