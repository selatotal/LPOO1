
public class CD extends Produto {

	private int numeroFaixas;

	public CD(String nome, double preco, int numeroFaixas) {
		super(nome, preco);
		this.numeroFaixas = numeroFaixas;
	}

	public int getNumeroFaixas() {
		return numeroFaixas;
	}

	public void setNumeroFaixas(int numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
	}

}
