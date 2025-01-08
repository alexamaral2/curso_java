package secao2;

public class Variavel {

	public static void main(String[] args) {

		// 1 - o que são variaveis
		// tipo -> nome -> atribuir um valor;

		String nome = "Matheus";

		// nome => "Matheus"
		System.out.println(nome);

		// 2 = atribuição de variavel com outra
		String teste = "Teste";

		String testando = teste;

		System.out.println(testando);

		long numeroGrande = 99999999999999999L;

		// int numeroGrandeDois = numeroGrande;

		System.out.println(numeroGrande);

		// 3 - Comentários

		/*
		 * 
		 * Comentário 
		 * Linha 1 
		 * Linha 2 
		 * Linha 3
		 * 
		 */

		/**
		 * Função para somar números param1: 
		 * Primeiro numero 
		 * param2: Segundo Numero
		 * retorno função
		 */
		
		// 4 - Strings
		
		String firstName = "Alex";
		String lastName = "Jr";
		
		System.out.println("Alex Jr");
		
		System.out.println(firstName + " " +lastName);
		
		System.out.println("O nome dele é: " + firstName);
	
		String fullName = firstName + " " + lastName;
		
		// concatenação = operador  + nas strings, para uni-las
		System.out.println(fullName);
		
		// 5 - Char
		
		char letra = 'A';
		System.out.println(letra);
		
		String letra2 = "A";
		
		System.out.println(letra2);
		
		char simbolo =  '$';
		
		System.out.println(simbolo);
		
		// 6 - int
		
		int n = 42;
		
		System.out.println(n);
		
		System.out.println(n + 5);
		
		System.out.println(n * 10);
		
		System.out.println(n / 5);
		
		int soma = n + 12;
		
		System.out.println(soma);
		
	}

}
