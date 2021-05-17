package ooavc;

public class TestaConta5 {

	public static void main(String[] args) {

		Conta3 c3 = new Conta3(001, "Igor", 100, 100);
		System.out.println(c3.getTitular());
		System.out.println(c3.getContador());

		Conta3 c4 = new Conta3(002, "Clayton", 100, 100);
		System.out.println(c4.getTitular());
		System.out.println(c4.getContador());

		Conta3 c5 = new Conta3(003, "Helena", 100, 100);
		System.out.println(c5.getTitular());
		System.out.println(c5.getContador());
	}

}
