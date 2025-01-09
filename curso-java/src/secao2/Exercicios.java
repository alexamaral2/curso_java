package secao2;

public class Exercicios {

	public static void main(String[] args) {
		
		// Ex 1
		int valorOriginal = 10;
		int valorDobrado = valorOriginal * 2;
		
		System.out.println(valorDobrado);
		
		//Ex 2
		char letra = 'A';
		int valorAscii = (int) letra;
		
		System.out.println(valorAscii);
		
		
		//Ex 3
		double n1 = 15.75;
		double n2 = 20.40;
		
		double soma = n1 + n2;
		System.out.println(soma);
		
		//Ex 4
		
		long numeroGrande = 2_000_000_000L;
		int numeroInt = (int)numeroGrande;
		System.out.println(numeroInt);
		
		// Ex 5
		
		String saudacao = "Olá, Mundo!";
		String mensagem = saudacao + " Bem-vindo ao Java";
		
		System.out.println(mensagem);
	}

}
