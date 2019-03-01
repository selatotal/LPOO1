package carro;

public class Carro extends Automovel {
	public int numPortas;
	
	Carro(){
		
	}
	
	Carro(String marca, String modelo, String placa, int numPortas){
		this.numPortas = numPortas;
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPlaca(placa);
	}
	
	@Override
	public String toString() {
		return "Placa: " + this.getPlaca();
	}

}
