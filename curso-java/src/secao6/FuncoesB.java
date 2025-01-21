package secao6;

public class FuncoesB {

	public static void main(String[] args) {

		// 5 - funções com condicionais
		String r1 = verificarAcesso(19, true, true);
		System.out.println(r1);

		String r2 = verificarAcesso(25, false, true);
		System.out.println(r2);

		// 6 - Funções com switch

		System.out.println(obterDiaDaSemana(5));
		
		// 7 - System exit
		
		verificarAutenticacao("admin", "senhaSegura");
		System.out.println("Oi");
	}

	public static String verificarAcesso(int idade, boolean temCarteira, boolean temHistoricoNegativo) {

		if (idade >= 18 && temCarteira && !temHistoricoNegativo) {
			return "Acesso permitido: todos os criterios atendidos!";
		} else if (idade >= 18 && temCarteira && temHistoricoNegativo) {
			return "Acesso negado: Histórico negativo detectado";
		} else {
			return "Acesso negado: Criterios não atendidos";
		}
	}

	public static String obterDiaDaSemana(int dia) {
		switch (dia) {
		case 1:
			return "Segunda-Feira";
		case 2:
			return "Terça-Feira";
		case 3:
			return "Quarta-Feira";
		case 4:
			return "Quinta-Feira";
		case 5:
			return "Sexta-Feira";
		case 6:
			return "Sábado";
		case 7:
			return "Domingo";
		default:
			return "Dia Inválido";
		}
	}

	public static void verificarAutenticacao(String usuario, String senha) {

		if (!usuario.equals("admin") && !senha.equals("SenhaSegura")) {
			System.out.println("Autenticação falhou!");
			System.exit(1);
		}

		System.out.println("Autenticação bem sucedida!");

	}

}
