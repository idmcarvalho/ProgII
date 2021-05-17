package ooavc;

public class ControleBonus {

	private double totalBonus = 0;

	public double getTotalBonus() {
		return totalBonus;
	}

	public void setTotalBonus(Funcionario funcionario) {
		this.totalBonus += funcionario.getBonus();
	}

}
