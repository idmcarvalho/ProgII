package bibliotecas;

public class TestaToString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente1 c1 = new Cliente1();
		System.out.println(c1.toString()); // gera um hash, exemplo bibliotecas.Cliente1@26f0a63f
		System.out.println(c1);

		Cliente2 c2 = new Cliente2("Java");
		System.out.println(c2.toString());
		System.out.println(c2);
	}
}
