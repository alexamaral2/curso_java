package secao6;

public class FuncoesC {

	public static void main(String[] args) {

		// 12 - Função Recursiva
		int soma = somaRecursiva(6);

		// 6 + 5 + 4 + 3 + 2 + 1 = 21
		System.out.println(soma);

		// Função Iterativa
		System.out.println(somatorioIterativo(6));
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
}
