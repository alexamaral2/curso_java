package secao6;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu peso: ");

		double peso = Float.parseFloat(sc.nextLine());

		System.out.println("Digite a sua altura: ");

		double altura = Float.parseFloat(sc.nextLine());

		double imc = peso / (altura * altura);

		if (imc < 18.5) {
			System.out.println("Seu imc é: " + imc + "Classificação: abaixo do peso!");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Seu imc é: " + imc + "Classificação: peso normal!");
		} else if (imc >= 25 && imc < 29.9) {
			System.out.println("Seu imc é: " + imc + "Classificação: sobrepeso!");
		} else {
			System.out.println("Seu imc é: " + imc + "Classificação: obesidade!");
		}
		
		sc.close();
	}

}
