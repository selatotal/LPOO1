import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe seu nome completo: ");
		String nomeCompleto = entrada.nextLine();
		
		String ultimoSobrenome = nomeCompleto.trim();
		if (ultimoSobrenome.contains(" ")) {
			System.out.println("Seu ultimo sobrenome eh " + ultimoSobrenome.substring(ultimoSobrenome.lastIndexOf(" ")+1));
		} else {
			System.out.println("Sobrenome nao informado");
		}
		
	}
}
