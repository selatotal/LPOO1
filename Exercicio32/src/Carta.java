
public class Carta implements Comparable<Carta> {

	private String nome;
	private String naipe;

	public Carta(String nome, String naipe) {
		this.nome = nome;
		this.naipe = naipe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	@Override
	public String toString() {
		if (this.naipe == null) {
			return "Coringa";
		}
		return this.nome + " de " + this.naipe;
	}

	@Override
	public int compareTo(Carta o) {
		if (this.nome.equals(o.nome) && this.naipe.equals(o.naipe)) {
			return 0;
		}
		return -1;
	}

}
