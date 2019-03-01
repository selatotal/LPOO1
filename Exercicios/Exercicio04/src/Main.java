import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a altura: ");
		int altura = entrada.nextInt();
		
		System.out.print("Informe a largura: ");
		int largura = entrada.nextInt();

		for (int i = 0; i < altura; i++){
			for(int j = 0; j < largura; j++){
				System.out.print('X');
			}
			System.out.println();
		}
	}

}
