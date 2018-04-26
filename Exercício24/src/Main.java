import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a dimensao da matriz quadrada: ");
		int dimensao = input.nextInt();
		
		int[][] mat = new int[dimensao][dimensao];
		
		for (int i=0; i < mat.length; i++) {
			for (int j=0; j < mat[i].length; j++) {
				System.out.print("Informe a posicao [" + (i+1) + "][" + (j+1) + "]: ");
				mat[i][j] = input.nextInt();
			}
		}
		
		int somaPrincipal = 0;
		int prodSecundaria = 1;
		int somaOutros = 0;
		int coluna = dimensao - 1;
		
		for (int i=0; i < mat.length; i++) {
			for (int j=0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
				boolean isDiagonal = false;
				if (i == j) {
					somaPrincipal += mat[i][j];
					isDiagonal = true;
				}
				if (j == coluna) {
					prodSecundaria *= mat[i][j];
					isDiagonal = true;
				}
				if (!isDiagonal) {
					somaOutros += mat[i][j];
				}
			}
			coluna--;
			System.out.println();
		}
		
		System.out.println("Soma da Diagonal Principal: " + somaPrincipal);
		System.out.println("Produto da Diagonal Secundaria: " + prodSecundaria);
		System.out.println("Soma dos itens que nao estao nas diagonais: " + somaOutros);
	}

}
