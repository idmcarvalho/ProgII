package ooavc;

public class TestaConta3 {
	public static void main(String[] args) {
		Conta c1; //declaração    --- c1 é ponteiro
		c1 = new Conta(); //instanciação leitura do compilador é da direita pra esquerda ---- c1 passa a ser uma estrutura de memória, criada e referenciada no ponteiro
		c1.limite = 100; //inicialização
		
		Conta c2;  //     c2 é ponteiro
		c2 = c1;  // "=" operador de atribuição, da direita para a esquerda
		c2.limite = 200; // sobre escrevendo a área de memória
		
		System.out.println(c1.limite);
		
		
		
		
		
	}
}
