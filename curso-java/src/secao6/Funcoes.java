package secao6;

public class Funcoes {

	public static void main(String[] args) {

		// 1 - Criando a primeira funcao
		// tanto funcoes como variáveis, a gente nomeia
		saudacao();

		// 2 - parametros
		soma(2, 4);
		soma(8, 12);
		saudar("Alex");

		// 3 - return
		dobrar(4);
		int numero = 10;
		int numeroDobrado = dobrar(numero);
		dobrar(numero);

		System.out.println("O numero dobrado é : " + numeroDobrado);

		// 4 - retorno em variavel
		String r1 = verificarPar(numero);

		String r2 = verificarPar(3);

		System.out.println(r1);

		System.out.println(r2);
		
		int x = dobrar(soma2(2, 4));
		
		System.out.println(x);

	}

	// NIVEL DE ACESSO, STATIC => Não preciso instanciar classe para executar, Tipo
	// Retorno
	// Nome, Os Parenteses (ARGS), Bloco {}

	public static void saudacao() {
		System.out.println("Olá, esta é a minha primeira função!");
	}

	public static void soma(int a, int b) {
		int resultado = a + b;
		System.out.println("O resultado da soma é: " + resultado);
	}

	public static void saudar(String nome) {
		System.out.println("Olá, " + nome + ", tudo bem?");
	}

	public static int dobrar(int n) {
		return n * 2;
	}

	public static String verificarPar(int n) {
		if (n % 2 == 0) {
			return "O numero " + n + " é par";
		} else {
			return "O numero " + n + " NÃO é par!";
		}
	}
	
	public static int soma2(int a, int b) {
		return a + b;
	}

}
