package secao5;

public class Switch {

	public static void main(String[] args) {

		// 11 - switch case e break

		// para validar dida de semana baseado no número
		// 1 = Domingo
		// 7 = Sábado

		int diaDaSemana = 1;

		switch (diaDaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		}

		// 12 - default

		int n = 10;

		switch (n) {
		case 1:
			System.out.println("É 1");
			break;
		case 2:
			System.out.println("É 2");
		default:
			System.out.println("Número não encontrado!");
			break;
		}

		// 13 - switch sem break
		switch (1) {
		case 1:
			System.out.println("É 1");
		case 2:
			System.out.println("É 2");
		case 3:
			System.out.println("É 3");
		case 4:
			System.out.println("É 4");
		default:
			System.out.println("Número não encontrado!");
		}

	}

}
