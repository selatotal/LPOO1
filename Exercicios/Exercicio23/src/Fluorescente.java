
public class Fluorescente extends Lampada {

	@Override
	public void mostraEstado() {
		if (this.isLigado()) {
			System.out.println("Lampada Fluorescente ligada.");
		} else {
			System.out.println("Lampada Fluorescente desligada.");
		}
	}
	
}
