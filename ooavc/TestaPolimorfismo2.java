package ooavc;

public class TestaPolimorfismo2 {

	public static void main(String[] args) {
		Gerente g2 = new Gerente();
		g2.setSalario(15000);

		System.out.println("Salario do gerente g2: " + g2.getSalario());
		System.out.println("Bonus do gerente g2: " + g2.getBonus());
	}

}
