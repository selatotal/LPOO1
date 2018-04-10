import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe uma palavra ou frase: ");
		String palavraFrase = entrada.nextLine();
		
		palavraFrase = palavraFrase.toLowerCase().replace(" ", "");
		String palavraRevertida = new StringBuilder(palavraFrase).reverse().toString();

		if (palavraFrase.equals(palavraRevertida)) {
			System.out.println("Eh um palindromo");
		} else {
			System.out.println("Nao eh um palindromo");
		}
		
	}

}
