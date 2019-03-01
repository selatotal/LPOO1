package pessoa;

public class Aluno extends Pessoa {
	private int matricula;

	public Aluno(String nome, char sexo) {
		super(nome, sexo);
	}
	
	public Aluno(String nome, char sexo, int matricula){
		this(nome, sexo);
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Numero Matricula: " + this.matricula);
	}

}
