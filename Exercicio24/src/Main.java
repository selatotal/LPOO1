import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		FabricaLampadas fabrica = new FabricaLampadas();

		System.out.println("Informe (L) para LED ou (F) para Fluorescente: ");
		char tipo = entrada.nextLine().charAt(0);

		Lampada lampada = fabrica.criaLampada(tipo);
		if (lampada != null) {
			lampada.ligar();
			lampada.mostraEstado();
			lampada.desligar();
			lampada.mostraEstado();
		}
	}

}
