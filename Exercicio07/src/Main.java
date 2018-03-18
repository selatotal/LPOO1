import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Primeiro numero: ");
		int num1 = entrada.nextInt();
		System.out.print("Segundo numero: ");
		int num2 = entrada.nextInt();
		
		if (num1 > num2){
			System.out.println("Primeiro numero maior");
		} else if (num1 < num2){
			System.out.println("Segundo numero maior");
		} else {
			System.out.println("Numeros Iguais");
		}

	}

}
