package bibliotecas;

public class TestaString1 {

	public static void main(String[] args) {
		String a = new String("Java ADS na veia"); // s� funciona a diferen�a ao instanciar o objeto, sem o new funciona
													// como timo n�o primitivo/objeto
		String b = new String("Java ADS na veia");
		// String a = "Java ADS na veia";
		// String b = "Java ADS na veia";
		// int a = 2; //tipo primitivo, o comportamento � diferente
		// int b = 2; //tipo primitivo, o comportamento � diferente
		if (a == b) {
			System.out.println("a e b s�o iguais (mesmo objeto");
		} else {
			System.out.println("a e b s�o objetos diferentes");
		}
		// se quero comparar o conte�do de um objeto String, � necess�rio usar o m�todo
		// equals
//		if (a.equals(b)) { //testa o conte�do do objeto String
//			System.out.println("a e b s�o iguais (testa o conte�do");
//		} else {
//			System.out.println("a e b s�o objetos diferentes");
	}
}
