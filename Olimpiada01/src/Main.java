import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		int l = entrada.nextInt();
		int c = entrada.nextInt();
		entrada.nextLine();
		String conto = entrada.nextLine();
		
		String[] palavras = conto.split(" "); 
		
		int posicaoLinha = 0;
		int numPaginas = 0;
		int numLinha = 0;
		
		for (int i = 0; i < palavras.length; i++) {
			if (posicaoLinha + palavras[i].length() > c) {
				i--;
				numLinha++;
				posicaoLinha = 0;
			} else {
				posicaoLinha+=palavras[i].length() + 1;
			}
			if ((numLinha >= l) || (i == palavras.length-1)) {
				numLinha = 0;
				numPaginas++;
			}
		}
		
		System.out.println(numPaginas);
	}

}
