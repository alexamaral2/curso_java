package secao5;

public class CondicionaisDois {

	public static void main(String[] args) {

		// 1 - Condicionais Ternária

		int numero = 10;

		String resultado = (numero % 2 == 0) ? "Par" : "Impar";

		System.out.println(resultado);

		// CONDICAO x > 5 ? EXPRESSAO SE É TRUE "OK" : EXPRESSÃO SE é FALSE "Não OK"

		// 2 - Encadeado

		int idade = 25;
		boolean temCarteira = true;

		if (idade >= 18) {

			if (temCarteira) {
				System.out.println("Pode dirigir");
			} else {
				System.out.println("Precisa ter habilitação para dirigir");
			}
		} else {
			System.out.println("Você não pode dirigir ainda!");
		}

		// 3 - Precedencia

		boolean a = true;
		boolean b = false;
		boolean c = true;

		boolean resultado2 = a && b || c;

		System.out.println(resultado2);

		boolean resultado3 = a || b && c;

		System.out.println(resultado3);

		boolean resultado4 = (a || b) && c;
		
		System.out.println(resultado4);
		
		boolean resultado5 = (a || b) && c;
		
		System.out.println(resultado5);

	}

}
