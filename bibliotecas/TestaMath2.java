package bibliotecas;

public class TestaMath2 {

	public static void main(String[] args) {
		//Implementar e testar Math.exp, Math.log, Math.log, Math.pow, Math.sqrt, logab
		
		double a = 3, b = 10, c=3;
		System.out.println("a = " + a);
		System.out.println("Math.exp("+ a + ") = " +Math.exp(a));
		System.out.println("Math.log(" + a + ") = " +Math.log(a));
		System.out.println("Math.pow(" + a + ", " + c + ") = " +Math.pow(a, c)); //
		System.out.println("Math.sqrt(" + a + ") = " +Math.sqrt(a)); //raiz quadrada
		System.out.println("log " + a + " base " + b + " = " + log(a, b));
		

	}

	private static double log(double a, double b) {
		return Math.log(a) / Math.log(b);
	}

}
