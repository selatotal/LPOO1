package genetico;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numCartas = entrada.nextInt();
		entrada.nextLine();
		LinkedList<Long> cartas = new LinkedList<>();

		for (int i = 0; i < numCartas; i++) {
			cartas.add(entrada.nextLong());
		}
		
		Populacao populacao = new Populacao(5, cartas);
		populacao.geraRandomico();
		
		for(long epocas = 0; epocas < 100000; epocas++) {
			populacao.criaNovaGeracao();
		}
		System.out.println(populacao.buscaMaisApto().getValorAntonio());
		
	}
	
}
