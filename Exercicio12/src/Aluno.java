
public class Aluno {

	private static int alunosMatriculados;
	private String nome;
	private int numeroMatricula;
	private Endereco enderecoResidencial;
	private Endereco enderecoComercial;

	public Aluno(){
		alunosMatriculados++;
	}
	
	public Aluno(String nome, int numeroMatricula){
		this();
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public Endereco getEnderecoResidencial(){
		return enderecoResidencial;
	}

	public void setEnderecoResidencial(Endereco enderecoResidencial){
		this.enderecoResidencial = enderecoResidencial;
	}
	
	public Endereco getEnderecoComercial(){
		return enderecoComercial;
	}

	public void setEnderecoComercial(Endereco enderecoComercial){
		this.enderecoComercial = enderecoComercial;
	}
	
	public static int getAlunosMatriculados(){
		return alunosMatriculados;
	}
}
