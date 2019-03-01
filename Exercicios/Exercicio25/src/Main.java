
public class Main {

	public static void main(String[] args) {

		Fruteira fruteira = new Fruteira(2);
		
		Fruta pera = new Fruta();
		Fruta maca = new Fruta();
		Fruta banana = new Fruta();
		
		System.out.println("Adicionando a pera na fruteira");
		fruteira.adiciona(pera);
		System.out.println("Adicionando a pera de novo na fruteira");
		fruteira.adiciona(pera);
		System.out.println("Adicionando a maca na fruteira");
		fruteira.adiciona(maca);
		System.out.println("Adicionando a banana na fruteira");
		fruteira.adiciona(banana);
	}

}
