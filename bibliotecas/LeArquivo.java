package bibliotecas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeArquivo {
	public static void main(String[] args) {
		System.out.println("Digite uma mensagem: ");
		InputStream is = System.in; // InputStream: classe que sabe capturar um
		/* nesse caso, recebendo-o da entrada padr�o do system */
		InputStreamReader isr = new InputStreamReader(is);
		// ISR sabe receber um byte e transforma-lo em char
		BufferedReader br = new BufferedReader(isr);
		/*BR sabe receber v�rios char e armazen�-los num buffer, transformando-os em String
		char c; */
		String s;
		try {
			//c = (char) isr.read(); // type casting
			//System.out.println("Voc� digitou a tecla: " + c);
			s = br.readLine();
			System.out.println("Voc� digitou a mensagem: " +s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
