package carro;

public class Main {

	public static void main(String[] args) {

		Carro carro = new Carro();
		
		carro.setMarca("Fiat");
		carro.setModelo("147");
		carro.setPlaca("FIA-0147");
		carro.numPortas = 5;
		
		System.out.println(carro);
		
		
		Automovel auto = new Automovel();
		System.out.println(auto);
	}

}
