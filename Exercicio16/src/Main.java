import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a cor do carro: ");
		String cor = entrada.nextLine();
		
		System.out.print("Informe a capacidade do motor: ");
		double capacidadeMotor = entrada.nextDouble();

		Carro carro = new Carro(cor, capacidadeMotor);
		do {
			System.out.println("===============");
			System.out.println("OPCOES:");
			System.out.println("1 - Aumentar velocidade");
			System.out.println("2 - Reduzir velocidade");
			System.out.println("3 - Sair do programa");
			int opcao = entrada.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.print("Informe a velocidade a aumentar: ");
				double velocidade = entrada.nextDouble();
				carro.aumentarVelocidade(velocidade);
				System.out.println("Velocidade atual: " + carro.getVelocidade());
				break;
			case 2:
				System.out.print("Informe a velocidade a reduzir: ");
				velocidade = entrada.nextDouble();
				carro.reduzirVelocidade(velocidade);
				System.out.println("Velocidade atual: " + carro.getVelocidade());
				break;
			case 3:
				System.exit(0);
			}
			
		} while (true);
		
	}

}
