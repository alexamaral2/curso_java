package secao6;

import java.util.Arrays;
import java.util.List;

public class FuncoesC {

	public static void main(String[] args) {

		// 12 - Função Recursiva
		int soma = somaRecursiva(6);

		// 6 + 5 + 4 + 3 + 2 + 1 = 21
		System.out.println(soma);
		// Função Iterativa
		System.out.println(somatorioIterativo(6));

		// 13 - Method Overloading
		System.out.println(soma(2, 4));
		System.out.println(soma(2, 4, 6));
		System.out.println(soma(2.2, 4.4));
		
		// 14 - Função Anonima
		Runnable tarefa = () -> System.out.println("Minha Função Anonima!");
		tarefa.run();
		
		// (arg1, arg2) - {}
		List<String> nomes = Arrays.asList("Ana", "Pedro", "Paulo");
		
		nomes.forEach(nome -> System.out.println(nome));
	}

	public static int somaRecursiva(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + somaRecursiva((n - 1));
		}
	}

	public static int somatorioIterativo(int n) {
		int soma = 0;
		for (int i = 1; i <= n; i++) {
			soma += i;
		}
		return soma;
	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int soma(int a, int b, int c) {
		return a + b + c;
	}

	public static double soma(double a, double b) {
		return a + b;
	}
}
