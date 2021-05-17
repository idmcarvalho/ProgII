package ooavc;

public class TestaConta4 {
	public static void main(String[] args) {
		Conta c1 = new Conta(); // instaciando
		c1.id = 001;
		c1.titular = "Igor";

		Conta c2 = new Conta(); // instanciando
		c2.id = 001;
		c2.titular = "Igor";

		if (c1 == c2) {
			System.out.println("As contas são iguais");
		} else {
			System.out.println("As contas NÃO são iguais");
		}
	}
}