package secao4;

public class Condicionais {

	public static void main(String[] args) {

		// 1 - o que é boolean?
		boolean isTrue = true;
		boolean isFalse = false;

		System.out.println(isTrue);
		System.out.println(isFalse);

		// Operadores de comparação
		int x = 10;

		System.out.println(x == 10);

		System.out.println(x == 9);

		System.out.println(x != 5);

		System.out.println(x != 10);

		System.out.println(x > 10);

		System.out.println(x >= 10);

		System.out.println(x < 10);

		System.out.println(x <= 10);

		int n = 5;
		int m = 10;

		System.out.println(n = 12);

		System.out.println(n);

		System.out.println(n == m);

		String str1 = "Java";
		String str2 = new String("Java");

		System.out.println(str1);
		System.out.println(str2);

		System.out.println(str1 == str2);

		System.out.println(str1 == "Java");

		System.out.println(str1.equals(str2));

		System.out.println(str2.equals(str1));

		System.out.println(str1.equals("Java"));

		String str3 = "JAVA";

		System.out.println(str1.equals(str3));

		// JAVA == JAVA (false) > java == java
		System.out.println(str1.equalsIgnoreCase(str2));

		// 5 - if
		int numero = 10;

		// baseado em uma comparação, eu executo algo
		if (numero > 5) {
			System.out.println("O númeor é maior que 5");
		}

		// If com strings
		String texto = "Teste";

		if (texto.equals("Teste")) {
			System.out.println("O texto é: Teste");
		}

		// 6 - else
		int q = 17;

		if (q > 10) {
			System.out.println("Q é maior q 10");
		} else {
			System.out.println("Insira um número maior que 10!");
		}

		if (texto.equals("Teste2")) {
			System.out.println("O texto é: Teste");
		} else {
			System.out.println("O texto não é igual");

		}

		// 7 - else if
		double nota = 8.5;

		if (nota == 10) {
			System.out.println("Você tirou a nota máxima, parabéns!");
		} else if (nota >= 9) {
			System.out.println("Nota muito boa!");
		} else if (nota >= 7) {
			System.out.println("Acima da média");
		} else {
			System.out.println("Abaixo da média!");
		}

		int num = 5;

		if (num > 3 && num < 5) {
			System.out.println("Alguma coisa");
		} else if (num == 5) {
			System.out.println("Outra coisa aqui");
		}

	}

}
