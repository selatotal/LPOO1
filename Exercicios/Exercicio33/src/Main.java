import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		OperaComArray array = new OperaComArray(10);
		
		System.out.println("Soma: " + array.retornaSoma());
		System.out.println("Media: " + array.retornaMedia());
		System.out.println("Ultimo Elemento: " + array.retornaUltimo());
		System.out.println("Maior Elemento: " + array.retornaMaior());
		
		System.out.print("Informe um numero: ");
		int numero = input.nextInt();
		System.out.println(numero + " esta no array: " + array.estahNoArray(numero) );
	}

}
