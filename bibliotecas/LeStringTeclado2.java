package bibliotecas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeStringTeclado2 {
	public static void main(String[] args) {
		// System.out.println("Digite uma mensagem: ");
		try {
			InputStream is = new FileInputStream("teste2.txt");
			InputStreamReader isr = new InputStreamReader(is);
			// ISR sabe receber um byte e transforma-lo em char
			BufferedReader br = new BufferedReader(isr);
			/*
			 * BR sabe receber vários char e armazená-los num buffer, transformando-os em
			 * String char c;
			 */
			String s;
			//try {
			//c = (char) isr.read();
			s = br.readLine(); //Obs: o readLine só sabe ler uma unica linha
			//System.out.println("Voce digitou a tecla: ");
			System.out.println(s);
			while(s != null) {
				System.out.println(s);
				s = br.readLine();
			}
			br.close();
			isr.close();
			is.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}