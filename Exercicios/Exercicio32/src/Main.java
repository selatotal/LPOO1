
public class Main {

	public static void main(String[] args) {

		Baralho baralho = new Baralho();
		
		baralho.imprimeBaralho();
		
		Carta carta = baralho.daCarta();
		System.out.println("Recebeu: " + carta);
		baralho.imprimeBaralho();
		baralho.embaralha();
		baralho.imprimeBaralho();
	}

}
