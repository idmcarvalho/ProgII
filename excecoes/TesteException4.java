package excecoes;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TesteException4 {
	public static void metodo1() throws FileNotFoundException {
		new FileReader("C:\\arquivoDeTeste.txt");
	}
}
