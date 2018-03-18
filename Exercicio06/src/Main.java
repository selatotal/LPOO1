import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		int num = entrada.nextInt();
		if (num < 0){
			System.out.println("Numero invalido");
		} else {
			int sum = 0;
			for (int i=1; i <= num; i+=2){
				sum += i;
			}
			System.out.println(sum);
		}
	}

}
