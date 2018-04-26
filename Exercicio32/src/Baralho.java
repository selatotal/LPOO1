import java.util.Random;

public class Baralho {

	private Carta[] baralho = new Carta[56];
	
	private static String[] cartasAdicionais = { "A", "J", "Q", "K" };
	private static String[] naipes = { "Ouros", "Copas", "Paus", "Espadas" };
	
	public Baralho() {
		int posicao = 0;
		for (String naipe : Baralho.naipes) {
			for (int i=2; i<= 10; i++) {
				this.baralho[posicao++] = new Carta(""+i, naipe);
			}
			for (String carta : Baralho.cartasAdicionais) {
				this.baralho[posicao++] = new Carta(carta, naipe);
			}
		}
		for (int i=1; i<=4; i++) {
			this.baralho[posicao++] = new Carta("Coringa", null);
		}
	}
	
	public void imprimeBaralho() {
		int pos = 0;
		System.out.println("====================");
		for (Carta carta : this.baralho) {
			if (carta != null) {
				System.out.println(pos++ + " - " + carta);
			}
		}
	}
	
	public Carta daCarta() {
		Carta retorno = baralho[0];
		for (int i=0; i < baralho.length-1; i++) {
			baralho[i] = baralho[i+1];
		}
		baralho[baralho.length-1] = null;
		return retorno;
	}
	
	public boolean temCarta(Carta carta) {
		for(Carta cartaBaralho : this.baralho) {
			if (cartaBaralho != null && (cartaBaralho.compareTo(carta) == 0)) {
				return true;
			}
		}
		return false;
	}
	
	public void embaralha() {
		Random random = new Random();
		
		for (int i = 0; i < this.baralho.length; i++) {
			int pos = random.nextInt(this.baralho.length);
			Carta temp = this.baralho[i];
			this.baralho[i] = this.baralho[pos];
			this.baralho[pos] = temp;
		}
		
		// Compacta o baralho
		for (int i=0; i < this.baralho.length; i++) {
			if (baralho[i] == null) {
				for (int j=i; j < baralho.length-1; j++) {
					baralho[j] = baralho[j+1];
				}
				baralho[baralho.length-1] = null;
			}
		}
	}
	
}
