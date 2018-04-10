import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe uma palavra ou frase: ");
		String palavra1 = entrada.nextLine();

		System.out.print("Informe outra palavra ou frase: ");
		String palavra2 = entrada.nextLine();
		
		char[] arrPalavra1 = palavra1.replace(" ", "").toUpperCase().toCharArray();
		char[] arrPalavra2 = palavra2.replace(" ", "").toUpperCase().toCharArray();
		Arrays.sort(arrPalavra1);
		Arrays.sort(arrPalavra2);
		palavra1 = new String(arrPalavra1);
		palavra2 = new String(arrPalavra2);
		if (palavra1.equals(palavra2)) {
			System.out.println("As palavras sao anagramas.");
		} else {
			System.out.println("As palavras NAO SAO anagramas.");
		}
		
		
	}

}
