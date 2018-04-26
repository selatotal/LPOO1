import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Tabuleiro tabuleiro = new Tabuleiro();
		
		CorPeca quemJoga = CorPeca.XIS;
		CorPeca vencedor = null;
		
		do {
			tabuleiro.imprimeTabuleiro();
			System.out.print("Jogador: ");
			if (quemJoga == CorPeca.XIS) {
				System.out.println("X");
			} else {
				System.out.println("O");
			}
			System.out.print("Informe tabuleiro, linha e coluna: ");
			int numTabuleiro = entrada.nextInt()-1;
			int numLinha = entrada.nextInt()-1;
			int numColuna = entrada.nextInt()-1;
			entrada.nextLine();

			if (tabuleiro.jogar(quemJoga, numTabuleiro, numLinha, numColuna)) {
				if (quemJoga == CorPeca.XIS) {
					quemJoga = CorPeca.BOLINHA;
				} else {
					quemJoga = CorPeca.XIS;
				}
			}
			vencedor = tabuleiro.checkVitoria(); 
		} while (vencedor == null);

		tabuleiro.imprimeTabuleiro();
		switch (vencedor) {
		case XIS:
			System.out.println("Vencedor: X");
			break;
		case BOLINHA:
			System.out.println("Vencedor: O");
			break;
		case ACABOU:
			System.out.println("EMPATE");
		}

	}
	
}
