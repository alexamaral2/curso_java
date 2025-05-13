package secao7;

import java.util.Scanner;

public class ConversorDeTemperatura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha o tipo de conversão");
		System.out.println("1: Celsius para Fahrenheit");
		System.out.println("2: Fahrenheit para Celsius");

		int escolha = sc.nextInt();

		if (escolha == 1) {
			converterCparaF();
		} else if (escolha == 2) {
			converterFparaC();
		} else {
			System.out.println("Opção Inválida!");
		}

		sc.close();
	}

	public static void converterCparaF() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a temperatura em Celsius: ");

		double celsius = sc.nextDouble();

		double fahrenheit = (celsius * 9 / 5) + 32;

		System.out.println(celsius + "C convertido é igual a: " + fahrenheit + "F");
	}

	public static void converterFparaC() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a temperatura em Fahrenheit: ");

		double fahrenheit = sc.nextDouble();

		double celsius = (fahrenheit - 32) * 5 / 9;

		System.out.println(fahrenheit + "F convertido é igual a: " + celsius + "C");
	}

}
