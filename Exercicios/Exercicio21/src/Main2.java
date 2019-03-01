import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int tipo;
		do {
			System.out.println("Escolha o tipo do animal: ");
			System.out.println("1 - Animal");
			System.out.println("2 - Peixe");
			System.out.println("3 - Mamifero");
			tipo = Integer.parseInt(entrada.nextLine());
		} while (tipo < 1 || tipo > 3);

		System.out.print("Informe o nome: ");
		String nome = entrada.nextLine();
		System.out.print("Informe o comprimento: ");
		float comprimento = Float.parseFloat(entrada.nextLine());
		System.out.print("Informe o numero de patas: ");
		int numeroPatas = Integer.parseInt(entrada.nextLine());
		System.out.print("Informe a cor: ");
		String cor = entrada.nextLine();
		System.out.print("Informe o ambiente: ");
		String ambiente = entrada.nextLine();
		System.out.print("Informe a velocidade: ");
		float velocidade = Float.parseFloat(entrada.nextLine());
		
		if (tipo == 1) {
			Animal animal = new Animal(nome, comprimento, numeroPatas, cor, ambiente, velocidade);
			animal.listaDados();
		} else if (tipo == 2) {
			Peixe peixe = new Peixe(nome, comprimento, velocidade);
			peixe.listaDados();
		} else if (tipo == 3){
			Mamifero mamifero = new Mamifero(nome, comprimento, numeroPatas, cor, velocidade);
			mamifero.listaDados();
		}
		
		
	}

}
