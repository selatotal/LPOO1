package pessoa;

public class Pessoa extends Object {
	public String nome;
	public char sexo;

	public Pessoa(String nome, char sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}

	public void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Sexo: " + this.sexo);
	}
}
