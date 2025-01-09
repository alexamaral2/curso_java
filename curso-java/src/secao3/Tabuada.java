package secao3;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("digite o número que você quer ver a tabuada: ");

		int numero = Integer.parseInt(scanner.nextLine());

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}

		scanner.close();
	}

}
