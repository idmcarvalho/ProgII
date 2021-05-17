package ooavc;

public class TestaPolimorfismo1 {

	public static void main(String[] args) {
		/*Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		double salFunc = f1.getSalario();
		System.out.println("O salario do funcionário 1 é: "+salFunc);
		System.out.println("O bonus do funcionário f1 é: "+f1.getBonus()); */

		Gerente g1 = new Gerente();
		g1.setSalario(15000);
		double salGen = g1.getSalario();

		System.out.println("O salario do gerente g1 é: " + salGen);
		System.out.println("O bonus do gerente g1 é: " + g1.getBonus());
	}

}
