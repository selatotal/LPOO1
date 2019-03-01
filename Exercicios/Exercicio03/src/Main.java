import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o primeiro numero: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Informe o segundo numero: ");
		int num2 = entrada.nextInt();
		
		if ((num1 + num2) % 2 == 0){
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

	}

}
