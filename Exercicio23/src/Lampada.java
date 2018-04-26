
public class Lampada {

	private boolean ligado;

	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
	public void mostraEstado() {
		if (this.ligado) {
			System.out.println("Lampada ligada.");
		} else {
			System.out.println("Lampada desligada.");
		}
	}
	
	public boolean isLigado() {
		return this.ligado;
	}
}
