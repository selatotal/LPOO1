
public class Fruteira {

	Fruta[] frutas;
	
	public Fruteira(int tamanho) {
		this.frutas = new Fruta[tamanho];
	}
	
	private boolean estahNaFruteira(Fruta f) {
		for (int i=0; i < frutas.length; i++) {
			if (f == frutas[i]) {
				return true;
			}
		}
		return false;
	}
	
	private int ondeEstah(Fruta comparacao) {
		for (int i=0; i < frutas.length; i++) {
			if (this.frutas[i] == comparacao) {
				return i;
			}
		}
		return -1;
	}
	
	public void adiciona(Fruta f) {
		if (this.estahNaFruteira(f)) {
			System.out.println("Fruta ja esta na fruteira");
			return;
		}
		int posicao = this.ondeEstah(null);
		if (posicao >= 0) {
			this.frutas[posicao] = f;
		} else {
			System.out.println("Fruteira ta cheia");
		}
	}
	
	public void remove(Fruta f) {
		if (!this.estahNaFruteira(f)){
			System.out.println("Fruta nao esta na fruteira!");
			return;
		}
		int posicao = this.ondeEstah(f);
		for (int i=posicao; i < this.frutas.length-2; i++) {
			this.frutas[i] = this.frutas[i+1];
		}
		this.frutas[this.frutas.length-1] = null;
	}
	
	public void listaFrutas() {
		for(Fruta f: this.frutas) {
			System.out.println(f);
		}
	}
	
}
