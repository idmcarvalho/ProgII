package bibliotecas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscreveArquivo {
	public static void main(String[] args) {
		//System.out.println("Digite uma mensagem: ");
		//InputStream is = System.in; // InputStream: classe que sabe capturar um
		/* nesse caso, recebendo-o da entrada padrão do system */
		try {
		OutputStream os = new FileOutputStream("teste3.txt");
		//InputStreamReader isr = new InputStreamReader(is);
		OutputStreamWriter osw = new OutputStreamWtriter(os);
		// ISR sabe receber um byte e transforma-lo em char
		BufferedWtriter bw = new BufferedWriter(osw);
		bw.write("A turma de ADS ama Java");
		bw.close();
		osw.close();
		os.close();
		System.out.println("Escrita realizada com sucesso");
		//BufferedReader br = new BufferedReader(isr);
		/*BR sabe receber vários char e armazená-los num buffer, transformando-os em String
		char c; */
		String s;
		try {
			//c = (char) isr.read(); // type casting
			//System.out.println("Você digitou a tecla: " + c);
			s = br.readLine();
			System.out.println("Você digitou a mensagem: " +s);
		//} catch (IOException e) {
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
		}
	}

}
