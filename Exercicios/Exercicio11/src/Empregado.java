
public class Empregado {

	private String nome;
	private double salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario < 0){
			this.salario = 0;
		} else {
			this.salario = salario;
		}
	}

	public void aumentaSalario(double percentual){
		if (percentual > 0){
			double aumento = this.salario * (percentual / 100.0);
			this.salario += aumento;
		}
	}
}
