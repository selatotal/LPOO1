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
		
		long valorMaximo = 0;

		boolean vezAlberto = true;
		while(cartas.size() > 0) {
			long primeiro = cartas.getFirst();
			long ultimo = cartas.getLast();
			long somaPrimeiroPenultimo = primeiro;
			long somaUltimoSegundo = ultimo;
			if (cartas.size() > 2) {
				somaPrimeiroPenultimo+=cartas.get(cartas.size()-2);
				somaUltimoSegundo+=cartas.get(1);
			}
			if (vezAlberto) {
				if (somaPrimeiroPenultimo > somaUltimoSegundo) {
					valorMaximo+=primeiro;
					cartas.removeFirst();
				} else {
					valorMaximo+=ultimo;
					cartas.removeLast();
				}
				vezAlberto = false;
			} else {
				if (somaPrimeiroPenultimo > somaUltimoSegundo) {
					cartas.removeFirst();
				} else {
					cartas.removeLast();
				}
				vezAlberto = true;
			}
		}
		System.out.println(valorMaximo);
		
	}
	
}
