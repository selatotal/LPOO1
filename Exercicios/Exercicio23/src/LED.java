
public class LED extends Lampada {

	@Override
	public void mostraEstado() {
		if (this.isLigado()) {
			System.out.println("Lampada LED ligada.");
		} else {
			System.out.println("Lampada LED desligada.");
		}
	}
	
}
