
public class DVD extends Produto {

	int duracao;

	public DVD(String nome, double preco, int duracao) {
		super(nome, preco);
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

}
