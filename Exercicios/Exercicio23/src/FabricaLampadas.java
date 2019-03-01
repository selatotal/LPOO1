
public class FabricaLampadas {

	public Lampada criaLampada(char tipo) {
		tipo = Character.toUpperCase(tipo);
		switch(tipo) {
		case 'F': return new Fluorescente();
		case 'L': return new LED();
		}
		return null;
	}
	
}
