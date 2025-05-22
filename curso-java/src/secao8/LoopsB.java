package secao8;

public class LoopsB {

    public static void main(String[] args) {

        // Exemplo de uso de rótulo externo para quebrar dois loops aninhados
        externo: 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break externo; 
                }
                System.out.println("i " + i + ", j " + j);
            }
        }

        System.out.println("------");

        for (int i = 0; i < 5; i++) {
            System.out.println("Externo: " + i);
            
            interno:
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    System.out.println("Parou interno");
                    break interno; 
                }

                System.out.println("i " + i + ", j " + j);
            }
        }
        
		// 9 - off by one

		for (int i = 0; i <= 5; i++) {
			System.out.println("I: " + i);
		}
	}
}
