
public class Tamagochi {

	private String nome;
	private double fome;
	private double saude;
	private int idade;
	
	public Tamagochi(){
		
	}

	public Tamagochi(String nome, double fome, double saude, int idade) {
		this.nome = nome;
		this.fome = fome;
		this.saude = saude;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getFome() {
		return fome;
	}

	public void setFome(double fome) {
		this.fome = fome;
	}

	public double getSaude() {
		return saude;
	}

	public void setSaude(double saude) {
		this.saude = saude;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getHumor(){
		return (fome * -1) + saude;
	}
}
