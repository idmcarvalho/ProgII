package excecoes;

import java.io.FileNotFoundException;

public class TesteException5 {

	public static void main(String[] args) {
		TesteException4 t1 = new TesteException4();
		try {
			t1.metodo1();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
