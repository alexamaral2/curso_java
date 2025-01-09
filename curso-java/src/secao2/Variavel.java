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
		 * Comentário Linha 1 Linha 2 Linha 3
		 * 
		 */

		/**
		 * Função para somar números param1: Primeiro numero param2: Segundo Numero
		 * retorno função
		 */

		// 4 - Strings

		String firstName = "Alex";
		String lastName = "Jr";

		System.out.println("Alex Jr");

		System.out.println(firstName + " " + lastName);

		System.out.println("O nome dele é: " + firstName);

		String fullName = firstName + " " + lastName;

		// concatenação = operador + nas strings, para uni-las
		System.out.println(fullName);

		// 5 - Char

		char letra = 'A';
		System.out.println(letra);

		String letra2 = "A";

		System.out.println(letra2);

		char simbolo = '$';

		System.out.println(simbolo);

		// 6 - int

		int n = 42;

		System.out.println(n);

		System.out.println(n + 5);

		System.out.println(n * 10);

		System.out.println(n / 5);

		int soma = n + 12;

		System.out.println(soma);

		// 7 - Long

		long populacaoMundial = 78000000000000L;

		long grandeNumero = 1_000_000L;

		System.out.println(populacaoMundial);

		System.out.println(grandeNumero + 1);

		// 8 - Double

		double preco = 19.99;

		System.out.println(preco);

		System.out.println(preco - 12);

		System.out.println(preco / 2);

		double pi = 3.141_592_123;

		System.out.println(pi);

		double valorComD = 12.1D;

		System.out.println(valorComD);

		// 9 - OP - aritmeticos p1

		int soma2 = 12 + 5;

		System.out.println(soma);

		System.out.println(22 + 4);

		System.out.println(10 - 5);

		System.out.println(10 * 5);

		System.out.println(10 / 2.5);

		System.out.println(10.0 / 2.5);

		// para ter um resultado quebrado (1.5), pelo menos 1 num da divisão tem de que
		// ser double

		System.out.println(10 / 3);

		System.out.println(10.0 / 3);

		System.out.println(10 % 3);

		// 10 - op. aritimeticos p2

		int x = 5;

		x++;
		x++;
		x++;
		x++;

		System.out.println(x);

		int y = 5;
		y--;

		System.out.println(y);

		int a = 10;
		a += 5;

		System.out.println(a);

		int b = 10;

		b -= 5;

		System.out.println(b);

		b -= a;

		System.out.println(b);

		// 11 - type casting

		int numero2 = 42;

		long numeroLong = numero2;

		double numeroDouble = numero2;

		System.out.println(numeroLong);

		System.out.println(numeroDouble);

		double valorDouble = 9.78;

		int valorInt = (int) valorDouble;

		System.out.println(valorInt);

		// casting de char para int

		char letra3 = 'A';

		int codigoAscii = (int) letra3;

		System.out.println(codigoAscii);

		// 12 constantes
		final int DIAS_DA_SEMANA = 7;

		System.out.println("Dias da semana " + DIAS_DA_SEMANA);
	
		// 13 = var
		
		var z = 10;
		
		System.out.println(z);
		
		// z = 5;
		
		var texto2 = "teste";
		
		var doubleTeste = 2.0;
		
		System.out.println(texto2);
		
		System.out.println(doubleTeste);
	}

}
