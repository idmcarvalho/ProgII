package ooavc;

public class TestaConta3 {
	public static void main(String[] args) {
		Conta c1; //declara��o    --- c1 � ponteiro
		c1 = new Conta(); //instancia��o leitura do compilador � da direita pra esquerda ---- c1 passa a ser uma estrutura de mem�ria, criada e referenciada no ponteiro
		c1.limite = 100; //inicializa��o
		
		Conta c2;  //     c2 � ponteiro
		c2 = c1;  // "=" operador de atribui��o, da direita para a esquerda
		c2.limite = 200; // sobre escrevendo a �rea de mem�ria
		
		System.out.println(c1.limite);
		
		
		
		
		
	}
}
