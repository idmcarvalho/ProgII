package bibliotecas;

public class TestaString1 {

	public static void main(String[] args) {
		String a = new String("Java ADS na veia"); // só funciona a diferença ao instanciar o objeto, sem o new funciona
													// como timo não primitivo/objeto
		String b = new String("Java ADS na veia");
		// String a = "Java ADS na veia";
		// String b = "Java ADS na veia";
		// int a = 2; //tipo primitivo, o comportamento é diferente
		// int b = 2; //tipo primitivo, o comportamento é diferente
		if (a == b) {
			System.out.println("a e b são iguais (mesmo objeto");
		} else {
			System.out.println("a e b são objetos diferentes");
		}
		// se quero comparar o conteúdo de um objeto String, é necessário usar o método
		// equals
//		if (a.equals(b)) { //testa o conteúdo do objeto String
//			System.out.println("a e b são iguais (testa o conteúdo");
//		} else {
//			System.out.println("a e b são objetos diferentes");
	}
}
