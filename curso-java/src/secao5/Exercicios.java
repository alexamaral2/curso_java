package secao5;

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
		
		scanner.close();

	}

}
