package bibliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeCharTeclado {
	public static void main(String[] args) {
		System.out.println("Digite uma �nica tecla: ");
		InputStream is = System.in; // InputStream: classe que sabe capturar um
		/* nesse caso, recebendo-o da entrada padr�o do system */
		InputStreamReader isr = new InputStreamReader(is);
		// ISR sabe receber um byte e transforma-lo em char
		char c;
		try {
			c = (char) isr.read(); // type casting
			System.out.println("Voc� digitou a tecla: " + c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
