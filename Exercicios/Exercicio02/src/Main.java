import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		int num1 = entrada.nextInt();
		System.out.print("Informe o segundo numero: ");
		int num2 = entrada.nextInt();
		
		System.out.println("Soma: " + (num1 + num2));
		System.out.println("Subtracao: " + (num1 - num2));
		System.out.println("Multiplicacao: " + (num1 * num2));
		if (num2 != 0){
			System.out.println("Divisao: " + (num1 / (double)num2));			
		} else {
			System.out.println("Impossivel dividir por zero");
		}
	}
}
