package secao8;

public class Exercicios {

	public static void main(String[] args) {

		// Exercicio 1

		int somatorio = 0;

		for (int i = 0; i <= 100; i++) {
			somatorio += i;

		}

		System.out.println("Soma de 1 a 100: " + somatorio);

		// Exercicio 2
		int numero = 1;

		while (numero <= 20) {

			if (numero % 2 == 0) {
				System.out.println("Número par: " + numero);
			}

			numero++;
		}

		// Exercicio 3
		int numPrimo = 23;

		boolean ePrimo = true;

		// testar se ele é primo mesmo
		for (int i = 2; i < numPrimo; i++) {

			// dividir esse cara e não ter resto, ele não é primo
			// 1 e por ele mesmo

			if (numPrimo % i == 0) {
				ePrimo = false;
				break;
			}
		}

		if (ePrimo) {
			System.out.println("O numero " + numPrimo + " é primo!");
		} else {
			System.out.println("O numero " + numPrimo + " não é primo!");

		}

		// Exercicio 4

		int opcao;

		do {

			System.out.println("Exercicio 4 - Menu");
			System.out.println("0) Refrigerante");
			System.out.println("1) Hamburguer");
			System.out.println("2) Cachorro Quente");
			System.out.println("3) Sushi");
			System.out.println("4) Sair");

			opcao = (int) (Math.random() * 5);

			System.out.println("A opção escolhida foi: " + opcao);

		} while (opcao != 4);

		// Exercicio 5
		int numFatorial = 12;
		int fatorial = 1;

		for (int i = 1; i <= numFatorial; i++) {
			fatorial *= i;
		}

		System.out.println("O fatorial de " + numFatorial + " é igual a " + fatorial);

		// Exercicio 6

		int numeroParaContar = 1000;

		int contador = 0;

		while (numeroParaContar != 0) {

			numeroParaContar = numeroParaContar / 10;

			contador++;
		}

		System.out.println("Numero de digitos " + contador);
	}

}
