package ooavc;

public class TestaPolimorfismo1 {

	public static void main(String[] args) {
		/*Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		double salFunc = f1.getSalario();
		System.out.println("O salario do funcion�rio 1 �: "+salFunc);
		System.out.println("O bonus do funcion�rio f1 �: "+f1.getBonus()); */

		Gerente g1 = new Gerente();
		g1.setSalario(15000);
		double salGen = g1.getSalario();

		System.out.println("O salario do gerente g1 �: " + salGen);
		System.out.println("O bonus do gerente g1 �: " + g1.getBonus());
	}

}
