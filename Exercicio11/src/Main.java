import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Informe o salario: ");
		double salario = entrada.nextDouble();
		
		Empregado emp = new Empregado();
		emp.setNome(nome);
		emp.setSalario(salario);
		
		System.out.print("Informe o percentual de aumento: ");
		double aumento = entrada.nextDouble();
		
		emp.aumentaSalario(aumento);
		
		System.out.println("O salario novo do empregado eh: " + emp.getSalario());

	}

}
