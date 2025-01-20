package secao4;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

		// Exercicio 1
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o preço do produto: ");
		
		double preco = Double.parseDouble(scanner.nextLine());

		if (preco < 50) {
			System.out.println("Categoria: Barato");
		} else if (preco >= 50 && preco <= 100) {
			System.out.println("Categoria: Médio");
		} else {
			System.out.println("Categoria: Caro");
		}
		
		// Exercicio 2
		
		System.out.println("Digite o nome do usuário");
		
		String usuario = scanner.next();
		
		System.out.println("Digite a senha do usuário: ");
		
		String senha = scanner.next();
		
		// String => equals
		
		if(usuario.equals("admin") && senha.equals("1234")) {
			System.out.println("Acesso permitido.");
		} else {
			System.out.println("Acesso negado.");
		}
		
		// Exercicio 3
		System.out.println("Digite um número: ");
		
		int numero = scanner.nextInt();
		
		// 12 / 2 = 6 -> resto 0;
		// 13 / 2 = 6 -> resto 1;
		
		String resultado = "";
		
		if(numero % 2 == 0) {
			resultado = "Par";
		} else {
			resultado = "Ímpar";
		}
		
		System.out.println("o numero é: " + resultado);
		
		// Exercicio 4
		System.out.println("Insira um número de 1 a 7 (referente ao dia da semana): ");
		
		int dia = scanner.nextInt();

		switch (dia) {
		case 1:
		case 7:
			System.out.println("Final de semana");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dia de semana");
			break;
		default:
			System.out.println("Numero inválido");
			break;
		}
		
		// Exercicio 5
		System.out.println("Insira um número:");
		
		int n = scanner.nextInt();
		
		if (n >= 10 && n <= 20) {
			System.out.println("Dentro do intervalo.");
		} else {
			System.out.println("Fora do intervalo.");
		}
		
		// Exercicio 6
		
		System.out.println("Insira uma letra:");
		
		char letra = scanner.next().toLowerCase().charAt(0);
		switch (letra) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vogal");
			break;
		default:
			System.out.println("Consoante");
			break;
		}
			
		
		scanner.close();

	}

}
