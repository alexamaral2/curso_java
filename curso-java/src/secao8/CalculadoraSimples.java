package secao8;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double resultado = 0;
		boolean continuar = true;

		do {
			System.out.print("Digite o primeiro número: ");
			double num1 = scanner.nextDouble();

			System.out.print("Digite o segundo número: ");
			double num2 = scanner.nextDouble();

			System.out.println("Escolha a operação:");
			System.out.println("1 - Adição (+)");
			System.out.println("2 - Subtração (-)");
			System.out.println("3 - Multiplicação (*)");
			System.out.println("4 - Divisão (/)");
			System.out.println("5 - Sair");

			int operacao = scanner.nextInt();

			switch (operacao) {
			case 1:
				resultado = somar(num1, num2);
				System.out.println("Resultado: " + resultado);
				break;
			case 2:
				resultado = subtrair(num1, num2);
				System.out.println("Resultado: " + resultado);
				break;
			case 3:
				resultado = multiplicar(num1, num2);
				System.out.println("Resultado: " + resultado);
				break;
			case 4:
				if (num2 != 0) {
					resultado = dividir(num1, num2);
					System.out.println("Resultado: " + resultado);
				} else {
					System.out.println("Erro: divisão por zero!");
					resultado = 0;
				}
				break;
			case 5:
				System.out.println("Encerrando a calculadora...");
				continuar = false;
				break;
			default:
				System.out.println("Operação inválida.");
				resultado = 0;
			}

			System.out.println();

		} while (continuar);

		scanner.close();
	}

	// Funções de cálculo
	public static double somar(double a, double b) {
		return a + b;
	}

	public static double subtrair(double a, double b) {
		return a - b;
	}

	public static double multiplicar(double a, double b) {
		return a * b;
	}

	public static double dividir(double a, double b) {
		return a / b;
	}
}
