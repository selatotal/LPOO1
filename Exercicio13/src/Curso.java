
public class Curso {

	private int numero;
	private String nome;
	private Professor professor;

	public Curso(){
		
	}
	
	public Curso(int numero, String nome, Professor professor){
		this.setNumero(numero);
		this.setNome(nome);
		this.setProfessor(professor);
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String exibeDados(){
		return "DADOS DO CURSO: " +
				"\nNumero: " + this.numero +
				"\nNome: " + this.nome + 
				"\nProfessor: " + this.professor.getNumero() + " - " + this.professor.getNome() + "\n";
	}
	
}

